package Exercise_10082024.encapsulation;

public class VWOLogin
{
    private String userName;
    private String password;
    private String signInButton;

    public VWOLogin(String userName, String password, String signInButton)
    {
        this.userName = userName;
        this.password = password;
        this.signInButton = signInButton;
    }

    /*
    Encapsulation :
    - It is a fundamental concept of OOPS
    - Data hiding
    - All data members should be private, whereas data methods should be public
    - Data members should be accessible using methods, should not allow to access using reference
     */

    public String getuserName()
    {
        return userName;
    }

    public String getPassword()
    {
        return password;
    }

    public String getSignInButton()
    {
        return signInButton;
    }

    public void setUserName(String UserName)
    {
        this.userName = UserName;
    }

    public String setPassword(String pwd)
    {
        this.password = pwd;
        return pwd;
    }

    public void setSignInButton(String SignIn, boolean is_auth)
    {
        if(is_auth)
        {
            this.signInButton = SignIn;
        } else
        {
            System.out.println("Not allowed");
        }
    }


}
