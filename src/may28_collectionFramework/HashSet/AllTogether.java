package may28_collectionFramework.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AllTogether {
    public static void main(String[] args) {
        /* Hashset - no order maintained, random storing of data
            no duplicates allowed
            null allowed
            heterogeneous data
         */
        Set hs=new HashSet();
        hs.add(1);
        hs.add(0);
        hs.add(10);
        hs.add(5);
        hs.add(2);
        hs.add(null);
        hs.add(null);
        System.out.println(hs);   //[0, null, 1, 2, 5, 10] -random order
        /* Linkedhashset -order maintained
            no duplicates allowed
            single null allowed
            heterogeneous data
         */
        Set ls=new LinkedHashSet();
        ls.add(1);
        ls.add(0);
        ls.add(10);
        ls.add(5);
        ls.add(2);
        ls.add(null);
        ls.add(null);
        System.out.println(ls);  //[1, 0, 10, 5, 2, null]  -  as per given order
        /* Treeset - Stores in sorted order
            no duplicates allowed
            single null allowed
            homogeneous data
         */
        Set ts=new TreeSet();
        ts.add(1);
        ts.add(0);
        ts.add(10);
        ts.add(5);
        ts.add(2);
        ts.add(null);  //NullPointerException
        System.out.println(ts);  //[0, 1, 2, 5, 10] - sorted order

    }
}
