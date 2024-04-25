package apr25;

import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name where you want to execute the program :");
        String browserName = sc.nextLine();
        browserName = browserName.toLowerCase();

        switch(browserName){
            case "chrome":
                System.out.println("Starting chrome browser");
                break;
            case "firefox":
                System.out.println("Starting firefox browser");
                break;
            case "edge":
                System.out.println("Starting Edge browser"); // Executes
                break;
            case "safari":
                System.out.println("Starting safari browser");
                break;
            default:
                System.out.println("Unidentifiable browser");
                break;
        }
    }
}
