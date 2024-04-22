package assignments;

public class maxNumUsingTernary_MathClass {
    public static void main(String[] args) {
        byte first=-127,second=127,third=0;
        byte maxNum= ((first>second)?((first>third)?first:third):((second>third)?second:third));
        System.out.println("Maximum number among 3 numbers : " +maxNum);  // 127

        //ternary using temp variable
        float f1=-31.56f, f2=100.357f, f3=0.0F;
        float temp=(f1>f2?f1:f2);
        float maxFloatNum=(f3>temp?f3:temp);
        System.out.println("Maximum float number :" +maxFloatNum); //  100.357

        /*Using Math class and ternary operator
        Math is a class with max() as method to return max value integer.
         */
        int m1=-32768,m2=0,m3=32768;
        int mathTemp=Math.max(m1,m2); // Math.max() - returning greater of two integer values
        int mathMax=Math.max(m3,mathTemp);
        System.out.println("Maximum number using math with Ternary: " +mathMax); // 32768

    }
}
