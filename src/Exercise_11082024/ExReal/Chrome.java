package Exercise_11082024.ExReal;

public class Chrome extends BaseClass{

    @Override
    String openBrowser(String browsername) {
        System.out.println("Opening Chrome browser");
        return "Chrome browser is opened";
    }

    @Override
    String closeBrowser(String browsername) {
        System.out.println("Closing Chrome browser");
        return "";
    }
}
