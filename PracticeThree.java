import java.util.*;
public class PracticeThree {

    public static void main(String[]args){

        String [][] array = { {"Jack","Jill", "Jane", "Joey"}, {"Maura","Molly","Mason","Maureen"}, {"Emma","Eileen","Elizabeth","Emma"}};
        System.out.println(shortenMe(array)); 
        
    }

    public static String[][] shortenMe(String[][]arr){
        String[][] array = new String[arr.length][arr[0].length];
        for(int row = 0; row < arr.length; row++){

            for(int col = 0; col < arr[0].length; col++){
                array[row][col] = arr[row][col].substring(0,3); 
                System.out.println(arr[row][col]);
            }
        }

        return array; 
    }
    
}
