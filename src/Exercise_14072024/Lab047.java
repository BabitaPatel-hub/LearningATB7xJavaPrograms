package Exercise_14072024;

public class Lab047 {
    public static void main(String[] args) {
        String s1 = "Babita";
        //string created 1, SCP
        s1 = "Patel";
        //string created 2, SCP
        s1 = "MiddleName";
        //string created 3, SCP
        s1 = "Babita";
        //string created 3, SCP
        System.out.println(s1);

        String str1 = new String("Fais");
        String str2 = new String("Qadeer");
        //string created 2, HEAP
        String str3 = str1;
        str3 =  str2;
        //string created 3, SCP
        System.out.println(str3);

    }
}
