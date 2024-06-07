package keywords.superEx.hierarchical;

public class Car extends Vehicle{

    //accelerate is same function name overridden , super is used to access adjacent parent data/methods
    void accelerate(int speed){
        super.accelerate(speed);
    }
}
