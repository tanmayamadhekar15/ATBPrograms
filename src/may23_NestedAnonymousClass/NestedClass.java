package may23_NestedAnonymousClass;

public class NestedClass {
    public static void main(String[] args) {
        //To access inner nested class, OuterClassName.InnerClassName reference=OuterClassReference.new InnerClassName();
        OuterClass oc=new OuterClass();
        OuterClass.InnerClass ic=oc.new InnerClass();// OuterClassName.InnerClassName reference=OuterClassReference.new InnerClassName();
        ic.innerMethod();
        oc.outerMethod();

    }
}
//Nested Class has outer and inner classes -  class within class to shield/secure the inner class
class OuterClass{
        int a=10;
        void outerMethod(){
            System.out.println("Outer class method");
        }

    class InnerClass{
        int b=1;
        void innerMethod(){
            System.out.println("Can access outer variables and methods :" +a);
            outerMethod();  //can access outer method
            System.out.println("Inner class variable :" +b);

        }
    } //end of inner class

} // end of outer class


/*
Can access outer variables and methods :10
Outer class method
Inner class variable :1
Outer class method
 */