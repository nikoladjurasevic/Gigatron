import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest{


    @Test
    public void searchForSamsungTV() {

        ChromeDriver driver =  openChromeDriver();
        try {

            BasePage basePage =  new BasePage(driver);
            basePage.enterTextIntoSearchField("QE75Q90RAT");
            SearchResultsPage searchResultsPage = basePage.clickSearchIcon();
            String actualItemName =searchResultsPage.getSingleItemName();
            assert actualItemName.contains("QE75Q90RAT") : "Error";


        }finally {
//            driver.quit();
        }

    }
}
