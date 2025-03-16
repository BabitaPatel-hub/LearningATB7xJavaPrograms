package Exercise_11082024.MultipleInheritance;

public class Son implements Mother, Father{
    @Override
    public void home() {
        System.out.println("Method from father");
    }

    @Override
    public void loan() {
        System.out.println("Method from father/mother");
    }
}
