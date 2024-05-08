package may07_functions;

public class Ex99 {
    public static void main(String[] args) {
        int r1 = sumOfTwo(4, 5);
        System.out.println(r1);
        int r2 = sumOfTwo(10, 11);
        System.out.println(r2);
        String r3 = sumOfTwo("Java", 11);
        System.out.println(r3);

    }

    static int sumOfTwo(int a, int b) {
        return a + b;
    }

    static String sumOfTwo(String a, int b) {
        return a + b;
    }
}
/*
9
21
Java11
 */
