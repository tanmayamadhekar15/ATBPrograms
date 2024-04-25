package apr20;

public class Ex50 {
    public static void main(String[] args) {
        //New operator is available only for non primitive types
        //String , arrays, class

        String pass="A@123";
        String pass1=pass.toLowerCase(); //a@123

        System.out.println(pass==pass1); //false
        System.out.println(pass.equals(pass1)); // false
        System.out.println(pass.equalsIgnoreCase(pass1)); //true
        System.out.println(pass.substring(0,2)); //A@ - excludes end index

    }
}
