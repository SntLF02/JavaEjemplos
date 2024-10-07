import javax.swing.*;

public class OperadoresSwing {
    public static void main(String[] args) {
        String nombre;
        int numero1,numero2;
        double numero3;
        nombre= JOptionPane.showInputDialog("Ingrese su nombre: ");

        numero1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1: "));
        numero2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2: "));
        numero3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero 3: "));
        numero3+=numero1;
        JOptionPane.showMessageDialog(null,"El resultado es " + numero3);
    }
}
