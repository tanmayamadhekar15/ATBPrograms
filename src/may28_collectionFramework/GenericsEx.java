package may28_collectionFramework;

public class GenericsEx {
    public static void main(String[] args) {
        printF(3,4);
        printF("John","Patty");
        printF(true,false);
        printF(3.12,4.34);
    }

    // Generic is used with <T>
    //IT allows datatypes over abstract
    // When function is same and try different datatypes as above instead of writing datatype specific method
    private static <T> void printF(T i, T i1) {
        // private static <John> void printF(John i, John i1){
        System.out.println(i);
        System.out.println(i1);
    }

    /*List<T> l=new ArrayList<T>();
    l.add(1);
    l.add(true);
    l.add("John");

     */
}

