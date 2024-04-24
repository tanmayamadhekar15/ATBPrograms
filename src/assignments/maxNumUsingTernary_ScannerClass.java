package assignments;

import java.util.Scanner;

public class maxNumUsingTernary_ScannerClass {
    public static void main(String[] args) {
        //Static inputs
        int x=10, y=20,z=30, temp, largest;
        temp = ( x > y ? x : y ) ;
        largest = ( z > temp ? z : temp ) ;
        System.out.println("Largest number: " + largest);

        // Inputs from user using scanner class and ternary operator
         byte a, b, c, max ;
            Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
            a = s.nextByte();
        System.out.print("Enter the second number: ");
            b = s.nextByte();
        System.out.print("Enter the third number: ");
            c = s.nextByte();
        byte result=(a>b ? a : b);
        max=(c > result ? c : result);
        System.out.println("Maximum number is : " +max);

        // Maximum number using Math class
        float l,m,n;
        Scanner sf=new Scanner(System.in);
        System.out.println("First number : ");
        l=sf.nextFloat();
        System.out.println("Second number : ");
        m=sf.nextFloat();
        System.out.println("Third number :");;
        n=sf.nextFloat();
        float mathResult=(Math.max(l,m));
        float mathMax=(Math.max(n, mathResult));
        System.out.println("Maximum number using Math : " +mathMax);


    }


}
