package may28_collectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // < > specifies type of data , Arraylist stores
        // Here it is Integer wrapper class
        List<Integer> mylist = new ArrayList<Integer>();
        mylist.addLast(12);
        mylist.addFirst(1);
        mylist.add(123);
        // mylist.add(true); - no boolean data allowed
        //mylist.add("Pramod");  no string data is allowed
        //mylist.add("Anusha");
        System.out.println(mylist);
    }
}

