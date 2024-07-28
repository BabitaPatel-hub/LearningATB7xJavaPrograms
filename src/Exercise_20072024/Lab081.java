package Exercise_20072024;

import java.util.Scanner;

public class Lab081 {
    public static void main(String[] args) {
        // Write a program to find highest no. among 3 numbers
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to find the highest no. among 3");
        System.out.println("Enter 1st number : ");
        int a1=sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int a2=sc.nextInt();
        System.out.println("Enter 3rd number : ");
        int a3=sc.nextInt();

        if (a1>a2 && a1>a3)
        {
            System.out.println("The highest no. is : " + a1);
        } else if (a2>a1 && a2>a3)
        {
            System.out.println("The highest no. is : " + a2);
        }else
        {
            System.out.println("The highest no. is : " + a3);
        }
    }
}
