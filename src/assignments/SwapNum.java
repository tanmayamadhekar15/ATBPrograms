package assignments;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        //Swapping numbers using a temporary variable as temp
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values x and y :" );
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Before Swapping :x = "+x+ ", y = " +y);
        int temp=x;
        x=y;
        y=temp;
        System.out.println("After swapping : x =" +x+ ", y = " +y);
        System.out.println("Using function -");
        //function code
        int a=20,b=15;
        System.out.println("Before swapping: a = "+ a + ",b = "+ b);
        swapNumber(a,b); //calling function
    }
    //swap function
     static void swapNumber(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

/*
Enter values x and y :
10
20
Before Swapping :x = 10, y = 20
After swapping : x =20, y = 10
Using function -
Before swapping: a = 20,b = 15
After swapping: a = 15, b = 20
 */
