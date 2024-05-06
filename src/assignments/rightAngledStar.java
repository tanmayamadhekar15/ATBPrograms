package assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class rightAngledStar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to form star triangle :");
        int star_num=sc.nextInt();

        for(int i=1; i <= star_num; i++){
            for(int j=1; j <= i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

/*
O/p:
Enter number to form star triangle :
5
*
**
***
****
*****
 */