package assignments;

public class transposeArray {
    public static void main(String[] args) {
        int[][] given_array = {
                {1,4,7} ,
                {2,5,8} ,
                {3,6,9}
        };

        int[][] tranpose_array = new int [3][3];
        for ( int i=0; i< given_array.length; i++){
            for(int j=0; j< given_array.length; j++){
                tranpose_array[i][j] = given_array[j][i];  //Transposed
            }
        }
        System.out.println(" Given Array as : ");
        for ( int i=0; i< given_array.length; i++){
            for(int j=0; j< given_array.length; j++){
                System.out.print(given_array[i][j] + " "); //Printing of given array
            }
            System.out.println();
        }
        System.out.println(" Transpose Array as : ");
        for ( int i=0; i< given_array.length; i++){
            for(int j=0; j< given_array.length; j++){
                System.out.print(tranpose_array[i][j] + " "); //printing of transpose array
            }
            System.out.println();
        }
    }
}
