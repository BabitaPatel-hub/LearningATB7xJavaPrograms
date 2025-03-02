package Exercise_10082024.polymorphism.superthiskeyword;

public class Lab139_SuperRepeat {
    public static void main(String[] args) {
        baseTest ref = new testCase1(); //Dynamic distpatching
        ref.setBrowser("Safari" , true);
        ref.getBrowser();
        ref.openBrowser("opera");
        ref.closeBrowser();
    }
}

class testCase1 extends baseTest
{

    testCase1(){
        super(); //Calling DC of parent class
        System.out.println("DC-TestCase1");
    }
    testCase1(String xyz)
    {
        System.out.println("PC-TestCase1");
    }

    @Override
    public void setBrowser(String browser, boolean isauth){
        super.setBrowser(browser, isauth);
    }
}

class baseTest
{

    baseTest()
    {
        System.out.println("DC-BaseTest");
    }
    baseTest(String abc)
    {
        System.out.println("PC-BaseTest");
    }

    private String Browser;

    public String getBrowser()
    {
        return Browser;
    }

    public void setBrowser(String browser, boolean isauth)
    {
        if(isauth)
        {
            this.Browser = browser;
            System.out.println("Browser is : " + Browser);
        } else
        {
            System.out.println("Not allowed");
        }
    }

    public void openBrowser()
    {
        System.out.println("Chrome browser");
    }

    public void openBrowser(String browserName)
    {
        System.out.println("Open " + browserName + " browser");
    }

    public void closeBrowser()
    {
        System.out.println("Close browser");
    }
}
