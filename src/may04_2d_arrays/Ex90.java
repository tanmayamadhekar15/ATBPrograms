package may04_2d_arrays;

public class Ex90 {
    public static void main(String[] args) {
        String s1 = "Automation"; //SCP
        String s2 = new String("Testing"); // OA

        // String  - Immutable -> Once created can't be changed.
        String password = "pass@123";
        password = "123";

        //StringBuilder & StringBuffer - Mutable - that can be changed!!
        StringBuffer stringBuffer = new StringBuffer("Automation");
        stringBuffer.append("Testing");
        stringBuffer.reverse();
        System.out.println(stringBuffer);// gnitseTnoitamotuA

        StringBuilder stringbuilder = new StringBuilder("Automation");
        stringbuilder.append("Testing");
        StringBuilder password2 = new StringBuilder("Automation");
        password2.append(" Testing");
        System.out.println(password2); //AutomationTesting


    }
}
