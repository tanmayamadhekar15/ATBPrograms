package keywords.superEx.multilevel;

public class Puppy extends Dog {
    //Override is a notation to mark function with same name used in other class
    // Super is used to access adjacent base class methods which has same function name. If method is absent then it goes
    // to next adjacent class from bottom to up

    @Override
    void eat() {

        super.eat();
    }

}
