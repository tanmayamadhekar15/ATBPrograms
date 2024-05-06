package assignments;

import java.util.Arrays;

public class SortingArrayElements {
    public static void main(String[] args) {
        // Arrays is inbuilt class has predefined methods like tostring, sort,etc
        int array[]= { 100, 20, 400, 50, 70, 30 };
        System.out.println("Before sorting :");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After sorting :");
        System.out.println(Arrays.toString(array));

        char []c={ 'a', 'z', 'f', 'c'};
        System.out.println("Before sorting : " +Arrays.toString(c));
        Arrays.sort(c);
        System.out.println("After sorting : " +Arrays.toString(c));
    }
}

/*
Before sorting :
[100, 20, 400, 50, 70, 30]
After sorting :
[20, 30, 50, 70, 100, 400]

Before sorting : [a, z, f, c]
After sorting : [a, c, f, z]
 */
