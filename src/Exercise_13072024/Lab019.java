package Exercise_13072024;

public class Lab019 {
    public static void main(String[] args) {
        //Calculator with fixed inputs

        int a=9991;
        int b=17;

        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        double div=a/b;

        System.out.println("Sum is ->" + sum);
        System.out.println("Substraction is ->" + sub);
        System.out.println("Multiplication is ->" + mul);
        System.out.println("Division is ->" + div);

        System.out.println("-------------------------");

        System.out.printf("Sum is -> %d\n",sum);
        System.out.printf("Substraction is -> %d\n",sub);
        System.out.printf("Multiplication is -> %d\n",mul);
        System.out.printf("Division is -> %f\n",div);

    }
}
