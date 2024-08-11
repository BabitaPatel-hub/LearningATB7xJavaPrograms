package Exercise_04082024.HasARelationship;

public class Car {

    //Aggregation -Has-A relationship

    // No need of extends in has-a relationship

    //Car has engine
    //Car has tyres

    void startTheCar()
    {
        new Engine().start();

        new Tyres().rolling();
    }

}
