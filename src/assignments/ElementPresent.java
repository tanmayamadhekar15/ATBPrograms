package assignments;

import java.util.Scanner;

public class ElementPresent {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 8, 9, 22}; // 1D array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to find :");
        int num_tofind=sc.nextInt();
        boolean found = false;

        for (int item : array) {
            if (item == num_tofind) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(found);
        else
            System.out.println("Not found");

    }
}
/*
Enter number to find :
7
7 is not found.

Enter number to find :
22
true
 */
