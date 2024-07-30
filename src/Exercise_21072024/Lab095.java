package Exercise_21072024;

import java.util.Scanner;

public class Lab095 {
    public static void main(String[] args) {
        //Program to find factorial
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. for factorial : ");
        int user_input = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <=user_input ; i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of " + user_input + " is :" + fact);
    }
}
