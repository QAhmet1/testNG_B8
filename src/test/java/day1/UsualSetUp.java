package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UsualSetUp {
    // Hooks Class (This is about cucumber)

    WebDriver driver;
    @BeforeMethod
    public void setUp() {

        // driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test() throws InterruptedException {

        driver.get("https://www.google.com");
        Thread.sleep(3000);

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        Thread.sleep(2000);
        Assert.assertTrue(expectedTitle.equals(actualTitle));

    }


    @AfterMethod
    public void clean() {
        driver.quit();
    }




}
