package Exercise_20072024;

import java.util.Scanner;

public class Lab062
{
    public static void main(String[] args)
    {
    //Program to find even odd number
        /*
        Logic building:
        - Figure out user inputs and data types
        - Do we need conversion or can use directly
        - Rough logic
        - Optimize the code
         */

        Scanner sc = new Scanner(System.in) ; //object of the scanner class
        System.out.print("Enter number : ");
        int user_input = sc.nextInt();
        //int a=656464656;
        if(user_input%2==0)
        {
            System.out.println("Even number");
        }else
        {
            System.out.println("Odd number");
        }
    }
}
