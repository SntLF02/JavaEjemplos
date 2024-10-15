import javax.swing.*;

public class ejemploProcesimientos {
    public static void main(String[] args) {
        int numero1,numero2;

        String nombre="Santiago";
        procedimiento(nombre);


        numero1=leerNumero();
        numero2=leerNumero();

        JOptionPane.showMessageDialog(null, numero1 + " + " + numero2 +" = "+ sumarNum(numero1,numero2));
    }

    public static void procedimiento(String nombre) {
        System.out.println("hola "+nombre);

    }

    public static int leerNumero(){
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
        return numero;
    }

    public static int sumarNum(int numero1,int numero2){
        int resultado;
        resultado=numero1+numero2;
        return resultado;
    }
}
