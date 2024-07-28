package Exercise_20072024;

import java.util.Scanner;

public class Lab080 {
    public static void main(String[] args) {
        //Write a program to check if entered no. is positive, negative or zero
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = sc.nextInt();

        if (number > 0)
        {
            System.out.println("Entered no. is a positive number");
        } else if (number < 0)
        {
            System.out.println("Entered no. is a negative number");
        }else
        {
            System.out.println("Number is zero");
        }
    }
}
