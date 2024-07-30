package Exercise_21072024;

import java.util.Scanner;

public class Lab091 {
    public static void main(String[] args) {
        //Write a program to find even and odd between 1-100

        for (int i = 1; i <=100 ; i++)
        {
            if (i%2==0)
            {
                System.out.println("Even number-> " + i);
            }
            else
            {
                System.out.println("Odd number-> " + i);
            }
        }

        System.out.println("__________________________________");

        //Using continue
        for (int i = 1; i <=100 ; i++)
        {
            if (i%2==0)
            {
                System.out.println("Even number-> " + i);
                continue;
            }
            System.out.println("Odd number-> " + i);
        }

    }
}
