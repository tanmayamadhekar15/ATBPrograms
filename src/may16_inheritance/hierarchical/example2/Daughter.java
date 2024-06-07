package may16_inheritance.hierarchical.example2;

public class Daughter extends Father{
    @Override
    void hasShop(){
        System.out.println("Daughter has jewellery shop");
        super.hasShop(); // super keyword access adjacent base class when method name is same by overriding
    }



}
