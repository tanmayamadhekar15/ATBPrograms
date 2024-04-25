package assignments;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int num = 11;
        if(num%2 == 0){
            System.out.println("Even :" +num);
        }
        else{
            System.out.println("Odd : " +num);
        }

        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to check if it's even or odd :");
        int no=s.nextInt();

        if (no % 2 ==0 ){
            System.out.println(no + " " +"is an even");
        }
        else {
            System.out.println(no + " " +"is a odd");
        }
    s.close();
    }
}
