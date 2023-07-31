package utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions actions;

    @BeforeClass
    public void statsTransactions()
    {
        System.out.println("starts transactions");

        Logger logger= Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        ChromeOptions options=new ChromeOptions();
        options.addArguments("incognito");

       driver=new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        Duration dr=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);


        driver.manage().timeouts().implicitlyWait(dr);

        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
        //driver.get("https://demo.openmrs.org/openmrs/login.htm ");
    }

    @AfterClass(enabled = true)
    public void endTransactions()
    {
        System.out.println("end transactions ...");
        driver.quit();
    }

    public static void NavigateToWebsite(String url){
        driver.get(url);

    }
}
