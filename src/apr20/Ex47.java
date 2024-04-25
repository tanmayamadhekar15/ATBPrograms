package apr20;

public class Ex47 {
    public static void main(String[] args) {

        // == -> checks references, equals -> checks value
        String s=new String("manual");
        String s1=new String("manual");
        System.out.println(s==s1); //false -  different ref
        System.out.println(s.equals(s1)); // true - same content


    }
}
