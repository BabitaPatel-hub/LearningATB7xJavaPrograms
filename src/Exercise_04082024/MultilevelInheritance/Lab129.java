package Exercise_04082024.MultilevelInheritance;

public class Lab129 {
    public static void main(String[] args) {
        //GGF > GF > F > C
        Child c1 = new Child();
        c1.home();
        //if function name is same, then it will give priority to local then F, GF, GGF

        c1.c();
        c1.f();
        c1.gf();
        c1.ggf();
    }
}
