import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Integer.parseInt;
public class ExemplosVetores{
    public static void main(String[] args) {
        //vetor de ints
        int [] v; //vetor sao objetos
        v = new int [4];
        //v[0] = 2;
        //v[1] = 4;
        //v[2] = 9;
        //v[3] = 1;
        for(int i = 0; i < 4; i++){
            try{ //como se fosse um if 
                v[i] = parseInt(showInputDialog("Digite um numero: "));
            }
            catch(NumberFormatException e){ //como se fosse um else
                showMessageDialog(null, "Jovem, digite um numero");
                System.out.println(e.getMessage());
                e.printStackTrace();
                --i;
            }
        }
        System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);
        System.out.println(v[3]);
    }
}