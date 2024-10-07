import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        int a,b,c,i;
        Scanner lectura= new Scanner(System.in);
        //new crear espacio nuevo en la memoria
        System.out.println("Ingrese un valor para a: ");
        a= lectura.nextInt();
        System.out.println("Ingrese un valor para b: ");
        b= lectura.nextInt();
        System.out.println("Ingrese un valor para c: ");
        c= lectura.nextInt();
        //nexint especificar que tipo de dato se va a ingresar
        i=1;

        a=a+(++i);
        System.out.println("El valor de a es " + a);
        a=a+(i++);
        System.out.println("El valor de a es " + a);
        b=b+(--i);
        System.out.println("El valor de b es " + b);
        c=c+(i--);
        System.out.println("El valor de c es " + c);



    }
}