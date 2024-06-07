package keywords.superEx.single;

public class VariableSuper {
    public static void main(String[] args) {
        Car c=new Car();
        int sp=c.speed; //obj ref of Car so Car speed is accessed
        System.out.println(sp);  //40
        c.display(50);

    }
}

class Car extends Vehicle{ // child class extends parent - Single inheritance
    int speed = 40; //instance variable of Car class
    //private int speed=40;  //encapsulation - access through method

    // method with parameter and no returntype
    void display(int sp){
        System.out.println("Speed before overwrites :" +this.speed);  // 40
        this.speed=sp;  //refers to current instance class
        System.out.println("Speed of Vehicle : " +super.speed);  //super refers to Vehicle class-speed
        System.out.println("Speed of Car after overwrites: "+this.speed); //this refers to current Car class - speed but overwrites in main
        //50
    }
}


class Vehicle{ //base class
    int speed=100;   //instance variable of vehicle class
    // method with no returntype no parameter
    void msg(){
        System.out.println("This method is with no parameter no returntype");
    }

}

/*
40
Speed before overwrites :40
Speed of Vehicle : 100
Speed of Car after overwrites: 50
 */