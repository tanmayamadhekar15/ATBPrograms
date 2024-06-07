package may18_encapsulationPoly.encapsulation;

public class Runner {
    public static void main(String[] args) {
        // variable are access through get,set methods
        Bank b=new Bank();
        //b.name ="Jack"  -- no direct variable is accessible
        b.setName("John");
        b.setBalance(20000);
        b.display();
    }
}
