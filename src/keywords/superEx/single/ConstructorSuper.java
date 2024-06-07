package keywords.superEx.single;

public class ConstructorSuper {
    public static void main(String[] args) {
        /* If child has default constructor
         then parent (default constructor )will be called automatically by super (hidden)
         */
        ConstructorStudent cs=new ConstructorStudent(); //student constructor is called
        //Default constructor - parent
        //Default constructor -child

        // Parameterized constructor
        ConstructorPerson cp=new ConstructorPerson("Jackie");
        ConstructorStudent csp=new ConstructorStudent("John");
    }
}

class ConstructorPerson{   //parent class

    ConstructorPerson(){    //default parent constructor
        System.out.println("Default constructor - parent");
    }

    ConstructorPerson(String name){ //Parameterized parent constructor
        System.out.println(name);
    }
}

class ConstructorStudent extends ConstructorPerson{  //single inheritance

    //super.variable;  -- parent variable
    //super.method();  -- parent method
    //super ();   -- parent default constructor
    //super("John");  -- parent parameterized constructor
    ConstructorStudent(){  //default child constructor
        //super();  hidden
        super("Johnnie"); //Parameterized constructor called
        System.out.println("Default constructor -child");

    }
    ConstructorStudent(String name){
        System.out.println(name);
    }
}
