package constructorChaining.example2;

public class Parent {
    String n,s;


    Parent(){  //default con
        System.out.println("Default Constructor");
    }

    Parent(String name){ //one parameterized con
        this.n=name;
        System.out.println("One argument");
    }

    Parent(String name,String surname){// two parameterized con
        this.n=name;
        this.s=surname;
        System.out.println("Two argument");
    }
}
