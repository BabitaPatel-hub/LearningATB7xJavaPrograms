package Exercise_04082024;

public class Lab125 {
    public static void main(String[] args) {
        BankAccount ref1 = new BankAccount();
        System.out.println(ref1.bankName);
        System.out.println(ref1.balance);
        System.out.println(ref1.bankCode);
        System.out.println("-------------");

        BankAccount ref2 = new BankAccount("ICICI", 100, "ICICI001");
        System.out.println(ref2.bankName);
        System.out.println(ref2.balance);
        System.out.println(ref2.bankCode);
        System.out.println("-------------");

        ref1.printDetails();
        System.out.println("-------------");
        ref2.printDetails();
    }
}
