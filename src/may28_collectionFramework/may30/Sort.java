package may28_collectionFramework.may30;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
 //       List stringList = null;
//        stringList.add("ATB");  // Null pointer exception, unchecked type
        List<Integer> marks = new ArrayList<>();
        marks.add(91);
        marks.add(87);
        marks.add(80);
        System.out.println("Before sorting : " +marks);  //Before sorting : [91, 87, 80]
        Collections.sort(marks);  //Use sort() of Collections Concrete class
        System.out.println("After sorting : " + marks);  //After sorting :  [80 ,87, 91]

        Vector v2 = new Vector<>();
        v2.add(87);
        v2.add(81);
        v2.add(91);
        Collections.sort(v2);
        System.out.println(v2);

        Stack s=new Stack();
        s.push("A");  //push pushes an item onto stack
        s.add("Welcome");
        s.push("Java");
        s.add(10);
        s.push("Python");
        s.push("SQL");
        s.push("MySQL");  // or s.add("MySQL");
        System.out.println(s);  //[A, Welcome, Java, 10, Python, SQL, MySQL]

        System.out.println("Last element is popped out from the list : "+s.pop()); // Last element is popped out from the list : MySQL
        // Pop is to remove element from stack so i.e SQL will be last element in stack
        System.out.println(s);  //[A, Welcome, Java, 10, Python, SQL]


        System.out.println("Last element seen/peeped is : "+s.peek());  // Last element seen/peeped is  : SQL
        // Peek is to see and not to remove element
        System.out.println(s);  //[A, Welcome, Java, 10, Python, SQL]
    }
}
