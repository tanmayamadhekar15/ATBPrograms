package may07_functions;

public class Ex93 {
    public static void main(String[] args) {
        f2();  // calling multiple times - reusability code
        f1();
        f1();
        f2();
        f1();

    }
    static void f1(){ // Definition
        System.out.println("Function 1 called");
    }

    static void f2(){
        System.out.println("Function 2 called");
    }
}
