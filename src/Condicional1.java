import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args) {
        int edad;
        String examenvisual="OK";
        boolean examen;

        Scanner lectura= new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad=lectura.nextInt();
        System.out.println("Ingrese true si aprobo el examen, de lo contrario false: ");
        examen=lectura.nextBoolean();

        if (edad>=18 && examenvisual.equals("OK") && examen==true){
            System.out.println("Habilitado para sacar el carnet");
        } else {
            System.out.println("No habilitado para sacar el carnet");
        }
    }
}
