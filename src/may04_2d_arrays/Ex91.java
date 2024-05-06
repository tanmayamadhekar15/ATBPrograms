package may04_2d_arrays;

public class Ex91 {
    public static void main(String[] args) {
        int a[][]= {
                {10, 20},
                {30, 40},
                {50, 70}
        };
        int [][]b;
        int []c[];
        //Enhanced for loop

        for(int arr[]:a){  // iterates for row - Whole array stores in variable a,
                            // then all values from first row stores in 1D array and
                            // then reads through 2nd for loop  and prints
            for(int x:arr){  // iterates for column
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
/*
10 20
30 40
50 70
 */