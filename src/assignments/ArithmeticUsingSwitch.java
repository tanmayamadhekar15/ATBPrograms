package assignments;

import java.util.Scanner;

public class ArithmeticUsingSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input1 :");
        int input1=sc.nextInt(); //5
        System.out.println("Enter input2 :");
        int input2=sc.nextInt(); //10
        System.out.println("Choose arithmetic operation to be performed (+, -, *, /, %):");
        char op=sc.next().charAt(0);

        /*Switch is a statement, used instead of multiple if else
        Value of the expression(switch(expression)) is compared with the values of each case.
        If there is a match, the associated block of code is executed.
        */

        switch (op){
            case '+' : int add=input1+input2;
                System.out.println(add); // 15
                break;
            case '-' : int sub=input1-input2;
                System.out.println(sub); // -5
                break;
            case '*' :
                System.out.println("Mult :" +( input1*input2)); // 50
                break;
            case '/' :
                System.out.println("Division :" +input1/input2); // 0
                break;
            case '%' : int mod=input1%input2;
                System.out.println(mod); // 5
                break;
            default:
                System.out.println("Not arithmetic operator");  // =

        }
        sc.close();
    }
}
