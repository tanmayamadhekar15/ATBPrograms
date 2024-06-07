package may28_collectionFramework.ArrayList;

import java.util.List;

public class BasicList {
    public static void main(String[] args) {
        // Shopping List
        // Milk, Bread, Butter, Cheese.
        // 4 elements
        // Collection Framework -> How you can store the elements
        // 1. List (Interface) ->ArrayList, LinkedList, Vector, Stack

        List shopping_list = List.of("Milk", "Bread", "Butter", "Cheese");
        System.out.println(shopping_list);
        // length
        System.out.println(shopping_list.size());

        List fruits = List.of("orange", "apple", "banana", "apple", "watermelon");
        // List can duplicate
        System.out.println(fruits);
        System.out.println(fruits.size());

//        List my_10th_marks = List.of(91, 92, 93, 95, 100);
//        System.out.println(my_10th_marks);
//        System.out.println(my_10th_marks.size());
//
//        List different_data_types = List.of("Pramod",true,123);

        System.out.println(fruits.get(0));
        System.out.println(fruits.indexOf("apple"));
        // IsEmpty
        System.out.println(fruits.isEmpty());

        // add, remove, clear, contains, indexOf, isEmpty, size, get
        // addAll, removeAll, retainAll, containsAll


        fruits.add("grapes");
        System.out.println(fruits);

    }
}

