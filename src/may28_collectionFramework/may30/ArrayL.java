package may28_collectionFramework.may30;

import java.util.ArrayList;
import java.util.List;

public class ArrayL {
    public static void main(String[] args) {

        List<String> courseList = new ArrayList<>();
        courseList.add("Automation");
        courseList.add("Manual");
        courseList.add("Python");
        courseList.add("Data learning");
        courseList.add("Data science");

        List numList = new ArrayList();//list has by default Object type - so accepts any type of data
        numList.add(150);
        numList.add(100);
        numList.add(10.5f);
        numList.add(39.56);
        numList.add(true);

        courseList.addAll(numList); //addAll adds/appends the whole list at the end of Collection
        System.out.println(courseList);
    }
}
/*
[Automation, Manual, Python, Data learning, Data science, 150, 100, 10.5, 39.56, true]
 */

