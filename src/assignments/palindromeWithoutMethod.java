package assignments;

import java.util.Scanner;

public class palindromeWithoutMethod {
    public static void main(String[] args) {
        //To check palindrome or not without in built method, using reverse technique
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string / number to check palindrome or not: ");
        String s = sc.nextLine();
        int length = s.length();
        String reverse = "";

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        System.out.println("Reverse string / number = " + reverse);

        if (s.equals(reverse))   //check
            System.out.println("Palindrome");
        else
            System.out.println(" Not Palindrome");

        //While loop -  use temporary variable

        int temp, sum=0, remainder;
        System.out.println("Enter number to check :");
        int number=sc.nextInt();
        temp=number;

        while(number>0) {
            remainder = number % 10;  //1
            sum = (sum * 10) + remainder;
            number = number / 10;
        }

        if(temp==sum) {
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number isn't palindrome");
        }
    }
}
/*
Enter string / number to check palindrome or not: mom
Reverse string / number = mom
Palindrome
Enter number to check :
1234321
Number is palindrome
 */
