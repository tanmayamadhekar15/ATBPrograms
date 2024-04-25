package pkgFirst;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex37
{
    public static void main(String[] args) {
        //Taking an input from user using  Scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        if(num%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
