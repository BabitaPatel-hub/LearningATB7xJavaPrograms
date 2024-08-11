package Exercise_04082024.SingleInheritance;

public class Lab128 {
    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.home_d();
        d.home_f();

        Father f = new Father();
        f.home_f();
        //f.home_d(); //not allowed, as father do not extends daughter

        new Daughter().home_f();
    }
}
