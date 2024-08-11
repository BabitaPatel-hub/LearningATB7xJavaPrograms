package Exercise_04082024;

public class ATBPerson {

    String name;
    long phone;

    //DC
    ATBPerson() {
        System.out.println("DC will be called when object will be created");
    }

    //Parameterized Constructor
    ATBPerson(String sname)
    {
        this.name = sname;
    }

    ATBPerson(long sphone){
        this.phone = sphone;
    }

    ATBPerson(String sname, long sphone)
    {
        this.name = sname;
        this.phone = sphone;
    }

}
