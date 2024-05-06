package assignments;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        //Reverse string using for loop
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string to reverse using increment operator:");
        String str=sc.nextLine();

        String rev="";
        for (int i = 0; i < str.length(); i++) {
            rev =  str.charAt(i) + rev ;
        }
        System.out.println("Reversed string :" +rev);

        System.out.println("Enter string to reverse using decrement operator :");
        String str1=sc.nextLine();
        String reverse="";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reverse = reverse + str1.charAt(i);
        }
        System.out.println("Reversed string :"+reverse);

        }
    }

/*
Enter string to reverse using increment operator:
hello
Reversed string :olleh
Enter string to reverse using decrement operator :
automation
Reversed string :noitamotua
 */