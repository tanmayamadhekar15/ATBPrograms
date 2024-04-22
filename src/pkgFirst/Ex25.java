package pkgFirst;

public class Ex25 {
    public static void main(String[] args) {
        /* Typecasting : Converting from one datatype to another
            - Narrowing : Larger to smaller type (Manually) -> Explicit casting
            - Widening : Smaller to larger  type  (Automatically) → Implicit casting
         */
        int a=10; //int a=(float)10; ->JVM automatically does it
        float b=20.50f;
        System.out.println(a+b); // Results in float(Bigger type) - Widening (Implicit casting)

        short c=1;
        char d='A';
        System.out.println(c+d); // ASCII(A) =65 - > 1+65

        char m='a';
        char n='b';
        System.out.println(m+n); //ASCII 97 + 98

        int i=300;
        byte j=(byte)i; // Narrowing - Explicit casting - Do it manually
        System.out.println(j); // 44 - data loss -due to range restriction (only 8 bits - 1 byte)
    }
}
