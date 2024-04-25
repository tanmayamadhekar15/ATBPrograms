package apr23;

public class Ex52 {
    public static void main(String[] args) {
        /* if else is a statement used to check condition. If condition is true then executes if block
         else executes else block
            if(condition -> boolean true or false) {
            }
            else{
            }
         */

        int age = 13;
        if (age > 18) {   // if this condition is true then goes inside and executes block
            System.out.println("You can watch A movie"); //executes
        } else {
            System.out.println("You can't");  // if condition is false then executes this block
        }

        int a = 10;
        if (a == 4) {  //Here (10==4) is false so executes else block
            System.out.println("Hi");
            } else {
            System.out.println("Bye"); //executes

            boolean b = true;
            b = !b;
            if (2 + 2 >= 4) {  // 4 > 4 or 4 == 4 -> true - OR GATE
                System.out.println("This loop will execute when the condition is true");
            } else {

                System.out.println("This is outside the loop, it will be executed always" + a);
            }
        }
    }
}
