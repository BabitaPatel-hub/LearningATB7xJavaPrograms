package Exercise_27072024;

public class Lab099 {
    public static void main(String[] args) {
        //data types - primitive and non-primitive
        //primitive - byte, short, int, long, float, double, boolean, char
        //non primitive - string, enum, class etc.

        int marks[] = {95, 90, 75, 85, 90};
        //int marks[] = [100, 95, 99, 85, 80]; //wrong syntax

        long marks_12[] = {85l, 80l, 90l, 92l, 88l};

        float decimal[] = {10.15f, 50.12f, 90.51f, 65.20f, 40.15f};

        char grades_UC[] = {'A', 'B', 'C', 'D', 'E', 'F'};
        char grades_LC[] = {'a', 'b', 'c', 'd', 'e', 'f'};

        String list[] = {"bread", "butter", "curd", "paneer", "milk"};

        boolean B[] = {true, false, true};
        System.out.println(B[1]);

        System.out.println(marks[2]);
        System.out.println(list[3]);

        System.out.println("-----------------");
        System.out.println(marks.length);
        System.out.println("-----------------");
        System.out.println(marks[marks.length-2]);
        System.out.println("-----------------");

        for (int i = 0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }

    }
}
