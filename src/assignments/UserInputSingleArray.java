package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputSingleArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int array_size=sc.nextInt();  // 5

        int []array=new int[array_size];
        System.out.println("Enter elements of array :"); // 10,20,30,40,50
        for(int i=0;i<array_size;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<array_size;i++){
            System.out.print("Array elements as :" +array[i] + " ");
        }
        System.out.println("Elements in array are :"+Arrays.toString(array));
        sc.close();
    }
}
/*
Enter size of array :
5
Enter elements of array :
10
20
30
40
50
Array elements as : 10 20 30 40 50
Elements in array are :[10, 20, 30, 40, 50]
 */