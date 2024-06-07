package may28_collectionFramework.may30;

import java.util.Stack;

public class StackVector {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.add("D");
        System.out.println(stack);  //[A, B, C, D]
        System.out.println(stack.peek()); // D
       System.out.println(stack.pop());  // D
      //  System.out.println(stack.peek());  // C
        System.out.println(stack);  // [A, B, C]
    }
}
