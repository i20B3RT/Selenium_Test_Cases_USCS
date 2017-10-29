/**
 * Created by fwrmoral on 10/28/2017.
 */
//package com.demo.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class chromeTestCase {

    public static void main(String[] args) {
        //TODO auto generate method stub
        String myURL = ("http://10.1.100.197:9109");
        String myLOGIN =("/ewm/login.html");
        String myHOME =("/ewm/home.htm");

        String os = System.getProperty("os.name").toLowerCase();

        WebDriver driver = new ChromeDriver();

        if (os.contains("mac")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "i20B3RT/Google Drive/Selenium/Chrome_Driver/");
        } else {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "fwrmoral/Google Drive/Selenium/Chrome_Driver/chromedriver.exe");
        }


        //////////////////////////////////////////////////////////////////////////////////////////////////
        // Open eWM login page
        driver.get(myURL+myLOGIN);

        //////////////////////////////////////////////////////////////////////////////////////////////////
        // Maximize browser
        driver.manage().window().maximize();

        //////////////////////////////////////////////////////////////////////////////////////////////////
        //input username
        WebElement myElement = driver.findElement(By.name("j_username"));
        myElement.sendKeys("fwrmoral");


        //////////////////////////////////////////////////////////////////////////////////////////////////
        //input password
        WebElement myPass = driver.findElement(By.name("j_password"));
        myPass.sendKeys("Password123");


        //////////////////////////////////////////////////////////////////////////////////////////////////
        //click on the submit button to login
        driver.findElement(By.name("btn_login")).click();

    }
}
