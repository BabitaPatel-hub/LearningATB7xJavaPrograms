package Exercise_14072024;

public class Lab043 {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(a++ + ++a);
        //a++ = 20, a=21
        //+
        //++a = 22, a=22
        // 20+22 = 42
        System.out.println(a);
    }
}
