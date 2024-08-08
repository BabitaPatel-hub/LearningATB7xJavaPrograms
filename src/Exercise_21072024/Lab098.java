package Exercise_21072024;

public class Lab098 {
    public static void main(String[] args) {

        //functions have below 2 important components :
        // define function and calling function

        //4 types of functions are possible :
        //- W/O return type, w/o parameters
        //- With return type, w/o parameters
        //- W/O return type, with parameters
        //- With return type, with parameters

        //Call function
        functiontype1();

        int age = functiontype2();
        System.out.println(age);
        System.out.print('\n');

        functiontype3("Babita Patel");
        functiontype3_1(34);
        System.out.print('\n');

        int multiply = functiontype4(20, 5);
        System.out.println(multiply);
    }

    //Define function
    //- W/O return type, w/o parameters
     static void functiontype1()
     {
         System.out.println("W/O return type, w/o parameters\n");
     }

    //- With return type, w/o parameters
    static int functiontype2()
    {
        System.out.println("With return type, w/o parameters");
        return 34;
    }

    //- W/O return type, with parameters
    static void functiontype3(String name)
    {
        System.out.println("W/O return type, with parameters");
        System.out.println(name);
    }
    static void functiontype3_1(int age1)
    {
        System.out.println(age1);
    }

    //- With return type, with parameters
    static int functiontype4(int a, int b)
    {
        System.out.println("With return type, with parameters");
        return a*b;
    }
}
