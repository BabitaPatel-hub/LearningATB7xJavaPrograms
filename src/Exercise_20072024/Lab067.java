package Exercise_20072024;

public class Lab067
{
    public static void main(String[] args)
    {
        //Nested if conditions
        if(true) {
            System.out.println("1");
            if (false) {
                System.out.println("2");
                if (true) {
                    System.out.println("3");
                }
            }
        }
    }
}
