package may18_encapsulationPoly.polymorphism.overloading;

public class methodOverloading {
    //methodOverloading - Same method name with
    //but change of different parameters, change of datatype, change of order parameters
    // Compile time polymorphism
    void Gift(String a){
        System.out.println("A is a String" +  a);
    }

    int Gift(int x){
        System.out.println("X is a Int" +  x);
        return x;
    }

    int Gift(float x){
        System.out.println("X is a Int" +  x);
        return 89;
    }

    void Gift(double x){
        System.out.println("X is a double" +  x);
    }

    public static void main(String[] args) {
        methodOverloading p = new methodOverloading();
        p.Gift(10);  //compile time poly as it knows which method is used
        p.Gift("Rose");
    }
}
