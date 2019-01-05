import Homepage.HomePageUtilites;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageUtilitiesTest extends HomePageUtilites {

    HomePageUtilites homePageUtilites;

    @BeforeMethod
    public void initElements(){
        homePageUtilites = PageFactory.initElements(driver, HomePageUtilites.class);
    }

    @Test
    public void sendKeysToSearchBarTest() {
        searchBar();
    }
    @Test
    public void yourAmazonLinkTest(){
       yourAmazonLink();
    }
}
