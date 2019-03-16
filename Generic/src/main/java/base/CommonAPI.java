package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver = null;

    //@Parameters({url})
    @BeforeMethod
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","../Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //driver.switchTo();
    }
    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }
}
