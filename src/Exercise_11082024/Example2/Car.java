package Exercise_11082024.Example2;

public class Car implements Engine{


    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }

    public void sf2() {
        System.out.println("SF2");
    }
}
