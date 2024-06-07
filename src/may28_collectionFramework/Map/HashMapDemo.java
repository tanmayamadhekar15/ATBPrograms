package may28_collectionFramework.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap();
        Map m=new HashMap();

        hm.put(1,"Stark");
        hm.put(2,"John");
        hm.putIfAbsent(3,"Mary");
        hm.replace(2,"Johnny");
        hm.put(1,"Steve");
        System.out.println(hm);  //{1=Steve, 2=Johnny, 3=Mary}
        System.out.println(hm.size());  //3

        //access key value
        hm.get(2);
        System.out.println(hm.getOrDefault(6,"Riv"));

        //remove
        //hm.remove(2);

        //get all keys
        System.out.println(hm.keySet());  // gives all keys from hashmap
        System.out.println(hm.values());  // gives all values from hashmap
        System.out.println(hm.entrySet()); // gives all key-value pairs

        //for - reading pair
        for(int key:hm.keySet()){
            System.out.println(key + " " +hm.get(key));
        }
        System.out.println("-----------");
        Iterator<Map.Entry<Integer,String>> it=hm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry e=it.next();
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }
}
