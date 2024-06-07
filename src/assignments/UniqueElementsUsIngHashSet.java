package assignments;

import java.util.HashSet;
import java.util.Set;

public class UniqueElementsUsIngHashSet {
    public static void main(String[] args) {
        int input_array[]={1,2,3,3,3,4,4,5,5};

        Set s=new HashSet();
        for(int n:input_array){
            s.add(n);
        }
        System.out.println("Output array with unique values : "  +s);   // Output array with unique values : [1, 2, 3, 4, 5]


    }
}
