package Exercise_20072024;

import java.util.Scanner;

public class Lab065 {
    public static void main(String[] args) {
        /*Grade Calculator:
//        Write a program that calculates and displays the letter grade for a given numerical
//        score (e.g., A, B, C, D, or F)
//        based on the following grading scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59

Logic building
        1. Find user inputs and data type
        2. Rough logic
        if score is <100 or >90 then grade - A
        .
        .
        if score is <69 or >60 then grade - D
        else F
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score : ");
        float score = sc.nextFloat();

        if (score>=90 && score<=100)
        {
            System.out.println("Grade : A");
        }
        else if (score>=80 && score<=89) {
            System.out.println("Grade : B");
        }
        else if (score>=70 && score<=79) {
            System.out.println("Grade : C");
        }
        else if (score>=60 && score<=69) {
            System.out.println("Grade : D");
        }
        else if (score>=0 && score<=59) {
            System.out.println("Grade : F");
        }else
        {
            System.out.println("Impossible");
        }

    }
}
