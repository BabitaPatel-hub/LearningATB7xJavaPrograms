package Exercise_10082024.encapsulation;

public class ICICIBank {

    private String name;
    private long balance;

    public ICICIBank(String name, long balance)
    {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, boolean is_admin) {
        if(is_admin) {
            this.name = name;
            System.out.println("Allowed");
        }else {
            System.out.println("Not Allowed");
        }
    }

    public long getBalance() {
            return balance;
    }

    public void setBalance(long balance, boolean is_admin) {
        if(is_admin) {
            this.balance = balance;
            System.out.println("Allowed");
        }else
        {
            System.out.println("Not Allowed");
        }
    }
}
