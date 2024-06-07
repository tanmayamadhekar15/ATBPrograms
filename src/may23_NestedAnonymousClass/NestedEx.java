package may23_NestedAnonymousClass;

public class NestedEx {
    public static void main(String[] args) {
        Car c = new Car("SUV");
        Car.Engine engine = c.new Engine("400CC");
        engine.start();
        c.drive();
        // Nested Class -class within class to shield the Inner Class.
        // Nested classes can have 'N' number of inner classes
    }
}

class Car {
    String type;  //outer class variable

    public Car(String type) {
        this.type = type;
    }
    // Method
    void drive() {
        System.out.println("You can drive the Car");
    }

        class Engine {  //inner class
            String horsePower;  // Instance Variables

            public Engine(String horsePower) {
                this.horsePower = horsePower;
             }
             // Method
            void start() {
                System.out.println("Engine is started!! -> " + type);
            }

            class GearBox {  //other inner class
                 void m2() {
                    System.out.println("m2");
                }

            class PP {  //inner class
                class OO { //most inner class

                }
            }
        }
    }
}
