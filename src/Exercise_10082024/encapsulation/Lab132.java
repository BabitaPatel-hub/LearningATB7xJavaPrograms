package Exercise_10082024.encapsulation;

public class Lab132 {

    public static void main(String[] args) {
       /* VWOLogin vwo1 = new VWOLogin();
        System.out.println(vwo1.userName);
        vwo1.userName = "babita";
        System.out.println(vwo1.userName);
        */

        /*
        VWOLogin vwo2 = new VWOLogin("babita", "12345", "signin");
        System.out.println(vwo2.userName);
        System.out.println(vwo2.userName="faisal");
        System.out.println(vwo2.password);
        System.out.println(vwo2.signInButton);
         */

        VWOLogin vwo3 = new VWOLogin("babita", "12345", "signin");
        System.out.println(vwo3.getuserName());
        System.out.println(vwo3.getPassword());
        System.out.println(vwo3.getSignInButton());

        System.out.println("---------------------");

        vwo3.setUserName("faisal");
        System.out.println(vwo3.getuserName());

        vwo3.setPassword("99999");
        System.out.println(vwo3.getPassword());

        String temp = vwo3.setPassword("No Password");
        System.out.println(temp);

        vwo3.setSignInButton("SIGNIN", true);
        System.out.println(vwo3.getSignInButton());

    }
}
