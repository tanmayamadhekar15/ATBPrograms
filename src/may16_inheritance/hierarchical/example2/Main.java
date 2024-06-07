package may16_inheritance.hierarchical.example2;

public class Main {
    public static void main(String[] args) {
        Father f=new Son();
        f.hasShop();

        Father f1=new Daughter();
        f1.hasShop();

    }
}
