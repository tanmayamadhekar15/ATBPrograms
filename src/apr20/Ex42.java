package apr20;

public class Ex42 {
    public static void main(String[] args) {
        /*
        String is collection of chars, final class
        Two ways to create String - They are stored in different ways by JVM -String Constant pool (SCP) and Heap area
         */
        //Way 1 - using Assignment operator
        String name="Automation"; // name is created in SCP
        System.out.println("Testing :"+name);

        //Two ways to create String
        //Way 2 - using New operator
        String name1=new String("Manual"); // name2 is created in heap area

    }
}
