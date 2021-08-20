import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        System.setProperty("webdriver.chrome.driver", "C://Users//Knino//Documents//WebDriver//1//chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 10);
    }

    public BaseClass(WebDriver driver){
        BaseClass.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public static void navigateTo(String url){
        driver.get(url);
    }

    public static void closeBrowser(){
        driver.quit();
    }

    private WebElement find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator){
        find(locator).click();
    }

    public void sendKeys(String locator, String keys){
        find(locator).sendKeys(keys);
    }

    public void selectFromDropDownByValue(String locator, String value){
        Select dropdown = new Select(find(locator));
        dropdown.deselectByValue(value);
    }

    public void selectFromDropDownByIndex(String locator, Integer index){
        Select dropdown = new Select(find(locator));
        dropdown.deselectByIndex(index);
    }

    public void selectFromDropDownByText(String locator, String Text){
        Select dropdown = new Select(find(locator));
        dropdown.deselectByVisibleText(Text);
    }

    }

