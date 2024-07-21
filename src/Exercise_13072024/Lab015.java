package Exercise_13072024;

public class Lab015 {

    public static void main(String[] args) {
        //printf
        int age=50;
        System.out.println("Your age is ->" + age);

        // %d ->  any integral - byte, short, int or long
        // %s -> String
        // %c -> char
        // %f -> float

        System.out.printf("your age is -> %d",age);

        float pi = 3.1445498989f;
        System.out.println("\n" + "The value of Pi is =" + pi);
        System.out.printf("The value of pi is = %f" , pi);
        System.out.print("\n");

        String name = "Babita";
        System.out.println("Your name is " + "   " + name);
        System.out.printf("Your name is %s" , name);
        System.out.print("\n");

        char grade='A';
        System.out.println(grade);
        System.out.printf("%c",grade);

        double distance=54.585997946464;
        System.out.println("\n" + "Distance between 2 cities is ->" + distance);
        System.out.printf("Distance is = %f", distance);
    }
}

