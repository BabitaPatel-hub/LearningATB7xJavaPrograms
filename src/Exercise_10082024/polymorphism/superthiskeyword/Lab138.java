/*

package Exercise_10082024.polymorphism.superthiskeyword;

import Exercise_04082024.SingleInheritance.RealExample.BaseTest;

import java.util.Optional;

public class Lab138 {

    public static void main(String[] args) {
        baseClass ref = new testCase1();
        ref.openBrowser();
        ref.closeBrowser();
    }
}

class testCase1 extends baseClass
{
    testCase1(){
        //Default constructor
        super(); //call default constructor of parent
        this.openBrowser();
        this.setBrowser("edge",true);
    }

    @Override
    public void setBrowser(String browser, boolean is_auth)
    {
        super.setBrowser(browser, is_auth);
    }
}


class baseClass
{
    private String browser;

    baseClass() //Default constructor
    {
        System.out.println("DC->BaseClass");
    }
    baseClass(String temp) //Parameterised constructor
    {
        System.out.println("PC->BasClass");
    }
    public String getBrowser() //getter and setter
    {
        return browser;
    }
    public void setBrowser(String browser, boolean is_auth)
    {
        if(is_auth) {
            this.browser = browser;
        }else
        {
            System.out.println("Not Allowed");
        }
    }

    void openBrowser() //method overloading
    {
        System.out.println("Chrome Browser");
    }

    void openBrowser(String browser)
    {
        System.out.println("Open Browser ->" + browser);
    }

    void closeBrowser()
    {
        System.out.println("Close browser");
    }
}

*/
