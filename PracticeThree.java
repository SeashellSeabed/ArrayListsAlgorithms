import java.security.PublicKey;
import java.util.*;
public class PracticeThree {

    public static void main(String[]args){

        String [][] array = { {"Jack","Jill", "Jane", "Joey"}, {"Maura","Molly","Mason","Maureen"}, {"Emma","Eileen","Elizabeth","Emma"}};
        System.out.println(Arrays.deepToString(shortenMe(array)));
        System.out.println(countduplicates(array)); 
        System.out.println(Arrays.deepToString(shiftMe(array)));
        
    }

    public static String[][] shortenMe(String[][]arr){
        String[][] array = new String[arr.length][arr[0].length];
        for(int row = 0; row < arr.length; row++){

            for(int col = 0; col < arr[0].length; col++){
                array[row][col] = arr[row][col].substring(0,3); 
                
            }
        }

        return array; 
    }

    public static int countduplicates(String[][] array){
        int maxDuplicates = -1;
        int maxRow = -1;
        for(int row = 0; row < array.length; row++){
            int duplicates = 0;
            for(int col = 0; col < array[0].length; col++){

                for(int i = col + 1; i < array[row].length; i++){
                    if(array[row][col] == array[row][i]){
                        duplicates++; 
                    }
                }
            }
            if(duplicates > 0){
                if(duplicates > maxDuplicates){
                    maxDuplicates = duplicates;
                    maxRow = row;
                }
            }
        }
        return maxRow; 
    }

    public static String[][] shiftMe(String[][] arr) {
    int rows = arr.length;
    int cols = arr[0].length;
    
    String last = arr[rows - 1][cols - 1]; 
    
    
    for (int row = rows - 1; row >= 0; row--) {
        for (int col = cols - 1; col >= 0; col--) {
            if (row == 0 && col == 0) {
                arr[row][col] = last; 
            } else if (col == 0) {
                arr[row][col] = arr[row - 1][cols - 1]; 
            } else {
                arr[row][col] = arr[row][col - 1]; 
                }
            }
        }
    
        return arr;
    }
}

