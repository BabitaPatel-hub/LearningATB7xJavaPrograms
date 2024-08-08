package Exercise_27072024;

public class Lab101 {
    public static void main(String[] args) {
        //define array in 2 ways :
        //int arr1[] = {1,2,3,4,5,6};
        //int arr2[] = new int[];

        int arr1[] = new int[5];
        //array length - 5
        //index-0,1,2,3,4

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        //default value is 0 for integer type array

        String str[] = new String[5];
        System.out.println(str[0]);

        char grade[] = new char[5];
        System.out.println(grade[3]);
    }
}
