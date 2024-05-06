package assignments;

import java.util.Scanner;

public class ElementPresent {
    public static void main(String[] args) {
        // Searching an element in an array is Linear search
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
                    //OR - linear search
        int search_element= 100;
        for(int i=0;i< array.length;i++){
            if(array[i] == search_element){
                System.out.println("Element found");
                found=true;
                break;
            }
        }
        if(found==false){
            System.out.println("Element not found"); // Element not found
        }
    }
}
/*
Enter number to find :
7
7 is not found.

Enter number to find :
22
true
Element not found
 */
