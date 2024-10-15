import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    public static void main(String[] args) {
        interfas();

    }


    public static void interfas(){

        List<String> operadores = new ArrayList<>();
            operadores.add(" + ");
            operadores.add(" - ");
            operadores.add(" x ");
            operadores.add(" / ");

        double numero1=0,numero2=0;
        int opcion=5;
        boolean x;

        do {

            if (opcion==5) {
                x=true;
                while (x){
                    try{
                        numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
                        numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
                        x=false;
                    } catch (Exception e){
                        JOptionPane.showMessageDialog(null,"Error al ingresar datos");
                    }
                }
            }


            do {

                try {
                    opcion=Integer.parseInt(JOptionPane.showInputDialog("_____Calculadora_____\n...\n-Numero 1: " + numero1 + "     -Numero 2: " + numero2 + "\nIndique la opcion que desee:\n...\n[1]_Sumar\n[2]_Restar\n[3]_Multiplicar\n[4]_Dividir\n...\n[5]_Ingresar otros numeros\n[6]_Salir "));

                    if (opcion<1 || opcion>6){
                        JOptionPane.showMessageDialog(null,"Opcion incorrecta");
                    }
                } catch (Exception e) {
                    opcion=0;
                    JOptionPane.showMessageDialog(null, "Error al ingresar datos");

                }


            } while (opcion<1 || opcion>6);

            if (opcion>=1 && opcion<=4){
                JOptionPane.showMessageDialog(null, numero1 + operadores.get(opcion-1) + numero2 + " = " + opciones(opcion,numero1,numero2));
            }



        } while (opcion!=6);

        JOptionPane.showMessageDialog(null,"Cerrando programa, que tenga un lindo dia!");
    }

    public static double opciones(int opcion, double numero1, double numero2){
        double resultado;

        switch (opcion){

            case 1:
                resultado=numero1+numero2;
                break;
            case 2:
                resultado=numero1-numero2;
                break;
            case 3:
                resultado=numero1*numero2;
                break;
            case 4:
                resultado=numero1/numero2;
                break;
            default:
                resultado=0;
        }
        return resultado;
    }
}
