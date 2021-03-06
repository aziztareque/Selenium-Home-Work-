package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {



    public static void main(String[] args) throws InterruptedException {

        String chromeDriverPath = "BrowserDriver/mac/chromedriver";
        String firefoxDriverPath = "BrowserDriver/mac/geckodriver 2";

        // Chrome
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().fullscreen();

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mask");
        driver.findElement(By.id("nav-search-submit-button")).click();



        Thread.sleep(5000);
        driver.close();




        // Firefox
        System.setProperty("webdriver.gecko.driver",firefoxDriverPath);
        WebDriver driver1 = new FirefoxDriver();
        driver1.get("https://www.amazon.com");
        Thread.sleep(5000);
        driver1.close();



    }
}
