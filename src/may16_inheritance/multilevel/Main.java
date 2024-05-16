package may16_inheritance.multilevel;

public class Main {
    public static void main(String[] args) {

        MarutiSuzuki ms=new MarutiSuzuki();
        ms.print();
        ms.inheritBase();
        ms.inheritDerived();

        //dynamic dispatch - Allows to access method/var of parent class without creating parent object
        // To access class using object created
        // parentclass obj=new childclass
        Vehicle v=new MarutiSuzuki();
        v.print();
    }
}
