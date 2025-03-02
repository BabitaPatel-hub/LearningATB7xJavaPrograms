package Exercise_10082024.encapsulation;

public class Lab133 {
    public static void main(String[] args) {

        ICICIBank bank1 = new ICICIBank("babita", 100000);
        System.out.println(bank1.getName());

        System.out.println(bank1.getBalance());

        bank1.setName("faisal", true);
        System.out.println(bank1.getName());

        bank1.setBalance(500000, true);
        System.out.println(bank1.getBalance());

    }
}
