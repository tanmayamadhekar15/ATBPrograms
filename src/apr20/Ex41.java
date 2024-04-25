package apr20;

public class Ex41 {
    public static void main(String[] args) {
        byte b=10;
        int a=b; // Implicit casting (automatically)
        int a1= (int)b; // Explicit casting(manually)

        int a2=87;
        long b1=91;
        String s="KK";
        String s1="VV";
        System.out.println(s+s1+a2+b1); //KKVV8791
        System.out.println(s+s1+(a2+b1)); //KKVV178


    }
}
