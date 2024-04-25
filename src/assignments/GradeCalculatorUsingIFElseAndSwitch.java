package assignments;

import java.util.Scanner;

public class GradeCalculatorUsingIFElseAndSwitch {
    public static void main(String[] args) {
        // Grade Calculator
        // Write a program that calculates and displays the letter grade for a given
        // numerical score (e.g., A, B, C, D, or F) based on the following
        // grading scale: A(90-100), B(80-89), C(70-79), D(60-69), F(0-59)
        // 1. Find the user Inputs
        // score - data type? - int
        // return -> grade -> data type -> char
        // 2. Basic Logic
        // if ( score >= 90 && score <= 100 ) -> return or print grade - A
        // else if score <=89 && score >= 80 -> return or print grade - B
        // else -> grade -> F

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Score!!");
        int score = sc.nextInt();
        char grade='F';
        if(score >=90 && score <=100){
            grade = 'A';
        }else if(score >=80 && score <=89){
            grade = 'B';
        }else if (score >= 70 && score <= 79) {
            grade = 'C';
        }else if (score >= 60 && score <= 69) {
            grade = 'D';
        }else if( score <=0 && score > 100){
            System.out.println("You are genious");
        }else{
            grade ='F';
        }
        System.out.println("Your Grade is -> "+grade);

        //using switch statement
        System.out.println("Enter marks obtained :");
        int marks=sc.nextInt();
        switch(marks) {
            case 'A':
                if (marks >= 90 && marks <= 100) {
                    grade = 'A';
                }
            case 'B':
                if (marks >= 80 && marks <= 89) {
                    grade = 'B';
                }

                sc.close();

        }
    }
}
