package may28_collectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class HMap {
    public static void main(String[] args) {
        Map<String, Object> m=new HashMap<String, Object>();

        m.put("name","John");
        m.putIfAbsent("age", 20);
        m.put("city","New York");
        m.put("code",null);
        System.out.println(m);  //{code=null, city=New York, name=John, age=20}
        System.out.println(m.get("age"));  //20 - get works with key param
        System.out.println(m.get("state"));  // is key is absent returns null
        m.containsKey("city");
        m.containsValue(20);
        System.out.println(m.isEmpty()); //false
        System.out.println(m.keySet());  //[code, city, name, age]
        System.out.println(m.values());  //[null, New York, John, 20]

        // Entry is interface
        for(Map.Entry<String,Object> item : m.entrySet()){
            System.out.println(item.getKey() + " " + item.getValue());
        }/*
        code null
        city New York
        name John
        age 20*/

    }
}
