package keywords.superEx.single;

public class ThisSuperTogether {
    public static void main(String[] args) {
        B b = new B("thisSuper");  // Parent Constructor Super
                                          //  Child Constructor thisSuper
        b.thisSuper();   //  10
                        // Parent method

    }
}
class A{
    int baseVar=10;
    String key;
    void thisSuper(){
        System.out.println(this.baseVar);
    }

    void display(){
        System.out.println("Parent method");
    }

    A(String keyword){  //parameterized constructor
        this.key=keyword;
        System.out.println("Parent constructor" +this.key);  // Parent Constructor Super
    }
}

class B extends A{
    String childVar="Child";
    String keys;
    void thisSuper(){

        //In this, variable , this and super work together
        System.out.println(super.baseVar);  // variable called from parent class
        System.out.println(this.childVar);  // variable called from same class


        //In this, method , this and super work together
        super.display();  // method called from parent
        this.thisSuper(); // method called from child

    }
     //In this constructor , this and super cannot work together
    // B is child constructor
    B(String keywrd){
        super("Super");  //calling parent constructor
        this.keys=keywrd;
        System.out.println("Child constructor" +this.keys); //calling current class constructor
    }
}