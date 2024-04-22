package assignments;

import java.util.Scanner;

public class maxNumUsingLogicalRelationalOperator {
    public static void main(String[] args) {
        //Maximum  number using if else if statement
        double a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = s.nextInt();
        System.out.print("Enter the second number: ");
        b = s.nextInt();
        System.out.print("Enter the third number: ");
        c = s.nextInt();
        if ( a > b && a > c) // Logical AND operator (&&) , Relational (>) When both true, then only statement executes
        {
            System.out.println("Largest number: " + a);
        }
        else if ( b > a && b > c )
        {
            System.out.println("Largest number: " + b);
        }
        else if ( c > a && c > b )
        {
            System.out.println("Largest number: " + c);
        }
        else
        {
            System.out.println("All are same");
        }
    }
}
