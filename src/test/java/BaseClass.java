import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
    protected static WebDriver driver;

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Knino\\Documents\\WebDriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
    }

    public BaseClass(WebDriver driver){
        BaseClass.driver = driver;
    }

    public static void navigateTo(String url){

        driver.get(url);
    }

    public static void closeBrowser(){
        driver.quit();
    }



}
