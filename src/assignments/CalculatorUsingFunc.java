package assignments;

import java.util.Scanner;

public class CalculatorUsingFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        //Calling of function
        int r_sum = sum(num1,num2);
        System.out.println("Sum -> " + r_sum); // Reuse of code(Add)
        int r_sub = sub(num1,num2);
        System.out.println("Sub -> " + r_sub);
        int r_mul = mul(num1,num2);
        System.out.println("Mul -> " + r_mul);
        int r_div = div(num1,num2);
        System.out.println("Div -> " + r_div);
 }
    static int sum(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int mul(int a,int b){
        return a*b;
    }
    static int div(int a,int b){
        return a/b;
    }
}
/*
Enter first number :
20
Enter second number :
10
Sum -> 30
Sub -> 10
Mul -> 200
Div -> 2
 */
