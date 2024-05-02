package may02_array;

public class Ex74 {
    public static void main(String[] args) {
        // == -> check refs, .equals -> checks value/content
        int[] arr ={1,2,3, 4};
        int[] arr1 ={1,2,3,4};
        System.out.println(arr); //prints address/ ref
        System.out.println(arr1);
        System.out.println(arr == arr1); // false , refs different

        /* .equals - points to method in String class,
         where .equals in arrays points to Object class in Arrays so checks refs
         Object is parent of all classes
         */
        int[] arr2=arr; //reassign arr to arr2
        System.out.println(arr2 == arr1);  // true, same
        System.out.println(arr2.equals(arr1));  // false - > .equals points to Object class in Arrays so checks for reference

    }
}
