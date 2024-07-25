package Exercise_14072024;

public class Lab051 {
    public static void main(String[] args) {
        String str1 = "The testing academy"; //SCP
        String str2 = "The testing academy"; //SCP

        String str3 = new String("The testing academy");  //HEAP

        System.out.println(str1==str2); //Check for the reference
        System.out.println(str1==str3); //Check for the reference, belongs to different storage i.e. SCP and Heap
        System.out.println(str2==str3); //Check for the reference, belongs to different storage i.e. SCP and Heap

        System.out.println(str1.equals(str2)); //Check for the content
        System.out.println(str1.equals(str3)); //Check for the content
        System.out.println(str2.equals(str3)); //Check for the content

    }
}
