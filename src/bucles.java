import javax.swing.*;


public class bucles {
    public static void main(String[] args) {
        String password = "", contrasenia = "UTN";
        int intentos = 0;

        while (!password.equals(contrasenia) && intentos < 3) {

            password = JOptionPane.showInputDialog("Ingrese la contraseña: ");
            intentos++;

            password = password.toUpperCase();

            if (!password.equals(contrasenia)) {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta, intentos restantes " + (3 - intentos));
            }

        }

        if ((intentos==3) && !password.equals(contrasenia)) {
            JOptionPane.showMessageDialog(null, "Acceso Bloqueado");
        } else {
            JOptionPane.showMessageDialog(null, "Acceso correcto, que tenga un buen dia!");

        }
    }
}
