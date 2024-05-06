package assignments;

import java.util.Scanner;

public class printTableUsingPrintf {
    public static void main(String[] args) {
        //For loop
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to print table of :");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println( n +"X"+ i +"="+(n*i));
        }
        int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d \n", num, i, num * i  );
        }
     }
}
/*
Enter number to print table of :
3
3X1=3
3X2=6
3X3=9
3X4=12
3X5=15
3X6=18
3X7=21
3X8=24
3X9=27
3X10=30
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
 */
