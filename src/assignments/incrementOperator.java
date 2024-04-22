package assignments;

public class incrementOperator {
    public static void main(String[] args) {
        //Here ++a is pre-increment, a++ is post increment operator
        int a=10;
        System.out.println(++a + a++ + a++); //(++a)11 + (a++)11 + (a++)12 = 34
        System.out.println(a); //a=13

        /*
        int a1 = 10, b1 = 25, c1 = 15 ;

        int max = (a1 > b1) ? (a1 > c1 ? a1 : c1) : (b1 > c1 ? b1 : c1);

        System.out.println("Maximum number among " + a1 + ", " + b1 + " and " + c1 + " is " + max);

        System.out.println("Question 1 - The maximum number is " + max);
        System.out.println("----------------"); */

    }
}
