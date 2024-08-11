package Exercise_04082024.SingleInheritance.RealExample;

public class Lab129 {
    public static void main(String[] args) {

        new Testcase2().startBrowser();
        System.out.println("-----");

        new Testcase2().testCase2();
        System.out.println("-----");

        new Testcase1().testcase();
        System.out.println("-----");

        Testcase2 t2 = new Testcase2();//object initialization

        t2.startBrowser();
        t2.closeBrowser();
        t2.getSQLData();
        System.out.println("-----");

        Testcase1 t1 = new Testcase1();
        t1.getSQLData();

    }
}
