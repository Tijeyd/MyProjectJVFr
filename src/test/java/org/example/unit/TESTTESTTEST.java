// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Test1Test {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void test1() {
        driver.get("https://www.google.com/");
        driver.manage().window().setSize(new Dimension(819, 497));
        driver.findElement(By.name("q")).sendKeys("ozon");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".tF2Cxc > .yuRUbf .LC20lb")).click();
        driver.findElement(By.name("text")).click();
        driver.findElement(By.name("text")).sendKeys("Вешалка напольная");
        driver.findElement(By.name("text")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".tile-link-hovered .k0s:nth-child(2)")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".se:nth-child(5) span"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        js.executeScript("window.scrollTo(0,1949)");
        {
            WebElement element = driver.findElement(By.cssSelector("html"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector("html"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector("html"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        js.executeScript("window.scrollTo(0,1500)");
        driver.findElement(By.cssSelector(".lu2 .ui-f2")).click();
        js.executeScript("window.scrollTo(0,900)");
        driver.findElement(By.cssSelector(".ui-c > .ui-f2")).click();
        driver.close();
    }
}
