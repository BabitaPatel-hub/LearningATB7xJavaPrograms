package Exercise_14072024;

import java.util.Locale;

public class Lab046 {
    public static void main(String[] args) {
        //String can be initialized by 2 ways :
        //using assignment operator...stores in SCP
        //using new operator....stores in Heap as objects

        String str1 = "Babita";
        String str2 = new String ("Patel");

        //Both of them, actually save the strings but in different ways
        //How they store the values in the JVM?
        //SCP(string content pool) and Heap memory

        System.out.println(str1);
        System.out.println(str2);

        //use predefined string functions
        System.out.println(str1.length());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.charAt(3));
        System.out.println(str1.charAt(10)); //Indent 10 out of bounds

    }
}
