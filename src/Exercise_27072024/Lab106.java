package Exercise_27072024;

import java.util.Scanner;

public class Lab106 {
    public static void main(String[] args) {
        //Program to display week-days
        String days[] = new String[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days");
        for (int i = 0; i <= days.length-1; i++)
        {
            days[i] = sc.next();
        }
        for (int i = 0; i <= days.length-1; i++)
        {
            System.out.println(days[i]);
        }
    }
}
