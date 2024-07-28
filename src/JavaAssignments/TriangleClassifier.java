package JavaAssignments;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides, determine
        // if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or
        // scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.
        // side1, side2, side3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 sides of the triangle : ");
        System.out.println("Enter value for 1st side :");
        int side1 = sc.nextInt();
        System.out.println("Enter value for 2nd side :");
        int side2 = sc.nextInt();
        System.out.println("Enter value for 3rd side :");
        int side3 = sc.nextInt();

        if (side1==side2 && side2==side3)
        {
            System.out.println("It's an Equilateral triangle");
        }
        else if (side1==side2 || side2==side3 || side3==side1)
        {
            System.out.println("It's an Isosceles triangle");
        }else
        {
            System.out.println("It's an Scalene triangle");
        }
    }
}
