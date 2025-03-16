package Exercise_11082024.ExInterface;

public class WagonR implements Engine{

    void Drive(){
        startEngine();
        stopEngine();
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping engine");
    }
}
