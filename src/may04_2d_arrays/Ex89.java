package may04_2d_arrays;

public class Ex89 {
    public static void main(String[] args) {
        int[] arr = {23,23,43};
        //Enhanced for loop used for specially arrays
        for (int item :arr){   // for(datatype variable_name : array_name
            System.out.println("Enhanced for loop :"+item);
        }

        System.out.println(" -- ");
        // Traditional for loop
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Traditional for loop :"+arr[i]);
        }
    }
}
