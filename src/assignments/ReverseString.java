package assignments;

import java.util.Scanner;

import static assignments.Function.reverseString;

public class ReverseString {
    public static void main(String[] args) {
        //Approach 1 :Reverse string using for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to reverse using increment operator:");
        String str = sc.nextLine();

        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev;
        }
        System.out.println("Reversed string :" + rev);
        //Approach 2 :
        System.out.println("Enter string to reverse using decrement operator :");
        String str1 = sc.nextLine();
        String reverse = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reverse = reverse + str1.charAt(i);
        }
        System.out.println("Reversed string :" + reverse);

        //Aproach 3 : Without using string method
        String name = "Testing";
        String reverse_str = "";
        char array[] = name.toCharArray(); // Stores string into single character array
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse_str = reverse_str + array[i];
        }
        System.out.println(reverse_str); // gnitseT

        //Approach 4 : Using StringBuffer class
        StringBuffer sb = new StringBuffer("Automation");
        System.out.println("Reverse String using StringBuffer : " + sb.reverse()); // noitamotuA

        //Approach 5 : USing StringBuilder class
        StringBuilder str_build = new StringBuilder("BuilderClass");
        System.out.println("Reverse String using stringbuilder :" + str_build.reverse());

        //Approach 6 -calling function
        reverseStr();
    }
    static void reverseStr(){
        StringBuilder st=new StringBuilder("Welcome");
        System.out.println(st.reverse()); // emocleW
    }
}



/*
Enter string to reverse using increment operator:
string
Reversed string :gnirts
Enter string to reverse using decrement operator :
welcome
Reversed string :emoclew
gnitseT
Reverse String using StringBuffer : noitamotuA
Reverse String using stringbuilder :ssalCredliuB
emocleW
 */