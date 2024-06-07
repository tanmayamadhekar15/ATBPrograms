package may28_collectionFramework.Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class LegacyHashTable {
    public static void main(String[] args) {
        /* Hashtable is similar to HashMap key value pair
        Legacy class so uses Enumeration
        no duplicates
        no null
        It displays in LIFO form like Stack
         */

        Hashtable<Object, String> ht=new Hashtable<>();
        ht.put(1,"one");
        ht.put(2,"two");
        ht.put(3,"three");
        ht.put("isFemale","true");
        ht.put(1,"one"); // no duplicates
        //ht.put(null,"null");  Null pointer exception
        System.out.println(ht);  //{isFemale=true, 3=three, 2=two, 1=one}

        Enumeration<Object> e= ht.keys();
        while(e.hasMoreElements()){
            //System.out.println(e.nextElement());
            Object o=e.nextElement();
            System.out.println(o + " "  +ht.get(o));
        }
        /*
        isFemale true
        3 three
        2 two
        1 one
         */


    }
}
