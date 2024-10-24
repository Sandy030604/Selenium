package Lab_Selenium_Webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_IsSelected5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();//this is to set the chromeDriver which we want to use
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/en-gb?route=account/register");


        WebElement subscribe = driver.findElement(By.id("input-newsletter"));
        Thread.sleep(3000);
        subscribe.click();

        if (subscribe.isSelected())
        {
            System.out.println("Subscribed");
        }
        else
        {
            System.out.println("Not subscribed");
        }
    }
}
