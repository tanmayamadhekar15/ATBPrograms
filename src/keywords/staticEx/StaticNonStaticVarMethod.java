package keywords.staticEx;

public class StaticNonStaticVarMethod {
    public static void main(String[] args) {
        Person p1 = new Person("A");
        Person p2 = new Person("B");

        System.out.println(Person.footBallClub);  //ClassName.staticVariable

        // Static variable can be accessed ClassName. func
        Person.m1();
        p1.m1();
        p2.m1();

        System.out.println("Values after editing static variable as :");
        Person.footBallClub = "M";
        System.out.println(p1.footBallClub); //static var can access through ref too after rewriting value
        System.out.println(p2.footBallClub);

        p1.name = "Lucky";
        System.out.println(p2.name);

        // Non Static can be accessed using object Ref
        p1.m2();
        p2.m2();
        //Person.m2();  not possible
}
}

class Person{
    static String footBallClub = "Arsenal";  //static
    String name; // non static

    static {
        System.out.println("Once, When class is loaded");
    }

    {
        System.out.println("IIB");
    }

    // Static F(n)
    static void m1(){
        //this.name;  non static var can't be accessed by static because non static initializes only after object creation.
        System.out.println("Static function - common to all");
    }

    // Non Static F(n)
    void m2(){
        System.out.println(" Person : " +this.name);
        System.out.println(footBallClub);
    }

    public Person(String name) { //constructor to assign values to variables
        this.name = name;
    }

}
