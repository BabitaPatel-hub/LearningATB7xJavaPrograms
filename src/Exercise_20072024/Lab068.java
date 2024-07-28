package Exercise_20072024;

import java.util.Scanner;

public class Lab068
{
    public static void main(String[] args)
    {
        //Switch condition
        //Write a program to check today's day
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of the day : ");
        int day = sc.nextInt();

        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No idea, which day it is");
        }
    }
}
