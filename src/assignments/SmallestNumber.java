package assignments;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a<b && a<c ){
            System.out.println(a+ " " +"is a smallest number");
        }else if(b<c && b<a){
            System.out.println(b+ " " +"is a smallest number");
        }else if(c<a && c<b){
            System.out.println(c+ " " +"is a smallest number");
        }else {
            System.out.println("All are same");
        }
    }
}
