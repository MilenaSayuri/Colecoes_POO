public class VetorDinamico {
    private int qtde;
    private int cap;
    private int [] elementos;
    private static final int LIMIAR_DE_CORTE = 4;

    public VetorDinamico(){
        qtde = 0; //posição
        cap = LIMIAR_DE_CORTE;
        elementos = new int[cap];
    }

    public void adicionar(int e){
        if (estaCheio()){
            aumentarCapacidade();
        }
        elementos[qtde] = e;
        qtde++;
    }

    public void remover(){
        if(!estaVazio())
            qtde--;
        if (qtde > LIMIAR_DE_CORTE && qtde <= (cap / 4))
            reduzirCapacidade();
    }

    public boolean estaVazio(){
        return qtde == 0;
    }

    public boolean estaCheio(){
       //if (qtde == cap){
            //return true;
            //return false;
       //return qtde == cap? true : false;
       return qtde == cap;
        }
    

    //finalidade: calcular a representação textual dos objetos dessa classe
    //isso é ums subrescrita de metodo, do ingles override
    //personalizamos o funcionamento desse método
    public String toString(){
        //String resultado = "";
        StringBuilder sb = new StringBuilder("");
        //for(int e : elementos){
            // resultado = resultado + e + " ";
            // sb.append(e).append(" ");
            // }
        for (int i = 0 ; i <qtde; i++)
        sb.append(elementos[i]).append(" ");
        return String.format(
            "Qtde: %d, Cap %d\nElementos: %s",qtde, cap, sb.toString()
        );
    }

    private void reduzirCapacidade(){
        //alcar um vetor auxiliar com a metade da capacidade
        int [] aux = new int [cap / 2]; //no momento ele continua valendo o mesmo valor 8 por exemplo
        // copiar todo mundo de elementos para o valor auxiliar 
        for ( int i = 0; i < qtde; i++){
            aux [i] = elementos [i];
        }
        // cortar o valor de cap pea metade 
        cap = cap / 2; //aqui nós indica que ele esta valendo a metade realmente, valendo agora 4
        // ajustar elementos para que ele referencie o vetor referenciado por aux 
        elementos = aux;
    }
    
    private void aumentarCapacidade(){
        //1. Alocar um vetor auxiliar com o dobro de capacidade
        int [] aux = new int [cap * 2];
        //2. Copiar todo mundo de elementos para o vetor auxilar 
        for (int i = 0; i < qtde; i++){
            aux[i] = elementos[i];
        }
        //3. Dobrar o valor de cap 
        cap *= 2;
        //4. Ajustar elementos para que ele referencie o vetor referenciado por aux  
        elementos = aux;
    }
}
