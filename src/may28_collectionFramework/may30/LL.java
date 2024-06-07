package may28_collectionFramework.may30;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LL {
    public static void main(String[] args) {
        List ttacourseList = new LinkedList();
        ttacourseList.add("Manual");
        ttacourseList.add("Automation");
        ttacourseList.add("Python");
        ttacourseList.add("SDET");
        ttacourseList.add("Java");
        ttacourseList.add(123);
        ttacourseList.add(true);
        ttacourseList.add(3.14f);
        System.out.println(ttacourseList);
        //Iterator, for ,listIterator is used for arraylist, linkedlist


        Vector v=new Vector();
        v.add("Git");
        v.add("Manual");
        //Enumeration is a cursor , legacy class used for Vector, Stack
        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
/*
[Manual, Automation, Python, SDET, Java, 123, true, 3.14]
Git
Manual
 */
