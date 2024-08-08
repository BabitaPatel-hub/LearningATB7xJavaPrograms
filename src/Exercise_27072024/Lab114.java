package Exercise_27072024;

public class Lab114 {
    public static void main(String[] args) {
        //Strings can be defined in 2 ways:
        String name = "Babita";                   //String constant pool
        String s1 = new String("Test");   //Heap area

        //String is immutable in nature

        System.out.println(name.length());
        System.out.println(name.indexOf("i"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(4));

    }
}
