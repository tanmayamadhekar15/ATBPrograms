package may02_array;

public class Ex73 {
    public static void main(String[] args) {
        final int[] arr=new int[3];
        // default value =0 [ 0, 0 ,0 ,0]
        //Can we reassign when final is used ?
        /*
        final doesn't allow to change value in primitive datatypes
        final allows to change values in non primitive but no size change []
         */
        arr[1]=23;
        System.out.println(arr[1]);  // it reassigns
    }
}
