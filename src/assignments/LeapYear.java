package assignments;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        //Using if else
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year to check if it is leap year or not :");
        int year =sc.nextInt(); //2024 is a leap year

        if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0))
        {
            System.out.println( year + " is a leap year."); //executes
        }
        else
        {
            System.out.println( year + " is not a leap year.");
        }

        // Ternary operator
        String leapYearOrNot;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter year to check if it is leap year or not :");
        int year1 =s.nextInt(); //2034 not a leap year

        leapYearOrNot = (year1 % 4 == 0 && (year1 % 100 != 0 || year1 % 400 == 0)) ? "Leap year" : "Not a leap year";

        System.out.println(year1 + " " + leapYearOrNot + ".");
    }
}
