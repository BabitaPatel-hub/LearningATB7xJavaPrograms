package Exercise_04082024;

import java.util.Scanner;

public class Lab126 {
    public static void main(String[] args) {
        BankAccount ref1 = new BankAccount();

        Scanner sc = new Scanner(System.in);

       System.out.println("Enter your details : ");

       System.out.println("Bank name : ");
       String bName = sc.next();

       System.out.println("Balance : ");
       int bal = sc.nextInt();

       System.out.println("Bank code : ");
       String bCode = sc.next();


       BankAccount ref2 = new BankAccount(bName, bal, bCode);
       ref2.printDetails();
    }
}
