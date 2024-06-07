package may18_encapsulationPoly.polymorphism.overriding.methodOverriding;

public class Runner {
    public static void main(String[] args) {
        //Method overriding is run time polymorhism
        // also has concept of dynamic dispatch(whoever object creates)

        Dog d = new Dog();
        d.bark();  //I am Dog, I will Bark!!

       Hound h = new Hound();
       h.bark();  //I am hound, I will Bark!!

        Dog d1  = new Hound(); // Dynamic Dispatch, -> Runtime Polymorphism (object creation at runtime so runtime)
        d1.bark();  //I am hound, I will Bark!!

    }
}
