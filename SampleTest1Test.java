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
public class SampleTest1Test {
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
  public void sampleTest1() {
    driver.get("https://demo.opencart.com/");
    driver.manage().window().setSize(new Dimension(1280, 672));
    vars.put("username", "santhoshs8483@gmail.com");
    vars.put("password", "aaradhana28");
    driver.findElement(By.cssSelector(".show > .d-none")).click();
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("input-email")).sendKeys(vars.get("username").toString());
    driver.findElement(By.id("input-password")).sendKeys(vars.get("password").toString());
    vars.put("logintext", driver.findElement(By.cssSelector(".text-end:nth-child(5) > .btn")).getText());
    System.out.println(vars.get("logintext").toString());
    driver.findElement(By.cssSelector(".text-end:nth-child(5)")).click();
    driver.findElement(By.cssSelector(".text-end:nth-child(5) > .btn")).click();
    driver.findElement(By.linkText("Logout")).click();
  }
}
