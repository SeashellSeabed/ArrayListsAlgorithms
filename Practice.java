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
        int s = list.size();



        ArrayList<String> names = new ArrayList <String> (); //ArrayList used names get[i]
        names.add("albert");
        names.add("dabigstein");
        names.add("da'yahu");
        int index = 0;
        for(int in = 0; i < names.size(); in++){

            names.get(in);
        }
        System.out.println(names);
        

        while ( index < names.size()){

            

            if(names.get(index).substring(0,1).equals("d")){
                names.set(index, "oooogre");
            }

            index++;

        }

        System.out.println(names);






}




    }