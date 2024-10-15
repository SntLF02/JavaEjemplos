import javax.swing.*;
import java.util.Random;

public class ejemploDoWhile {
    public static void main(String[] args) {
        int nota,intentos=0;
        Random numRandom= new Random();

        do {
            intentos++;
            nota= numRandom.nextInt(0,10);

            JOptionPane.showMessageDialog(null,"Nota del examen: " + nota + "\nIntentos n° "+ intentos +" de 4");
        } while (intentos<4 && nota<6);


        if (nota >= 6) {
            JOptionPane.showMessageDialog(null,"Aprobado, Que tenga un buen dia!");
        } else {
            JOptionPane.showMessageDialog(null,"Reprobado, Debe recursar la materia");
        }
    }
}
