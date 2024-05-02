package assignments;

import java.util.Arrays;

public class doubleArrayValues {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] res=new int[4]; //declared empty array
        System.out.println(arr.length);  //  4

        for(int i=0; i < arr.length; i++){
            int result=arr[i]*2;  // calculated double of array values and stored in a variable
            System.out.println(result);   // { 2, 4, 6 ,8}
            res[i]=result;  // stored in a variable
            System.out.println("Doubles array values are :"+ Arrays.toString(res));  //used method to print
        }

    }
}
