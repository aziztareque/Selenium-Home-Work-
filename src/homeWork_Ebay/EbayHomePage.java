package homeWork_Ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class EbayHomePage {

    //public static void main(String[] args) {


        WebDriver driver;
        String ebayUrl = "https://www.ebay.com";
        String input1 = "Mavic 2 Pro";
        String sbLocator = "//*[@id=\"gh-ac\"]";
        String sButtonLocator = "//*[@id=\"gh-btn\"]";

        @BeforeMethod
        public void driverSetUp () {
            String chromeDriverPath = "/Users/mohammadaziz/IdeaProjects/LearnJava_WeekendAfternoon_Selenium_NY_Fall2020/src/WebAutomation_WA_Selenium_2020/BrowserDriver/mac/chromedriver";
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get(ebayUrl);

        }
        // 1st Method
        public void searchBox () {

            driver.findElement(By.xpath(sbLocator)).sendKeys(input1);
            driver.findElement(By.xpath(sButtonLocator)).click();
        }

        @AfterMethod
        public void tearDown () {
            driver.quit();
        }

    }

