package Exercise_11082024.ExCar;

public class WagonR extends Engine {
    void Drive(){
        openDoor();
        closeDoor();
        startCar();
        speed();
        stopCar();
    }

    @Override
    void startCar() {
        System.out.println("Start WagonR");
    }

    @Override
    void partOfGearBox() {
        System.out.println("Part of the gearbox");
    }

    @Override
    void stopCar() {
        System.out.println("Stop WagonR");
    }

    @Override
    void speed(){
        System.out.println("WagonR's speed is 800kmph");
    }

    @Override
    void openDoor() {
        System.out.println("Open WagonR");
    }

    @Override
    void closeDoor() {
        System.out.println("Close WagonR");
    }
}
