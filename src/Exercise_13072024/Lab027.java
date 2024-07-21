package Exercise_13072024;

public class Lab027 {
    public static void main(String[] args) {
        // Relational operators - boolean
        // >, <, >=, <=, ==, != ...........it will give true or false

        int b_age = 34;
        int f_age = 40;

        boolean result1 = b_age > f_age;
        System.out.println(result1);

        boolean result2 = b_age < f_age;
        System.out.println(result2);

        System.out.println("----------------------------");

        int b_age1 = 34;
        int f_age1 = 34;

        boolean result3 = b_age1 >= f_age1;
        System.out.println(result3);

        boolean result4 = b_age1 <= f_age1;
        System.out.println(result4);

        System.out.println("----------------------------");

        boolean result5 = b_age == f_age;
        boolean result6 = b_age1 == f_age1;

        System.out.println(result5);
        System.out.println(result6);

        System.out.println("----------------------------");

        System.out.println(b_age != f_age);
        System.out.println(b_age1 != f_age1);

    }
}
