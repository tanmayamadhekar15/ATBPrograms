package may28_collectionFramework.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListOfMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("firstName", "John");
        map.put("lastName", "Patty");
        map.put("email", "dasda@addad.omc");
        map.put("phone", "1234567890");
        map.put("city", "Pune");
        map.put("state", "MH");
        map.put("country", "India");
        map.put("zip", "411057");

        Map<String, String> map2 = new HashMap();
        map2.put("firstName", "Annie");
        map2.put("lastName", "Pot");
        map2.put("email", "dasda@addad.omc");
        map2.put("phone", "1234567890");
        map2.put("city", "Pune");
        map2.put("state", "MH");
        map2.put("country", "India");
        map2.put("zip", "411057");

        ArrayList list = new ArrayList();
        list.add(map);
        list.add(map2);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}

