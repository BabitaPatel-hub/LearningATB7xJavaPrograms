package Exercise_13072024;

public class Lab031 {
    public static void main(String[] args) {
        //   || -> OR
        System.out.println(true || true);   //true
        System.out.println(true || false);  //true
        System.out.println(false || true);  //true
        System.out.println(false || false); //false

        System.out.println("--------------------");

        //   && -> AND
        System.out.println(true && true);   //true
        System.out.println(true && false);  //false
        System.out.println(false && true);  //false
        System.out.println(false && false); //false

    }
}
