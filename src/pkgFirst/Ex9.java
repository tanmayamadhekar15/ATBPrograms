package pkgFirst;

public class Ex9 {
    /*Difference between println, print, printf
        println, print, printf are methods of PrintStream class used to output data
     */

    public static void main(String[] args) {

        System.out.print(true); //doesn't add new line
        System.out.println("Println method adds new line and prints"); //adds next new line
        System.out.print("Doesn't add new line");
        int age =21;
        System.out.printf("\nAge is: %d", +age); /* '\n' is used to print on new line
        printf is used for formatting
        %d - integer (byte, short, int, long)
        %s - String
        %c - character
        %f -float
        */


    }
}
