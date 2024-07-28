package Exercise_20072024;

import java.util.Scanner;

public class Lab078 {
    public static void main(String[] args) {
        //Write program to collect and print name, age and salary

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : " );
        String name = sc.next();
        System.out.print("Enter your age : " );
        int age = sc.nextInt();
        System.out.print("Enter your salary : " );
        int salary = sc.nextInt();

        System.out.println("---------------------------");
        System.out.println("your name is : " + name);
        System.out.println("your age is : " + age);
        System.out.println("your salary is : " + salary);
    }
}
