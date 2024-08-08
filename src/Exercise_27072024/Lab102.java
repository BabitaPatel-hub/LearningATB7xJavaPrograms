package Exercise_27072024;

import java.util.Scanner;

public class Lab102 {
    public static void main(String[] args) {
        int arr1[] = new int[10];
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values");
        arr1[0] = sc.nextInt();
        arr1[1] = sc.nextInt();
        arr1[2] = sc.nextInt();

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
    }
}
