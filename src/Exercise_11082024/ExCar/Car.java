package Exercise_11082024.ExCar;

public class Car extends Engine {
    //Car user engine, gearbox, keys etc.
    //but we don't require to showcase all of these to the user
    //Abstraction is hide internal details and show only important features to the user

    @Override
    void startCar(){
        System.out.println("Starting the car");
    }

    @Override
    void stopCar() {
        System.out.println("Stopping the car");
    }

    @Override
    void speed() {
        System.out.println("Speed of the car");
    }

    @Override
    void partOfGearBox() {
        System.out.println("It's a part of the gearbox");
    }

    @Override
    void openDoor() {
        System.out.println("Opening door with keys");
    }

    @Override
    void closeDoor() {
        System.out.println("Closing door with keys");
    }
}
