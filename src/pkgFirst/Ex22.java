package pkgFirst;

public class Ex22 {
    public static void main(String[] args) {
        int a=10,b=10;
        boolean c=(a>=b);  // 10>10 or 10=10
        System.out.println(c); //true

        System.out.println(10==10); //true
        System.out.println(10<=10); //true
        System.out.println(10!=10);  //false
        System.out.println(10>10); // false
        System.out.println(10<10); // false
        System.out.println("------------");
        System.out.println('A'==65); //true
        System.out.println('A'!=65); // false

        // = not allowed in sout,  == allowed
        System.out.println("------------");
        System.out.println('A'== 65.2); //false
        //System.out.println('a'=90);
    }
}
