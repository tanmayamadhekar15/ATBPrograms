package apr27;

import java.util.Scanner;

public class Ex71 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = s.nextDouble();
        System.out.print("Enter the second number: ");
        b = s.nextDouble();
        System.out.print("Enter the third number: ");
        c = s.nextDouble();
        if ((a >= b) && (a >= c)) {
            System.out.println(a); //30 20  10
        }
        else if ((b >= a) && (b >= c)){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}
