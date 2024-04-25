package apr25;

import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter day to calculate letters :");
        String day=sc.next();
        day=day.toLowerCase();
        int numLetters = 0;
        String day1="TUESDAY";
        switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> numLetters = 6; // without break
            case "TUESDAY"                -> numLetters = 7;
            case "THURSDAY", "SATURDAY"-> numLetters = 8;
            case "WEDNESDAY"              -> numLetters = 9;
            default -> throw new IllegalStateException("Invalid day");
        };
        System.out.println(numLetters);
    }
}