package JavaAssignments;

import java.util.Scanner;

public class LeapYear {

    //Write a program to check if given year is a leap year or not

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year : ");
        int year = sc.nextInt();

        if (year%4==0)
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
    }
}
