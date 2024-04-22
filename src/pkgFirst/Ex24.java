package pkgFirst;

public class Ex24 {
    public static void main(String[] args) {
        int a=10;
        boolean b= !(a>10 || a<5);
        System.out.println(b); // true

        int c=65;
        boolean d=!(c<64 && c>45);
        System.out.println(d); // true

        int m=30,n=30;
        boolean o=(m>=n); //  > || =
        System.out.println(o); //true


    }
}
