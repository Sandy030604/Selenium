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
public class Lab1ques3Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() throws MalformedURLException {
    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void lab1ques3() {
    // Test name: Lab1ques3
    // Step # | name | target | value
    // 1 | open | https://demo.opencart.com/ | 
    driver.get("https://demo.opencart.com/");
    // 2 | setWindowSize | 1280x672 | 
    driver.manage().window().setSize(new Dimension(1280, 672));
    // 3 | click | linkText=Desktops | 
    driver.findElement(By.linkText("Desktops")).click();
    // 4 | click | linkText=Mac (1) | 
    driver.findElement(By.linkText("Mac (1)")).click();
    // 5 | click | id=input-sort | 
    driver.findElement(By.id("input-sort")).click();
    // 6 | select | id=input-sort | label=Name (A - Z)
    {
      WebElement dropdown = driver.findElement(By.id("input-sort"));
      dropdown.findElement(By.xpath("//option[. = 'Name (A - Z)']")).click();
    }
    // 7 | mouseOver | css=.button-group > button:nth-child(2) | 
    {
      WebElement element = driver.findElement(By.cssSelector(".button-group > button:nth-child(2)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 8 | mouseOut | css=.button-group > button:nth-child(2) | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 9 | mouseOver | css=.button-group > button:nth-child(1) | 
    {
      WebElement element = driver.findElement(By.cssSelector(".button-group > button:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 10 | click | css=.button-group > button:nth-child(1) | 
    driver.findElement(By.cssSelector(".button-group > button:nth-child(1)")).click();
    // 11 | mouseOut | css=.button-group > button:nth-child(1) | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 12 | mouseOver | css=.button-group > button:nth-child(2) | 
    {
      WebElement element = driver.findElement(By.cssSelector(".button-group > button:nth-child(2)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 13 | mouseOut | css=.button-group > button:nth-child(2) | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 14 | mouseOver | css=button:nth-child(3) | 
    {
      WebElement element = driver.findElement(By.cssSelector("button:nth-child(3)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 15 | mouseOut | css=button:nth-child(3) | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
  }
}
