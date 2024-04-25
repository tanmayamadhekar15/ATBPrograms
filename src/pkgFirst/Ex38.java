package pkgFirst;

import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        //Find maximum number
        System.out.println("Enter first number : ");
        Scanner sc=new Scanner(System.in);
        int first =sc.nextInt();

        System.out.println("Enter second number : ");
        int second =sc.nextInt();

        if(first < second){
            System.out.println("Max num is :" + second);

        }else{
            System.out.println("Max num is :" +first);
        }

        int max=(Math.max(first,second));
        System.out.println("Max using math function : " +max);

    }
}
