package assignments;

import java.util.Scanner;

public class PositiveNegativeNum {
    public static void main(String[] args) {
        // Take user input using Scanner class
        //Relational operator, if else if ladder

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find :");
        int num=sc.nextInt(); // -128

        if(num>0){
            System.out.printf ("%d is positive", +num);
        }else if (num<0){
            System.out.printf ("%d is negative", +num); // -128
        }else {
            System.out.println("Number is neither positive nor negative, but zero");
        }

        //Using if else statement and relational operator(>=,<=), logical (&&)
        Scanner s=new Scanner(System.in);
        System.out.println("\n Enter a number  :");
        byte no=s.nextByte(); // 0

        if ((no>=0) && (no<=0)){
            System.out.println("Number is zero"); // 0
        }
        else
        {
            if(no>0){
                System.out.println("Number is positive");
            }
            else {
                System.out.println("Number is negative");
            }
        }


    }
}
