package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver = null;

    @BeforeMethod
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Arif\\IdeaProjects\\Amazon\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }
}
