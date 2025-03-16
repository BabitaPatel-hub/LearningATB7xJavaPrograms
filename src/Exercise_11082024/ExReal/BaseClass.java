package Exercise_11082024.ExReal;

abstract class BaseClass extends GrandBaseClass {

    abstract String openBrowser(String browsername);
    abstract String closeBrowser(String browsername);

    @Override
    void takeScreenshot() {
        System.out.println("Take screenshot");
    }
}
