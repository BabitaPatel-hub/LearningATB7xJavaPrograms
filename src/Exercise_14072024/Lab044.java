package Exercise_14072024;

public class Lab044 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        //++a - 11, a=11
        //+
        //a++ - 11, a-12
        //+
        //a++ - 12, a-13
        System.out.println(a);
    }
}
