import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String>nombres= new ArrayList<>();
        nombres.add("Santiago");
        nombres.add("pepe");

        for (String i:nombres){
            System.out.println(i);
        }

        nombres.remove(1);

        for (String i:nombres){
            System.out.println(i);
        }

        System.out.println(nombres.contains("pepe"));

        for (int i=0;i<nombres.size();i++){
            System.out.println(nombres.get(i));
        }
    }
}
