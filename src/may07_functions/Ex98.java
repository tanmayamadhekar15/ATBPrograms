package may07_functions;

public class Ex98 {
    public static void main(String[] args) {
        // No Return with no parameter
        saySomethingPlease();
        // No Return with parameter
        sayHelloToYou("everyone");

        // Return with no parameter
        sumOfTwoBad(3, 4);
        // Return with parameter
        int result = sumOfTwoGood(3, 4);
        System.out.println(result);
    }

    static int sumOfTwoGood(int a, int b) {
        return a + b;
    }

    static void sumOfTwoBad(int a, int b) {
        System.out.println(a + b);
    }

    static void sayHelloToYou(String name) {
        System.out.println("Hello, " + name);
    }

    static void saySomethingPlease() {
        System.out.println("Non Return with no parameter");
    }

}
/*
Non Return with no parameter
Hello, everyone
7
7
 */
