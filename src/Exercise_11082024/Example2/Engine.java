package Exercise_11082024.Example2;

public interface Engine {

    void startEngine();
    void stopEngine();

    default void justStartEngine(){
        System.out.println("Just Start Engine");
    }

    default void justStopEngine(){
        System.out.println("Just Stop Engine");
    }

    static void sf1(){
        System.out.println("SF1");
    }

}
