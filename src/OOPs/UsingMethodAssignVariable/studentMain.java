package OOPs.UsingMethodAssignVariable;

public class studentMain {
    public static void main(String[] args) {

        // Object reference created
        Course c=new Course();

        //Using reference variable variables are assigned
        c.name="Mark";
        c.course="Automation";
        c.printDetails();

        c.name="John";
        c.course="Manual";
        c.printDetails();

        c.name="Mary";
        c.course="C";
        c.printDetails();

        //Using method variables are assigned
        c.setDetails("Manual","Jackie",1000);
        c.printDetails();
        c.setDetails("Java-Automation","Jenny",3000);
        c.printDetails();
        c.setDetails("Python-Automation","Annie",5000);
        c.printDetails();
    }
}
