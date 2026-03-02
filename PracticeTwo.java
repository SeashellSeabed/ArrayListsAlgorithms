import java.util.*;
public class PracticeTwo {

    public static void main(String[]args){

        int[][]arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println("minRowAvg: " + findMinRowAvg( arr));
        System.out.println("findRowAv: " +findRowAv(arr));

    }

    public static int findRowAv(int[][]array){
        ArrayList<Integer> count = new ArrayList<Integer>();
        int totalSum = 0;
        int avg = 0;
        

        for(int row = 0; row < array.length; row++){

            for(int col = 0; col < array[0].length; col++){

                avg += array[row][col];
            }

            count.add(avg);
            avg = 0;
        }

        System.out.println(count);

        for(int nums : count){

            totalSum += nums;
        }

        return totalSum; 
    }

    public static int findMinRowAvg(int[][]array){

        ArrayList<Integer> minimums = new ArrayList<Integer>();
        int totalSum = 0;
        int avg = 0;

        for(int row = 0; row < array.length; row++){

            int min = array[row][0];

            for(int col = 0; col < array[0].length; col++){

                if(array[row][col] < min){

                    min = array[row][col];

                }
            }
            minimums.add(min);
        }

        System.out.println(minimums);

        for(int num : minimums){

                totalSum += num; 

        }

        avg = totalSum / minimums.size(); 
        
        return avg;
    }

    
}
