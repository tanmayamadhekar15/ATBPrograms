package assignments;

import java.util.Scanner;

public class palindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String, I will check if it is Palindrome or not :");
        String user_input = sc.next();  //madam

        StringBuilder sb = new StringBuilder(user_input);
        String rev_user_input = sb.reverse().toString();  //madam
        if(user_input.equalsIgnoreCase(rev_user_input)){
            System.out.println("It's Palindrome"); // true
        }else{
            System.out.println("Not palindrome");
        }
    }

}
