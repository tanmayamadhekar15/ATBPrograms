package assignments;

public class mathFunctions {
    public static void main(String[] args) {
        //Math class has functions as cbrt(), pow(),abs(),sqrt()

        double x = 10,y = 12.4f,z = 56.78f;
        double result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println("Result is : " +result); // 5.818450871146421
    }
}
