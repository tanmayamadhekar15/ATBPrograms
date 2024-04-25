package apr20;

public class Ex49 {
    public static void main(String[] args) {
        //String requires Reassigning to use, as it is non primitive type
        String n="Testing";
        n.concat("Academy");
        System.out.println(n); // prints only Testing

        String n1=n.concat("Academy"); // Assign
        System.out.println(n1); //TestingAcademy

    }
}
