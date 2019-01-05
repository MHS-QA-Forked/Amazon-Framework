package Homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageUtilites extends CommonAPI {
    @FindBy(css ="#twotabsearchtextbox")public static WebElement searchBar;
    @FindBy(xpath ="//input[@value = 'Go']")public static WebElement searchButton;
    @FindBy(css = "#nav-your-amazon") public static WebElement youramazonlink;


    public void searchBar(){
       searchBar.sendKeys("Toys");
       searchButton.click();
    }

    public void yourAmazonLink(){
        youramazonlink.click();
    }
}
