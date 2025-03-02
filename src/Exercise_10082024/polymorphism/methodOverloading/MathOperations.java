package Exercise_10082024.polymorphism.methodOverloading;

public class MathOperations {
    /*
    Polymorphism
    - compile time / static/ method overloading
            same method name with different arguments in different classes
    - runtime / dynamic/ method overriding
            same method name in parent and child so that child will override the method using @override annotation
     */
    //Encapsulation - private data members
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String NAME)
    {
        this.name = NAME;
    }

    int add(int a, int b)
    {
        return a+b;
    }

    double add(double a, double b)
    {
        return a+b;
    }

    String add(String a, String b)
    {
        return a+b;
    }

    int add(int a, int b, int c)
    {
        return a+b+c;
    }

    String add(String a, int b)
    {
        return a+b;
    }
}
