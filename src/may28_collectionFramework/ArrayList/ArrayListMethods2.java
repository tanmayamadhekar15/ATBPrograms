package may28_collectionFramework.ArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        List l = new ArrayList();
        ArrayList list = new ArrayList();
        //check if arrayList is empty
        System.out.println(list.isEmpty());// true

        c.add("hello");
        c.add(true);
        System.out.println(c);  // [hello, true]

        l.add("welcome");
        l.add(false);
        l.addLast(100);
        l.addFirst(true);
        System.out.println(l);  //  [true, welcome, false, 100]

        list.add("Manual");  //add elements into list
        list.addLast(10.5f);
        list.addFirst(100);
        list.add(2, "Software");
        list.add(null);
        list.add("Automation");
        list.add(true);

        //Size of arraylist and printing
        System.out.println(list.size());  //7
        System.out.println("ArrayList elements :" + list);  //ArrayList elements :[100, Manual, Software, 10.5, null, Automation, true]

        //Create another collection to remove randomly multiple elements from main list as removeAll has Collection argument
        ArrayList list2 = new ArrayList();
        list2.add(100);
        list2.add("Manual");
        list.remove(2);  //Software
        list.removeLast();  //true
        System.out.println(list); // [100, Manual, 10.5, null, Automation]
        list.removeFirst();  //100
        System.out.println(list);  // [Manual, 10.5, null, Automation]
        list.removeAll(list2);  //100 , Manual
        System.out.println("After removing : " + list);  //After removing :  [10.5, null, Automation]
        list.removeFirst();  //10.5
        System.out.println(list);  // [null, Automation]

        //list.clear();  It clears all elements, once it is cleared no element is present in list
        System.out.println(list.isEmpty());   //true

    }
}


