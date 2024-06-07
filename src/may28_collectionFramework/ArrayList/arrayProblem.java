package may28_collectionFramework.ArrayList;

public class arrayProblem {
    public static void main(String[] args) {
        /*
        What is the need of Collection framework?
        Arrays has/stores fixed size homogeneous data.
        No built-in methods for sort, search.
        Insertion and deletion is heavy task.
         */
        // How to create an Array?
        int[] arr = new int[5];
        // length -> returns the length of the array
        // 5
        // Index -> 0 to 4
        System.out.println(arr.length);
        // Fixed Size Problem in array
        // Can I increase the size of the array?
        // No ,
        // arr.sort();

        // a -> 1000, 2 stored elements, 998 empty elements  -> memory wastage
        // 1,2,3,4,5,6
        // 1,2,3,4 90, 6

        arr[0]= 1;
        arr[0]= 2;
        // Array can store only same type of elements




    }
}
