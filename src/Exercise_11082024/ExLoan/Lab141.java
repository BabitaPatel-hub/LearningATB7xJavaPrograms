package Exercise_11082024.ExLoan;

public class Lab141 {
    public static void main(String[] args) {
        // Father f1 = new Father(); // Can not create object for abstract class

        Son s1 = new Son();
        s1.loan50k();
        s1.loan1lakh();

        Father f1 = new Son(); //Dynamic dispatching
        f1.loan50k();
        f1.loan1lakh();
    }
}
