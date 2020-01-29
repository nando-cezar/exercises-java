import javax.swing.JOptionPane;
 
public class NameDialog {
    
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Qual seu nome?"); // Painel de Dialogo, disponivel através da classe JOptionPane. (Valor armazenado na variavel String name).
        
        String message = String.format("Bem Vindo, %s !!!" , name);// Print através do metodo format;
        
        JOptionPane.showMessageDialog(null, message);
    }
}
