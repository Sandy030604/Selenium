package Lab_Selenium_Webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.api.trace.Span;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Lab6_Q1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();//this is to set the chromeDriver which we want to use
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("7550010537");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("aaradhana28");
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Monitors of Lg brand");
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(Keys.ENTER);





       // driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
//        Span selecting=new Span(driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")));
//        selecting.selectByIndex(5);
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_5\"]")).click();
        Thread.sleep(5000);
        //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[4]/div/div/div[1]/span/div/span/span")).click();
        //driver.findElement(By.id("a-autoid-35-announce")).click();
//        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div/div[2]/div/div/div[2]/h2/a/span/span/button")).click();
//        System.out.println("Add to cart done");
        //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
//        System.out.println("Safdjk");
//        Thread.sleep(2000);
//        if(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2")).isDisplayed())
//        {
//            System.out.println("Description Available");
//        }
//        else
//        {
//            System.out.println("Description not available");
//        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a")).click();


        Thread.sleep(5000);
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("window.scrollTo(0,1000);");
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        System.out.println("Scrolll happens");

        Thread.sleep(15000);
        // Resize the window to a small size
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("windows.scrollBy(0,370)");
        // Set zoom level to 80%
//        js.executeScript("document.body.style.zoom='50%';");
//        System.out.println("Zoomed out");

        Actions actions = new Actions(driver);
        for (int i = 0; i < 10; i++) { // Zoom out 2 times
            actions.keyDown(Keys.CONTROL).sendKeys(Keys.SUBTRACT).keyUp(Keys.CONTROL).perform();
        }
        System.out.println("Keys control made");

        //driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/div[1]/div/div/div/form/div/div/div/div/div[4]/div/div[37]/div[1]/span/span/span/input")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
        System.out.println("Added to cart");

    }
}
