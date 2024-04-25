package apr25;
import java.util.Scanner;

public class Ex56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character to check if it's vowel or consonant :");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input); // c

        switch (user_input) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e', 'o':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel, It is Consonant"); // c
        }
        sc.close();
    }
}
