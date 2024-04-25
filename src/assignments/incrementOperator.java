package assignments;

public class incrementOperator {
    public static void main(String[] args) {
        //Here ++a is pre-increment, a++ is post increment operator
        int a=10;
        System.out.println(++a + a++ + a++); //(++a)11 + (a++)11 + (a++)12 = 34
        System.out.println(a); //a=13

    }
}
