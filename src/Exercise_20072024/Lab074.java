package Exercise_20072024;

public class Lab074 {
    public static void main(String[] args) {
        // Multiple values can be given as case values
        // Allowed from JDK13

        int itemcode = 007;
        switch(itemcode)
        {
            case 001, 002, 003 :
                System.out.println("It's a electronic gadget");
                break;
            case 004, 005, 006 :
                System.out.println("It's a mechanical gadget");
                break;
            default :
                System.out.println("None");
        }
    }
}
