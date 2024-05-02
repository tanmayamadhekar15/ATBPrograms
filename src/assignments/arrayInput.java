package assignments;

import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        //Array creation using new operator

        Scanner sc=new Scanner(System.in);
        int[] input=new int[3]; //size=3
        System.out.println("Enter marks in Physics :");
        input[0]=sc.nextInt();  //25
        System.out.println("Enter marks in Chemistry : ");
        input[1]=sc.nextInt();  //40
        System.out.println("Enter marks in Maths :");
        input[2]=sc.nextInt();  //50

        //Using for loop, if statement, break keyword
        for(int i=0; i < input.length ; i++){
            if (input[i] < 30 ){
                System.out.println("Failed in subject :" +input[i]);  //25
                break;
            }
            System.out.println(input[i]); //doesn't print as if condition is true it breaks cnd checks for next increment
        }
        sc.close();

    }
}
