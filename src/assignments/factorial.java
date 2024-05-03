package assignments;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        //Factorial
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to find factorial of:");
        int n=sc.nextInt();  // 5

        int fact=1;
        for(int i=1; i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial is :"+fact);  //120 =5*4*3*2*1
        sc.close();
    }
}
