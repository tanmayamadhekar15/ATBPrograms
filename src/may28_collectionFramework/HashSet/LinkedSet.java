package may28_collectionFramework.HashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSet {
    public static void main(String[] args) {
        // linkedhashset maintains order to store data , no duplicates so single null allowed only
        Set s= new LinkedHashSet(10,2);  // by default in definition - initialCap =16, loadFactor=0.75f
        s.add(1);
        s.add("welcome");
        s.add(null);
        s.add(true);
        s.add(true);
        s.add(1);
        System.out.println(s); //[1, welcome, null, true]

    }
}
