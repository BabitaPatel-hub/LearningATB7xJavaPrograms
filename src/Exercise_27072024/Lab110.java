package Exercise_27072024;

public class Lab110 {
    public static void main(String[] args) {
        //Array - single dimensional, 2-D, 3-D, 4-D
        //Single dimensional are imp, remaining are not used in automation

        //Single dimensional array
        int arr1[] = {10,20,30,40,50};
        int arr2[] = new int[10];

        //Multi dimensional array
        int arr3[][] = new int[3][4];
        arr3[0][0] = 10;
        arr3[0][1] = 20;
        arr3[0][2] = 30;
        arr3[1][0] = 40;
        arr3[1][1] = 50;
        arr3[1][2] = 60;
        arr3[2][0] = 70;
        arr3[2][1] = 80;
        arr3[2][2] = 90;

        System.out.println(arr3[2][3]);
    }
}
