package assignments;

import java.util.Scanner;

public class maxNumUsingIfElse {
    public static void main(String[] args) {
        //Maximum number using if else
        byte x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  first number: ");
        x = sc.nextByte(); //-128
        System.out.print("Enter second number: ");
        y = sc.nextByte(); // 23
        System.out.print("Enter third number: ");
        z = sc.nextByte(); // 0
        if ( x > y ) // Relational(>)
        {
            if ( x > z )
            {
                System.out.println("Max number: " + x);
            }
            else
            {
                System.out.println("Max number: " + z);
            }
        }
        else
        {
            if ( y > z )
            {
                System.out.println("Max number: " + y); // 23
            }
            else
            {
                System.out.println("Max number: " + z);
            }
        }

    }
}
