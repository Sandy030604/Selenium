package Lab_Selenium_Webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Login1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();//this is to set the chromeDriver which we want to use
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/");

        driver.findElement(By.linkText("My Account")).click();

        //driver.findElement(By.linkText("Login")).click();


    }
}
