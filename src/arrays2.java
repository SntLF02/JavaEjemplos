
import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args) {
        int A[],B[],C[];
        A=new int[4];
        B=new int[4];
        C=new int[4];

        cargarArreglo(A);
        cargarArreglo(B);
        sumarArreglo(A,B,C);
        System.out.println("Arreglo A:");
        mostrarArreglo(A);
        System.out.println("Arreglo B:");
        mostrarArreglo(B);
        System.out.println("Arreglo A+B:");
        mostrarArreglo(C);
    }
    public static void cargarArreglo(int[] arreglo){
        Scanner lectura = new Scanner(System.in);
        for (int i=0;i<arreglo.length;i++) {
            arreglo[i] = lectura.nextInt();
        }
    }
    public  static void sumarArreglo(int[] arreglo1,int[]arreglo2,int[]arreglo3){
        for (int i=0; i<arreglo3.length;i++){
            arreglo3[i]=arreglo1[i]+arreglo2[i];
        }
    }
    public static void mostrarArreglo(int[]arreglo){
        System.out.print("[ ");
        for (int i:arreglo){
            System.out.print(i+" ");
        }
        System.out.println("]");
    }
}


