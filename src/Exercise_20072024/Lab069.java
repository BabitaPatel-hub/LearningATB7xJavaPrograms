package Exercise_20072024;

import java.util.Scanner;

public class Lab069 {
    public static void main(String[] args) {
        //Write a program to select and start browser
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser as per your wish : ");
        String browser = sc.next();
        browser = browser.toLowerCase();

        switch (browser)
        {
            case "chrome" :
                System.out.println("Start Google Chrome");
                // Further code to start the Chrome
                // Web driver driver = new Chrome(); // Selenium Code
                break;
            case "firefox" :
                System.out.println("Start Mozilla Firefox");
                break;
            case "Safari" :
                System.out.println("Start Safari");
                break;
            default :
                System.out.println("Browser not available");
        }

    }
}
