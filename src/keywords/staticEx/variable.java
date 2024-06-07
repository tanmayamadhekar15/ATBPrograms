package keywords.staticEx;

import javax.xml.namespace.QName;

public class variable {

    public static void main(String[] args) {
        StaticVar sv=new StaticVar();
        sv.id=1;
        System.out.println("Non static accessed using object");
        System.out.println(StaticVar.name);
    }
}

class StaticVar{
    //static - common to all, shareable
    //variable, method, class can be static
    // Accessed directly using classname in static class without object

    static String name="Static accessed using classname in other class"; //static variable
    int id;  //non static variable
}

/*
Non static accessed using object
Static accessed using classname in other class
 */


