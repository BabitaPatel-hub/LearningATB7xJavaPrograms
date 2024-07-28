package Exercise_20072024;

import java.util.Scanner;

public class Lab066
{
    public static void main(String[] args)
    {
        //Optimized code
         /*Grade Calculator:
//        Write a program that calculates and displays the letter grade for a given numerical
//        score (e.g., A, B, C, D, or F)
//        based on the following grading scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score : ");
        float score = sc.nextFloat();
        char Grade = 'X';

        if (score>=90 && score<=100)
        {
            Grade = 'A';
        }
        else if (score>=80 && score<=89) {
            Grade = 'B';
        }
        else if (score>=70 && score<=79) {
            Grade = 'C';
        }
        else if (score>=60 && score<=69) {
            Grade = 'D';
        }
        else if (score>=0 && score<=59) {
            Grade = 'F';
        }else
        {
            System.out.println("Impossible");
            Grade = 'O';
        }
        System.out.println("Your grade is :" + Grade);
    }

}
