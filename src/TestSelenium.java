/**
 * Created by fwrmoral on 10/28/2017.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestSelenium {
    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "C://Users/fwrmoral/Google Drive/Selenium/Chrome_Driver/chromedriver.exe");
       // WebDriver driver = new ChromeDriver();

//        WebDriver driver = new ChromeDriver();
        String os = System.getProperty("os.name").toLowerCase();

        WebDriver driver = new ChromeDriver();

        if (os.contains("mac")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "i20B3RT/Google Drive/Selenium/Chrome_Driver/");
        } else {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "fwrmoral/Google Drive/Selenium/Chrome_Driver/chromedriver.exe");
        }

        driver.manage().window().maximize();
        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");


//        WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
//        element.sendKeys("abc@gmail.com");
//
//        WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
//        button.click();
    }
}


