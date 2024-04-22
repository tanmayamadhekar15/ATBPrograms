package pkgFirst;

public class Ex18 {
    public static void main(String[] args) {

        //Concatenation is from left to right
        String name ="ABC";
        int a=10,b=10;
        System.out.println(a+name); // 10ABC
        System.out.println(name+a+b); // ABC1010
        System.out.println(a+b+name); // 20ABC

    }
}
