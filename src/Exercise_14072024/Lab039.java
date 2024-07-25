package Exercise_14072024;

public class Lab039 {
    public static void main(String[] args) {
        // Narrowing
        long phone_no = 9425330000l;
        short s = (short) phone_no; // Explicit typecasting...Loss of data
        System.out.println(s);

    }
}