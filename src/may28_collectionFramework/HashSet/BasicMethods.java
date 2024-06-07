package may28_collectionFramework.HashSet;

import java.util.*;

public class BasicMethods {
    public static void main(String[] args) {
        //Dynamic dispatch,runtime poly
        HashSet hs=new HashSet();  // Child variable child object creation
        Set s=new HashSet();  //Parent variable - child object creation
        // SequencedCollection sc= (SequencedCollection) new HashSet();  // UpCasting
        Collection c=new HashSet(); // Grandparent variable - child object creation

        hs.add("one");
        hs.add("one");
        hs.add("two");
        hs.add(1);
        hs.add(false);
        hs.add(null);
        hs.add(null);
        System.out.println(hs); //[null, 1, false, one, two]  -removes duplicates

        s.add("one");
        s.add("one");
        s.add(null);
        s.add(null);
        System.out.println(s);  //[null, one]

        //Remove element using element no indexing
        hs.remove("one");

        //Insert element -  not possible
        //Access specific element -  not possible

        //Convert Hashset to arrayList -insertion, accessing specific element is possible
        ArrayList a=new ArrayList(hs);
        System.out.println(a); //[null, 1, false, two]
        a.set(1,"four");
        System.out.println(a);  //[null, four, false, two]

        Iterator<Object> i=a.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
