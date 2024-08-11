package Exercise_04082024;

public class Lab124 {
    public static void main(String[] args) {
        //DC
        ATBPerson per = new ATBPerson();
        new ATBPerson();
        new ATBPerson();
        //3 objects will be created

        System.out.println(per.name);
        System.out.println(per.phone);
        System.out.println("--------");

        //DC
        ATBPerson ref1 = new ATBPerson();
        System.out.println(ref1.name);
        System.out.println(ref1.phone);
        System.out.println("--------");

        //PC
        ATBPerson ref2 = new ATBPerson("Babita");
        System.out.println(ref2.name);
        System.out.println(ref2.phone);
        System.out.println("--------");

        ATBPerson ref3 = new ATBPerson(99009090);
        System.out.println(ref3.name);
        System.out.println(ref3.phone);
        System.out.println("--------");

        ATBPerson ref4 = new ATBPerson("Babita", 98989000);
        System.out.println(ref4.name);
        System.out.println(ref4.phone);

    }
}
