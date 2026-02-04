import java.util.*;

public class Reverse {

    public static void main(String[]args){

        ArrayList <String> reverseThis = new ArrayList <String> ();
        reverseThis.add("yahu");
        reverseThis.add("stein");
        reverseThis.add("albert");
        reverseThis.add("da big T");
        reverseThis.add("Johnny mcFace");
        reverseThis.add("furt");
        System.out.println("regular: " + reverseThis);
        ArrayList <String> reversed = new ArrayList <String> ();
        
        for(int i = reverseThis.size() - 1; i >= 0; i--){
            
            
            reversed.add(reverseThis.get(i));

            

        }

        System.out.println("Reversed: " + reversed);
        
    }



}
