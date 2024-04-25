package assignments;

import java.util.Scanner;

public class maxNumUsingLogicalRelationalOperator {
    public static void main(String[] args) {
        //Maximum  number using if else if statement
        double a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = s.nextDouble();
        System.out.print("Enter the second number: ");
        b = s.nextDouble();
        System.out.print("Enter the third number: ");
        c = s.nextDouble();

        //Using if else Logical AND operator (&&) , Relational (>) When both true, then only statement executes
        if ((a == b) && (b == c) && (a == c)){
            System.out.println("All are same");

        }else {
            if ((a > b) && (a > c)) {
                System.out.println(a); //30 20  10
            }
            else if ((b > a) && (b > c)){
                System.out.println(b);
            }
            else if ((c > a) && (c > b)){
                System.out.println(c);
            }
        }


    }
}
