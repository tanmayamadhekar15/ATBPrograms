package may11_objClass.bankAcc;

public class BankMain {
    public static void main(String[] args) {
        BankAccount sbi_ref = new BankAccount();
        sbi_ref.printDetails();

        BankAccount hdfc_ref = new BankAccount(10, "HDFC001", "HDFC");
        hdfc_ref.printDetails();

        BankAccount icici_ref = new BankAccount(20, "ICIC0010", "ICIC");
        icici_ref.printDetails();

        BankAccount yesbank_ref = new BankAccount("YES BANK", "YES005");
        yesbank_ref.printDetails();
    }
}
/*
Bank Name -> SBI
Bank Code -> SBI001
Bal ->0
Bank Name -> HDFC
Bank Code -> HDFC001
Bal ->10
Bank Name -> ICIC
Bank Code -> ICIC0010
Bal ->20
Bank Name -> YES BANK
Bank Code -> YES005
Bal ->0
 */