package OOPs.constructor;

public class DefaultConstructor {

    int a;    // class variable
    int b;
    int c;
    //Approach 1 : created constructor using generate utility
    public DefaultConstructor(int c, int b, int a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    // Approach 2 : default constructor
    DefaultConstructor(){
        this.c=100;  //this points to current instance of class variable
        a=100;
        b=10;
        System.out.println(c);
    }

    void add(){
        System.out.println(a+b);
        System.out.println("Hi");
    }
    // main method
    public static void main(String[] args) {
        DefaultConstructor dc=new DefaultConstructor();
        dc.add();

    }
}
