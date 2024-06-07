package may28_collectionFramework.TypesOfIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add("welcome");
        l.add("to");
        l.add("Automation");
        l.add("Testing");

        ListIterator li=l.listIterator();
        System.out.println("--------From left to right traverse-----------");
        // hasNext() and next() is used to go from left to right
        while(li.hasNext()){
            System.out.println(li.next());
        }
        li.remove(); // it is called only once after iteration, it removes only last element from the list
        System.out.println(li);


        System.out.println("-------From right to left traverse---------------");
        // hasPrevious() and previous() is used to go from right to left
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }


  }
}
/*
--------From left to right traverse-----------
welcome
to
Automation
Testing
-------From right to left traverse---------------
Testing
Automation
to
welcome
 */
