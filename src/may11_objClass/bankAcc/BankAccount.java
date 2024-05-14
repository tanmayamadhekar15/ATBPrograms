package may11_objClass.bankAcc;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode;

    BankAccount(){ // default constructor  - 0 params
        bankName = "SBI";
        bankCode = "SBI001";
        balance= 0;
    }
    //Constructor overloading - same name but different parameters
    BankAccount(int balance, String bankCode,String bankName) { //Constructor overloading  3 params
        this.bankName = bankName;
        this.balance = balance;
        this.bankCode = bankCode;
    }

    BankAccount(String bankName, String bankCode) { //Constructor overloading - 2 params
        this.bankName = bankName;
        this.bankCode = bankCode;
    }

    void printDetails() {
        System.out.println("Bank Name -> " + bankName);
        System.out.println("Bank Code -> " + bankCode);
        System.out.println("Bal ->" + balance);
    }

}
