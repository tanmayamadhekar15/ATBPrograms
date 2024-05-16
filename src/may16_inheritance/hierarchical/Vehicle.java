package may16_inheritance.hierarchical;

public class Vehicle {
    Vehicle(){
        System.out.println("DC Vehicle");
    }

    void vehicleHasTopSpeed(){
        System.out.println("Yeah from "+getClass().getSimpleName());
    }
}
