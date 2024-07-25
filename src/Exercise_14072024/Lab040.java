package Exercise_14072024;

public class Lab040 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.37f;
        int total_price = course + (int)GST; // Narrowing - Explicit typecasting...Loss of data

        float total_price_float = course + GST;

        System.out.println(total_price);

        System.out.println(total_price_float);
    }
}
