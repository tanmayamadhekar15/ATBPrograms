package assignments;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        //Using if else
        char ch = 'e';
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is a vowel"); // vowel
        else
            System.out.println(ch + " is a consonant");

        //switch statement
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a character to check it's vowel or consonant :");
        char c=s.next().charAt(0); // t ,  e
        switch (c){
            case 'a','e','i','o','u' -> System.out.println(c + " " + "is a vowel"); // e is a vowel
            default -> System.out.println(c + " " +"is a consonant"); //t is a consonant

        }

    }
}
