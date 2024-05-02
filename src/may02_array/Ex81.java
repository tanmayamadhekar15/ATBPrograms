package may02_array;

import java.util.Scanner;

public class Ex81 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] marks=new double[3];
        System.out.println("Enter marks in Physics :");
        marks[0]=sc.nextDouble();
        System.out.println("Enter marks in Chemistry : ");
        marks[1]=sc.nextDouble();
        System.out.println("Enter marks in Maths :");
        marks[2]=sc.nextDouble();

        for(int i=0; i < marks.length ; i++){
            if (marks[i] < 30 ){
                System.out.println("Failed in subject :" +marks[i]);
                break;
            }
                System.out.println(marks[i]);
        }
        sc.close();
    }
}
