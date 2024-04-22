package assignments;

public class decrementOperator {
    public static void main(String[] args) {
        //--b is pre decrement operator
        int b=10;
        System.out.println(--b + b++ + ++b); // (--b)9 + (b++)9 + (++b)11 =  29
        System.out.println(b); // 11

    }
}
