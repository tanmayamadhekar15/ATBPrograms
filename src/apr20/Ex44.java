package apr20;

public class Ex44
{
    public static void main(String[] args) {
        //String is immutable(can't be changed), non primitive datatypes
        //To change values of String, then use StringBuilder, StringBuffer class
        String name="Automation"; // reference created in SCP
        String name1=new String("Manual"); //creates reference in heap area
        name ="Testing"; // another new reference is created in SCP



    }
}
