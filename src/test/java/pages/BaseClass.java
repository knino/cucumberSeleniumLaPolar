package pages;

import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        System.setProperty("webdriver.chrome.driver", "C://Users//Knino//Documents//WebDriver//1//chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
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

    private String getTextTitle(String locator){ return driver.getTitle(); }

    public void clickElement(String locator){
        find(locator).click();
    }

    public void sendKeys(String locator, String keys){
        find(locator).sendKeys(keys);
    }


    public String textTitle(String locator){
        return getTextTitle(locator);
    }


    public String getAtribute(String locator){
       return find(locator).getAttribute("class");
    }

    public String validateUrl(){
        driver.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);
        return driver.getCurrentUrl();
    }

    public void waitForPage(){
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    }

