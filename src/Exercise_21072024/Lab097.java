package Exercise_21072024;

public class Lab097 {
    public static void main(String[] args) {
        //Functions : 2 imp componentes of function :
        //define function
        //call function

        //4 types of function:
        //Without parameters and without return type
        //Without parameters and with return type
        //With parameters and without return type
        //With parameters and with return type

        //Call functions

        function_type1();
        System.out.println("--------------------------");

        String name = function_type2();
        System.out.println(name);
        System.out.println("--------------------------");

        function_type3("Babita");
        function_type3("Fais");
        System.out.println("--------------------------");

        int sum_result = function_type4(10,20);
        System.out.println(sum_result);
    }

    //Define functions
    //Without parameters and without return type
    static void function_type1()
    {
        System.out.println("Without parameters and without return type");
    }
    //Without parameters and with return type
    static String function_type2()
    {
        System.out.println("Without parameters and with return type");
        return "Babita";
    }
    //With parameters and without return type
    static void function_type3(String name)
    {
        System.out.println("With parameters and without return type");
        System.out.println("You have shared " + name);
    }
    //With parameters and with return type
    static int function_type4(int a, int b)
    {
        System.out.println("With parameters and with return type");
        return a+b;
    }
}
