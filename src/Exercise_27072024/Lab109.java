package Exercise_27072024;

import java.util.Arrays;

public class Lab109 {
    public static void main(String[] args) {
        //Write a program to find max salary
        int salary[] = {10,20,15,5,41,25,12,60};
        int max=salary[0];
        for (int i = 0; i < salary.length ; i++)
        {
            if (salary[i] > max)
            {
                max = salary[i];
            }
        }
        System.out.println(max);

        Arrays.sort(salary);
        System.out.println("Highest salary : " + salary[salary.length-1]);
        System.out.println("2nd highest salary : " + salary[salary.length-2]);

    }
}
