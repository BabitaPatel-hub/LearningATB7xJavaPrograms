package Exercise_04082024;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode;

    //DC
    BankAccount()
    {
        bankName = "SBI";
        balance = 1000;
        bankCode = "SBI001";
        System.out.println("DC is created");
    }

    //PC
    BankAccount(String bname, int bal, String bcode)
    {
        this.bankName = bname;
        this.balance = bal;
        this.bankCode = bcode;
    }

    void printDetails()
    {
        System.out.println("Bank name is : " + bankName);
        System.out.println("Balance is : " + balance);
        System.out.println("Bank code is : " + bankCode);
    }

}
