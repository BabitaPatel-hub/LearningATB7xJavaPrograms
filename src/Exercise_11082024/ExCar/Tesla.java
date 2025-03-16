package Exercise_11082024.ExCar;

public class Tesla extends Engine{

    void Drive(){
        openDoor();
        closeDoor();
        startCar();
        speed();
        stopCar();
    }

    @Override
    void startCar() {
        System.out.println("Start Tesla");
    }

    @Override
    void partOfGearBox() {
        System.out.println("Part of the gearbox");
    }

    @Override
    void stopCar() {
        System.out.println("Stop Tesla");
    }

    @Override
    void speed(){
        System.out.println("Tesla's speed is 1000kmph");
    }

    @Override
    void openDoor() {
        System.out.println("Open Tesla");
    }

    @Override
    void closeDoor() {
        System.out.println("Close Tesla");
    }
}
