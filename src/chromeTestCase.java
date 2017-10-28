/**
 * Created by fwrmoral on 10/28/2017.
 */
//package com.demo.testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class chromeTestCase {

    public static void main(String[] args) {
        //TODO auto generate method stub

        String os = System.getProperty("os.name").toLowerCase();

        WebDriver driver = new ChromeDriver();

        if (os.contains("mac")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        } else {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
        }


        driver.get("http://www.google.com");

    }
}
