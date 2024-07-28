package Exercise_20072024;

import java.util.Scanner;

public class Lab063
{
    public static void main(String[] args)
    {
        //Program to find maximum number between two using if-else

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number :");
        int b = sc.nextInt();

        if (a>b)
        {
            System.out.println("Maximum no. is " + a);
        } else if (b>a)
        {
            System.out.println("Maximum no. is " + b);
        }else
        {
            System.out.println("Both are equal ");
        }

    }
}
