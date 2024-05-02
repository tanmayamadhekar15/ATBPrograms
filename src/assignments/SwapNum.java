package assignments;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        //Swapping numbers using a temporary variable as temp
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values x and y :" );
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Before Swapping :"+x+ " " +y);
        int temp=x;
        x=y;
        y=temp;

        System.out.println("After swapping :" +x+ " " +y);
    }
}
