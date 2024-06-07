package may28_collectionFramework.HashSet;

import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        /*TreeSet  :
        - stores homogeneous data only
        - Stores data in sorted order
        - No duplicates.
        - No null value
        - compareTo method is used to find object uniquely and manage order.
        If object is not subtype of Comparable then throws runtime exception ClassCastException
         */
        TreeSet s=new TreeSet();
        s.add(10);
        s.add(2);
        s.add(4);
        s.add(0);
        //s.add("hi");  Exception in thread "main" java.lang.ClassCastException as datatype is different and sorting is not possible
        System.out.println(s);  // [0, 2, 4, 10]




    }
}
