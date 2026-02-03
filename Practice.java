import java.util.ArrayList;

//seashellseabed
//2/2/26
//Wrappedclass

public class Practice{

    public static void main(String[]args){
        Double d = 40.3;
        Integer i = 30;

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        int newInt = i;
        Double newDouble = d;

        System.out.println(newInt * newDouble);

        ArrayList<String> list = new ArrayList <String> ();

        list.add("Micheal");
        list.add("Jessica");
        list.add("Lee");
        System.out.println(list);
        list.add(1, "Sarah");
        System.out.println(list);
        String store = list.set(2, "Mary");
        String store2 = list.get(3);
        String store3 = list.remove(1);
    }
    
}