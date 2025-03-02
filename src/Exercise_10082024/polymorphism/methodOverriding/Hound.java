package Exercise_10082024.polymorphism.methodOverriding;

public class Hound extends Dog {

    @Override
    void bark()
    {
        System.out.println("Hound -> I'll bark");
    }

    void newmethod()
    {
        System.out.println("New Method");
    }
}
