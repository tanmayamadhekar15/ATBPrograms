package assignments;

import java.util.Scanner;

public class MaxBetweenTwo {
    public static void main(String[] args) {
        System.out.println("Enter first number :");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(); // -10
        System.out.println("Enter second number");
        int num2 = sc.nextInt(); // 10
        int max = Math.max(num1, num2); // using math function
        System.out.println("Maximum number by Math.max :  " + max); // 10

        System.out.println("\n Enter two numbers to find max among them :");
        int no1=sc.nextInt(); // 40
        int no2=sc.nextInt(); // 40
        if (no1 == no2) {
                System.out.println("Both are same");
            }
            else if ((no1 > no2) && (no1 != no2)) {
                System.out.println("Max is -> " + no1);
            }
            else {
                System.out.println("Max is -> " + no2);
            }

        sc.close();
    }


}

