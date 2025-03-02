package Exercise_10082024.polymorphism.superthiskeyword;

import org.w3c.dom.ls.LSOutput;

public class Lab136 {
    //super keyword
    // can be used with variable, methods and constructors
    // it is used by child class to refer to its parent class
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }

}

class Car extends Vehicle {
    private int maxspeed = 150;
    Car()
    {
        super();       //constructor chaining
        System.out.println("DC Car");
    }
    Car(int a)
    {
        System.out.println("PC Car");
    }

    public void display()
    {
        System.out.println("Car speed is ->" + this.maxspeed);
        System.out.println("Vehicle speed is ->" + super.maxspeed);
        super.message();
        super.message(10);
        this.message();
    }

    @Override
    void message()
    {
        System.out.println("Hello Car");
    }
}

class Vehicle{

    public int maxspeed = 180;

    Vehicle()
    {
        System.out.println("DC Vehicle");
    }

    Vehicle(int a)
    {
        System.out.println("PC Vehicle");
    }

    void message()
    {
        System.out.println("Hello Vehicle");
    }

    void message (int a)
    {
        System.out.println("Hello Vehicle 2nd");
    }

}
