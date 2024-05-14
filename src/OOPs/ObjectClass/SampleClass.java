package OOPs.ObjectClass;

public class SampleClass {
    //instance variables
    int side;
    int length;
    int breadth;
    //using getter
    public int getLength() {
        return length;
    }
    public int getSide() {
        return side;
    }
    public int getBreadth() {
        return breadth;
    }

    //Default/ Non-parameterized Constructor
    SampleClass(){
        this.side=2;
        this.length=2;
        this.breadth=4;
    }
    //method
    void triangleArea(){
        System.out.println("Area of a triangle : " + (side*side));
    }
    //method
    void rectangleArea(){
        System.out.println("Area of a rectangle :" + (length*breadth));
    }

}
