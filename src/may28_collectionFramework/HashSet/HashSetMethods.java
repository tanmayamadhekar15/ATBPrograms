package may28_collectionFramework.HashSet;

import java.util.HashSet;

public class HashSetMethods {
    public static void main(String[] args) {

        HashSet hs=new HashSet();   // stores in random order - hashing technique
        hs.add("apple");
        hs.add("Litchee");
        hs.add("ice apple");
        hs.add(123);
        hs.add(null);
        hs.add(123);   // Hashset removes duplicates
        System.out.println(hs);   //[null, apple, ice apple, Litchee, 123]

        HashSet<String> hss=new HashSet<String>();   //provide hard value as String
        hss.add("Welcome");
        hss.add("bye");
        hss.add(null);
        hss.add("bye");  //removes duplicates
        System.out.println(hss);  //[null, Welcome, bye]
        System.out.println(hss.size());  // 3
        System.out.println(hss.contains("bye"));  //true
        System.out.println(hss.isEmpty());  //false
        System.out.println(hss.hashCode());  // -1397116368
        hss.remove(null);
        hss.clear();
        System.out.println(hss);  // []

    }
}
