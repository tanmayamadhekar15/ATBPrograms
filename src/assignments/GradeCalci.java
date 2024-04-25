package assignments;

import java.util.Scanner;

public class GradeCalci {
    public static void main(String[] args) {
        // Program to Check Grade Based on Marks
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks :");
        int marks = sc.nextInt();
        marks = marks/10; // return Quotient  99/10 =9, 83/10 =8

        switch (marks) {
            case 9:
                System.out.println("A"); // 95
                break;
            case 8:
                System.out.println("B"); // 82
                break;
            case 7:
                System.out.println("C"); // 71
                break;
            case 1:
                System.out.println("F"); // 46
                break;
            default:
                System.out.println("None"); // -10
        }

        }
}
