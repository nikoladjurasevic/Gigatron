import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    ChromeDriver driver = null;

    //Webelements
    @FindBy(xpath = "//span[text()='Registracija']")
    WebElement registracijaLink;

    @FindBy(xpath = "//span[text()='Prijava']")
    WebElement prijavaLink;

    @FindBy(xpath = "//button[text()='Prihvatam']")
    WebElement cookiePrihvatam;

    @FindBy(xpath = "//div[@class = 'search-container']/input")
    WebElement searchPolje;

    @FindBy(xpath = "//div[@class = 'search-container']/div")
    WebElement searchIkonica;


    public BasePage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public BasePage enterTextIntoSearchField(String text) {
        searchPolje.sendKeys(text);
        return this;
    }

    public SearchResultsPage clickSearchIcon() {
        searchIkonica.click();
        return new SearchResultsPage(driver);
    }



}
