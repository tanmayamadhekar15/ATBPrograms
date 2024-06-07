package may18_encapsulationPoly.encapsulation;

public class Bank {
    //Encapsulation - make variables as private,
    // create getter and setter methods
    // access variables through methods

    private String name;
    private int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    void display(){
        System.out.println(name+ " " +balance);
    }

}
