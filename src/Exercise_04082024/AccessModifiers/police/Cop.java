package Exercise_04082024.AccessModifiers.police;

public class Cop {

    protected int gun;
    private String idCard;

    protected Cop(int gun)
    {
        this.gun = gun;
    }

    protected void CanIShoot(){
        System.out.println("Yes, you can!");
    }
}
