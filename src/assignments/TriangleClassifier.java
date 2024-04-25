package assignments;
 import java.util.Scanner;
public class TriangleClassifier {
    public static void main(String[] args) {
        // Triangle classifier - Equilateral, Isosceles, Scalene
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 sides of a triangle to check type of triangle :");
        int side1 = sc.nextInt(); // 10
        int side2 = sc.nextInt(); // 12
        int side3 = sc.nextInt(); // 13
        if((side1 == side2) && (side1 == side3) && (side2 == side3)){
            System.out.println("All sides are equal : Equilateral");
        }else if((side1 == side2) || (side1 == side3) || (side2 == side3)){
            System.out.println("Two sides are equal : Isosceles");
        }else{
            System.out.println("No side is equal : Scalene"); // executes
        }
        sc.close();

    }
}
