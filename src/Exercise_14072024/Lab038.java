package Exercise_14072024;

public class Lab038 {
    public static void main(String[] args) {
        //Typecasting
        // Types of typecasting : Widening and Narrowing
        // 2 ways to do typecasting : Implicit and Explicit

        //Widening
        byte a = 50;
        int b = a; // Valid - Implicit typecasting (JVM will do byself)
        int b1 = (int)a; // Valid - Explicit typecasting
        System.out.println(a);
        System.out.println(b);
        System.out.println(b1);

        //Narrowing
        int i = 1000;
        //byte j = i; //Invalid - Implicit typecasting is not possible
        byte j1 = (byte)i; //Explicit typecasting (Loss of data)

        //System.out.println(i);
        //System.out.println(j);
        System.out.println(j1);

    }
}
