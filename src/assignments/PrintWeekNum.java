package assignments;

import java.util.Scanner;

public class PrintWeekNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter week number to see Day :");
        int weekNo=sc.nextInt();

        if (weekNo==1){
            System.out.println("It's Happy Sunday");
        } else if (weekNo == 2) {
            System.out.println("It's Lazy Monday");
        }else if(weekNo==3){
            System.out.println("It's Hectic Tuesday");
        }else if (weekNo==6){
            System.out.println("It's weekend");
        }else {
            System.out.println("No day");
        }

        switch (weekNo){ // Result : It's Happy Sunday, It's Lazy Monday
            case 1 : System.out.println("It's Happy Sunday");  // if break is absent then it will execute till break
            case 2 : System.out.println("It's Lazy Monday"); break;
            case 3 : System.out.println("It's Hectic Tuesday"); break;
            case 6 : System.out.println("It's weekend"); break;
            default: System.out.println("No day");
        }
    }
}
