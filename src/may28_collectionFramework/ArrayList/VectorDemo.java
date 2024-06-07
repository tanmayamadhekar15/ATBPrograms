package may28_collectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        List mylist1 = new ArrayList(); // CR - CO
        mylist1.add("A");
        mylist1.add("B");
        mylist1.add("c");
        System.out.println(mylist1);
        //Vector is a legacy class which implements List interface
        Vector v = new Vector();
        v.add("X"); // t1
        v.add("Y"); // t1
        v.add("Z"); // t1
        v.remove("Z"); // t1

        System.out.println(v);
    }
}
