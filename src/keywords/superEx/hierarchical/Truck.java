package keywords.superEx.hierarchical;

public class Truck extends Vehicle {
    //accelerate is same function name overridden , super is used to access adjacent parent data/methods
    @Override
    void accelerate(int speed) {
        super.accelerate(speed);
    }
}
