package may02_array;

public class Ex71 {
    public static void main(String[] args) {
        // Array - non primitive datatype holding collection of similar primitive datatypes

        int[] array={1,2,3,4,5};  // defined 1
        System.out.println(array.length); // 5
        System.out.println(array[3]);   // 4

        /* syntax : datatype[] array_name=new datatype[size];
        Here array size starts from 1 , but index starts with 0,
        Length starts with 1
         */
        int[] arr=new int[3]; // defined 2, size =3
        arr[0]=12; //index starts 0
        arr[1]=14;
        arr[2]=20;
        //System.out.println(arr[3]); //error Array Out of bound exception
        System.out.println(arr[2]);  // 20
        System.out.println(arr[0]); // 12
        System.out.println(arr.length);  // 3
    }
}
