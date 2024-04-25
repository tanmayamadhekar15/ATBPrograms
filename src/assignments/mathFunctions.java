package assignments;

import java.util.Scanner;

public class mathFunctions {
    public static void main(String[] args) {
        //Math class has functions as cbrt(), pow(),abs(),sqrt()

        double x = 10,y = 12.4f,z = 56.78f;
        double result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println("Result is : " +result); // 5.818450871146421

        //using scanner, Explicit casting(manually) to byte as math returns in double

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of a, b, c :");
        byte a=sc.nextByte(),b=sc.nextByte(),c=sc.nextByte(); //10, 12, 56

        byte res= (byte) Math.cbrt(Math.pow(a,2)+Math.pow(b,2)-Math.abs(c)); //Narrowing -double to byte
        System.out.println("Result is : " +res);
        sc.close();

    }
}
