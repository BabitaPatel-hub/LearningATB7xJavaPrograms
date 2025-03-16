package Exercise_11082024.StaticKeyword;

public class Lab146 {
    public static void main(String[] args) {

        ATB atb = new ATB("Babita");
        System.out.println(atb.getName());
        System.out.println(ATB.coursename);

        ATB atb1 = new ATB("Faisal");
        System.out.println(atb1.getName());

        atb.setName("New Name");
        System.out.println(atb.getName());

        ATB.doAssignment();

    }
}

class ATB{
    {
        //Instance initialization block
        System.out.println("IIB");
        //Here write a code which you want to run before starting web automation
        //It will get executes as soon as instance initializes
    }

    static {
        System.out.println("Load the class, I'll get excuted");
    }

    //Static - variable, methods, blocks and class

    private String name;
    static String coursename = "ATB7X";

    public ATB(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static void doAssignment(){
        System.out.println("Do Assignment");
    }

}
