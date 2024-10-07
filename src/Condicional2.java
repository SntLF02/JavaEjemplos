import javax.swing.*;

public class Condicional2 {
    public static void main(String[] args) {
        int menu;
        menu = Integer.parseInt(JOptionPane.showInputDialog("1-Cafe con tortitas\n 2-Cafe con medialunas\n 3-Gaseosa con sandwich\n -Elija opcion"));
        switch (menu){
            case 1:
                JOptionPane.showMessageDialog(null,"son $1000");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Son $5000");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Son $7000");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcion erronea");

        }
    }
}
