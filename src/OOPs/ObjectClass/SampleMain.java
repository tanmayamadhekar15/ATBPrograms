package OOPs.ObjectClass;

public class SampleMain {
    public static void main(String[] args) {
        SampleClass sc=new SampleClass(); // Constructor is called atleast once at time of object creation
        System.out.println("Side :" +sc.getSide());
        sc.triangleArea();

        System.out.println("Length : " +sc.getLength());
        System.out.println("Breadth :"+sc.getBreadth());
        sc.rectangleArea();
    }
}
/*
Side :2
Area of a triangle : 4
Length : 2
Breadth :4
Area of a rectangle :8
 */