package Exercise_11082024.ExReal;

import Exercise_04082024.HierarchicalInheritance.Father;

public class Lab142 {
    public static void main(String[] args) {

        Chrome c = new Chrome();
        String ret = c.openBrowser("Chrome");
        System.out.println(ret);
        c.closeBrowser("Chrome");
        c.takeScreenshot();

        System.out.println("--------------------------");

        Firefox f = new Firefox();
        f.openBrowser("Firefox");
        f.closeBrowser("Firefox");
        f.takeScreenshot();
    }
}
