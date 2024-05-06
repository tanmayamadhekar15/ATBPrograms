package may04_2d_arrays;

public class Ex84 {
    public static void main(String[] args) {
        // double the array values
        int[] array = {30,40,50,60,70};
        int[] doubled_array = new int[5];  //create an empty array to store

        for (int i = 0; i < array.length ; i++)
        {
            doubled_array[i] = array[i]*2;
            }
        System.out.println("Printing Arrays!!");
        for (int i = 0; i < array.length ; i++) {
            System.out.println(doubled_array[i]);  // 60, 80, 100, 120. 140
        }
    }
}
