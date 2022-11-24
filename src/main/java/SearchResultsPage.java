import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage extends BasePage {


    @FindBy(className = "item-name-wrep")
    WebElement singletItemName;

    public SearchResultsPage(ChromeDriver driver) {
        super(driver);
    }

    public String getSingleItemName() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("item-name-wrep")));
        return  singletItemName.getText();
    }
}
