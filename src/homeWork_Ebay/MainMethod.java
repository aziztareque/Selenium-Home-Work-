package homeWork_Ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethod  {
    public static void main(String[] args) throws InterruptedException {

        String ebayUrl = "https://www.ebay.com";
        String input1 = "Mavic 2 Pro";
        String sbLocator = "//*[@id=\"gh-ac\"]";
        String sButtonLocator = "//*[@id=\"gh-btn\"]";

// driver
        String chromeDriverPath = "/Users/mohammadaziz/IdeaProjects/LearnJava_WeekendAfternoon_Selenium_NY_Fall2020/src/WebAutomation_WA_Selenium_2020/BrowserDriver/mac/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(ebayUrl);
        driver.findElement(By.xpath(sbLocator)).sendKeys(input1);
        driver.findElement(By.xpath(sButtonLocator)).click();
        Thread.sleep(5000);
        driver.close();
    }
}
