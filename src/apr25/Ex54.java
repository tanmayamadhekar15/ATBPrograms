package apr25;

import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from 1-7 to see which it is :");
        int day = sc.nextInt(); // 3
        switch(day) {
            case 1:
                System.out.println("Mon!");
                break;
            case 2:
                System.out.println("Tue!");
                break;
            case 3:
                System.out.println("Wed!"); // Executes
                break;
            case 4:
                System.out.println("Thur!");
                break;
            case 5:
                System.out.println("Fri!");
                break;
            case 6:
                System.out.println("Sat!");
                break;
            case 7:
                System.out.println("Sun!");
                break;
            default:
                System.out.println("Only number 1-7 are allowed");
         }
        sc.close();
    }
}
