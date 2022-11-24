import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    //Ovde pravimo metodu koja otvara chrome sa svim potrebnim opcijama
    public ChromeDriver openChromeDriver() {
        print("Openening Chrome Driver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--start-maximized"});
        options.addArguments(new String[]{"--ignore-certificate-errors"});
        options.addArguments(new String[]{"--disable-popup-blocking"});
        options.addArguments(new String[]{"--incognito"});
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.get(Strings.POCETNA_STRANA_URL);
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Prihvatam']")));
        driver.findElement(By.xpath("//button[text()='Prihvatam']")).click();
        return driver;
    }

    public static void print(String s) {
        System.out.println(s);
    }

}
