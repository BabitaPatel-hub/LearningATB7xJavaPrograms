package Exercise_27072024;

public class Lab104 {
    public static void main(String[] args) {
        int arr1[] = new int[5];
        arr1[1] = 50;

        System.out.println(arr1[1]);
        System.out.println(arr1[3]);

        final int a = 90;
        System.out.println(a);
        //a=80; //cannot change as final is given

        //in array, final does not finalize the value
        // but it finalizes the array length

    }
}
