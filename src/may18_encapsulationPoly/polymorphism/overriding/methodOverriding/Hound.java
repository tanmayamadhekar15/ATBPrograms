package may18_encapsulationPoly.polymorphism.overriding.methodOverriding;

public class Hound extends Dog{
    @Override  //same function name is present in parent class, which is overridden
    void bark(){
        System.out.println("I am Hound, I will Bark!!");
    }
}
