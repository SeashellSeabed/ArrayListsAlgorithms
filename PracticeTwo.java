public class PracticeTwo {

    public static void main(String[]args){

        int[][]arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        findRowAv(arr);

    }

    public static void findRowAv(int[][]array){
        int sum = 0; 
        int count = 0;
        int tempsum = 0;
        int tempcount = 0;
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                
                tempsum = tempsum + array[row][col];
                tempcount++; 

            }
            System.out.println("row " + row + " sum: " + tempsum);
            sum = sum + tempsum;
            count++;

            tempsum = 0;
            tempcount = 0; 
        }

        System.out.println("average of all sums: " + (double)sum / count);
    }
    
}
