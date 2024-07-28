package Exercise_20072024;

public class Lab075 {
    public static void main(String[] args) {
        int itemcode = 001;
        switch(itemcode)
        {
            case 001 -> System.out.println("It's a laptop");
            case 002 -> System.out.println("It's a mobile phone");
            case 003, 004 -> System.out.println("It's a desktop");
            default -> System.out.println("None");
        }
    }
}
