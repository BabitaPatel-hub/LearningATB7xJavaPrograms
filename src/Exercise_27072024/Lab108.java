package Exercise_27072024;

import java.util.Scanner;

public class Lab108 {
    public static void main(String[] args) {
        //Write a program to take marks for 5 subjects and calculate it's average
        Scanner sc = new Scanner(System.in);
        float marks[] = new float[5];
        for (int i = 0; i < marks.length; i++)
        {
            System.out.print("Enter marks for subject " + (i+1) + ": ");
            marks[i] = sc.nextFloat();
        }

        float average = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;

        System.out.println("Average of all subjects : " + average);

        int j=0;
        while(j<marks.length)
        {
            marks[j] = sc.nextFloat();
            j++;
        }


    }
}
