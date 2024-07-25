package Exercise_14072024;

public class Lab052 {
    public static void main(String[] args) {
        String s1=new String("babita");
        String s2=new String("babita");
        String s3=new String("babita");
        // strings created - 3, HEAP

        System.out.println(s1==s2); //Check for the reference, stored in same loaction but different rooms
        System.out.println(s1.equals(s2)); //Check for the content

        //== operator check for the reference
        // new operator check for content
    }
}
