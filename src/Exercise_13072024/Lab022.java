package Exercise_13072024;

public class Lab022 {
    public static void main(String[] args) {

        //Escape characters

        String firstname = "Babita";
        String lastname = "Patel";

        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(firstname + lastname);

        System.out.println("------------------------");

        /*Escape characters
        \n = New line
        \t = tab
        \b = backlash, delete 1 char
        \r = backlash, delete 1 word
         */
        char c1 = '\n';
        char c2 = '\t';
        char c3 = '\b';
        char c4 = '\r';

        System.out.println("Babita" + "Patel");
        System.out.println("Babita" + c1+ "Patel");
        System.out.println("Babita" + c2+ "Patel");
        System.out.println("Babita" + c3+ "Patel");
        System.out.println("Babita" + c4+ "Patel");

    }
}
