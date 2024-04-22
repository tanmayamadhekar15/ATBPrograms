package pkgFirst;

public class Ex27 {
    public static void main(String[] args) {
        //Pre increment operator
        int a=10;
        int b=++a; // Value is incremented first and then assigns
        System.out.println(b); // 11

        //Post increment
        b=a++; // 12
        System.out.println(a); //12

        //Pre decrement
        int m=10;
        int n=--m; // Value is incremented first and then assigns
        System.out.println(n); // 9

        //Post increment
        m=n--; // 8
        System.out.println(m); //8
    }
}
