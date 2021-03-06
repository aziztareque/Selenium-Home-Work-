package homeWork_Ebay;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EbayTestHomePage extends EbayHomePage {



        @Test(priority = 2)
        public void testSearchBox () {

            searchBox();
            String expectedText = "\"Mavic 2 Pro\"";
            String actualText = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).getText();
            Assert.assertEquals(actualText, expectedText, "input did not match");
        }

        @Test(priority = 1)

        public void testPageTitle () {
            String expectedTest = "Ebay.com: Home, Motors, Fashion, Electronics and etc";
            String actualText = driver.getTitle();
            Assert.assertEquals(actualText, expectedTest, "Page Title did not match");

        }

    }

