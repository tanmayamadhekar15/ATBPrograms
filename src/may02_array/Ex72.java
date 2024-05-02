package may02_array;

public class Ex72 {
    public static void main(String[] args) {
        int[]ages = {12,34,45,57};  // Fixed elements in an array

        // Reassign elements using new operator,
        // No value then default is 0
        int[] ages1=new int[3];
        System.out.println(ages1[2]);  //  default value are 0
        System.out.println(ages1[0]);  // default value are 0


    }
}
