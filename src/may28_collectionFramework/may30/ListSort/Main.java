package may28_collectionFramework.may30.ListSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1,"Pramod");
        Student student2 = new Student(5,"Dutta");
        Student student3 = new Student(3,"Astitva");

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);
        System.out.println(students);
        Collections.sort(students,new SortByNameDesc());
        System.out.println(students);

    }
}
