package apr20;

public class Ex43 {
    public static void main(String[] args) {
        /*
        String is a final class, has in built methods
         */
        String course="Automation";
        String course1="automation";
        System.out.println(course.length()); // Starts with 1 - 10
        System.out.println(course.toLowerCase());  // AUTOMATION
        System.out.println(course.toUpperCase()); // automation
        System.out.println(course1.indexOf('i')); // 7


    }
}
