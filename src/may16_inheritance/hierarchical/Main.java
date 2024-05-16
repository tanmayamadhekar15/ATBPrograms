package may16_inheritance.hierarchical;

public class Main {
    public static void main(String[] args) {
        //dynamic dispatch-To access parent class using child class object creation
        Vehicle v1 = new Car();
        v1.vehicleHasTopSpeed();

    }
}
