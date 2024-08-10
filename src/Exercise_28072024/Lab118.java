package Exercise_28072024;

public class Lab118 {
    public static void main(String[] args) {

        BuildingBP dlf = new BuildingBP();
        dlf.name = "DLF Builders";
        dlf.address = "Test address";

        dlf.lift();

        BuildingBP prestige = new BuildingBP();
        prestige.name = "Prestige Builders";
        prestige.no_of_rooms = 4;

        prestige.activities();

        BuildingBP brigade = new BuildingBP();
        brigade.name = "Brigade Builders";
        brigade.color = "Blue";
        brigade.no_of_rooms = 3;

        brigade.lift();

    }
}
