public class PracticeTwoEnhanced {

    public static void main(String[]args){

        int[][]arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        findRowAv(arr);

    }

    public static void findRowAv(int[][]array){
        int sum = 0; 
        int count = 0;
        int tempsum = 0;
        for(int[] row : array){
            for(int num : row){
                
                tempsum = tempsum + array[row][num];


            }
            System.out.println("row " + row + " sum: " + tempsum);

            tempsum = 0;
 
        }

        System.out.println("average of all sums: " + (double)sum / array.length);
    }
    
}
