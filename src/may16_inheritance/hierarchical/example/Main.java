package may16_inheritance.hierarchical.example;

public class Main {
    public static void main(String[] args) {
        //dynamic dispatch
        Shape s=new Circle();
        s.parent();

        Shape s1=new Rectangle();
        s1.parent();

        Shape s2=new Square();
        s2.parent();

        Circle c=new Circle();
        c.child3();
        c.parent();

        Rectangle r=new Rectangle();
        r.child2();
        r.parent();

        Square sq=new Square();
        sq.child1();
        sq.parent();
    }
}
