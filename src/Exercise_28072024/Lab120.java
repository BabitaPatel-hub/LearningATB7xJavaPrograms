package Exercise_28072024;

public class Lab120 {
    public static void main(String[] args) {

        Bank sbi = new Bank();
        sbi.name = "Babita";
        sbi.balance = 10000;

        sbi.balanceCheck();
        System.out.println(sbi.name);

        Bank icici = new Bank();
        icici.name = "Faisal";
        icici.age = 40;
        System.out.println(icici.age);

        icici.deposit();
        icici.withdraw();

    }
}
