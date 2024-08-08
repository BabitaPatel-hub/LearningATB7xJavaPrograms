package Exercise_27072024;

public class Lab115 {
    public static void main(String[] args) {
        //String - immutable in nature
        //immutable means, whenever we create a string it will acquire memory
        String s1 = "Babita";
        s1 = "Test";
        System.out.println(s1);
        System.out.println("-----------");
        //Babita will be there in memory and test will also be there in memory, 2 strings will be created


        //2 more string classes are also there : StringBuilder and StringBuffer
        //Above 2 are mutable in nature
        //mutable means, garbage collector will remove the previous value and save new one, which saves memory

        //StringBuffer
        StringBuffer SB = new StringBuffer("Babita");
        SB.append("Patel");
        System.out.println(SB);
        System.out.println("-----------");

        //StringBuilder
        StringBuilder SBL = new StringBuilder("Faisal");
        SBL.append("Qadeer");
        System.out.println(SBL);

        //StringBuilder is more often used in automation
        //StringBuffer is thread safe and synchronized and due to that it is slow
        //StringBuilder is not thread safe and non synchronized and due to that it is fast.

    }
}
