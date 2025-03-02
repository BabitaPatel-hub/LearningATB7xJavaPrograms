package Exercise_10082024.polymorphism.methodOverriding;

public class Lab135 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(dog.age);
        dog.bark();

        Hound hound = new Hound();
        System.out.println(hound.age);
        hound.bark();
        hound.newmethod();

        Dog dog_hound = new Hound(); //dynamic dispatch
        System.out.println(dog_hound.age);
        dog_hound.bark();
        //dog_hound.newmethod();........it should access common functions, and data variables
    }
}
