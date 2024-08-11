package Exercise_04082024.AccessModifiers.police;

public class JrCop {
    public static void main(String[] args) {
        Cop copref= new Cop(50);
        System.out.println(copref.gun);
        copref.CanIShoot();
    }
}
