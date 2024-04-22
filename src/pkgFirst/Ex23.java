package pkgFirst;

public class Ex23 {
    public static void main(String[] args) {
        //Logical operator
        boolean a=true;
        System.out.println(!a); // false
        System.out.println(!(0>20)); // true
        System.out.println(!!(30>90)); // false
        // can apply multiple negations


        //OR gate - ||
        System.out.println(true || true); //true
        System.out.println(true || false); //true
        System.out.println(false || true); //true
        System.out.println(false || false); //false

        //AND gate - &&
        System.out.println(true || true); //true
        System.out.println(true || false); //false
        System.out.println(false || true); //false
        System.out.println(false || false); //false




    }
}
