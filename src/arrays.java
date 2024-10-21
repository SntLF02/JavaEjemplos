import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int []numeros=new int[6];
        int []notas=new int [10];
        int suma=0;
        double promedio;

        System.out.println("Ingrese 10 numeros:");
        Scanner lectura = new Scanner(System.in);

        for (int i=0;i<notas.length;i++){
            notas[i]= lectura.nextInt();
            suma+=notas[i];
        }
        promedio=(double) suma/(notas.length);

        System.out.println("promedio: " + promedio);
    }
}
