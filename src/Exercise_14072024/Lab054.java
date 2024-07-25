package Exercise_14072024;

public class Lab054 {
    public static void main(String[] args) {
        String password = "Babita@123";
        String pwd = password.toLowerCase();
        System.out.println(password);
        System.out.println(pwd);

        System.out.println(password==pwd); //check for the reference
        System.out.println(password.equals(pwd));
        System.out.println(password.equalsIgnoreCase(pwd));

        System.out.println(password.substring(0,5));
        System.out.println(password.length());
        System.out.println(password.indexOf('1'));


    }
}
