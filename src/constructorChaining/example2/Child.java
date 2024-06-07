package constructorChaining.example2;

public class Child extends Parent{


    public Child() {  //default
        //super();
    }

    public Child(String name) {   //one argument
        // super(name);   OR   this("one argument);  -> not both can work together
        this();
        System.out.println("Called default constructor");
    }

    public Child(String name, String surname) {    //two argument
        //super(name, surname);  //calling parent
        this("Call one argument constructor");
        System.out.println("Constructor chaining :" +name);
    }

    public Child(String name, String surname,String mname) {  ///three argument
        //super(name, surname);  //calling parent
        //this("three argument");
        //this("One argument");
        this("T","M");  //constructor chaining
        System.out.println("Constructor chaining : "+name + " " +surname+ " " +mname);

    }

}
