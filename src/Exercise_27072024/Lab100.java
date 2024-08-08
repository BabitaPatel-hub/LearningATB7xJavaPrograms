package Exercise_27072024;

public class Lab100
{
    public static void main(String[] args)
    {
        int arr1[] = {1,82,35,74,59};
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);
        //System.out.println(arr1[5]); //Index out of bound
        System.out.println("Array length is : "+ arr1.length + '\n');

        int[] arr2 = {100,90,80,70,60,50,40,00};
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
        System.out.println(arr2[4]);
       //System.out.println(arr2[-1]);  //Index out of bound
        System.out.println("Array length is : "+ arr2.length);
        System.out.println(arr2.length-1);
    }
}
