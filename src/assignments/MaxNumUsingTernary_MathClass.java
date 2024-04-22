package assignments;

public class MaxNumUsingTernary_MathClass {
    public static void main(String[] args) {
        byte first=-127,second=127,third=0;
        byte maxNum= ((first>second)?((first>third)?first:third):((second>third)?second:third));
        System.out.println("Maximum number among 3 numbers : " +maxNum);

        //ternary using temp variable
        float f1=-31.56f, f2=100.357f, f3=0.0F;
        float temp=(f1>f2?f1:f2);
        float maxFloatNum=(f3>temp?f3:temp);
        System.out.println("Maximum float number :" +maxFloatNum);

        //Using Math class and ternary operator
        int m1=-32768,m2=0,m3=32768;
        int mathTemp=Math.max(m1,m2);
        int mathMax=Math.max(m3,mathTemp);
        System.out.println("Maximum number using math with Ternary: "+mathMax);

    }
}
