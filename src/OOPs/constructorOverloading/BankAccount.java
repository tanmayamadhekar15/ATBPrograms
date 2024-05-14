package OOPs.constructorOverloading;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode;

    BankAccount(){ // default constructor
        bankName = "SBI";
        bankCode = "SBI001";
        balance= 0;
    }
    //Constructor overloading - same name but different parameters
    BankAccount(int balance, String bankCode,String bankName) { //Constructor overloading
        this.bankName = bankName;
        this.balance = balance;
        this.bankCode = bankCode;
    }

    BankAccount(String bankName, String bankCode) { //Constructor overloading
        this.bankName = bankName;
        this.bankCode = bankCode;
    }

    void printDetails() {
        System.out.println("Bank Name -> " + bankName);
        System.out.println("Bank Code -> " + bankCode);
        System.out.println("Bal ->" + balance);
    }

}
