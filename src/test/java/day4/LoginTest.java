package day4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.BaseDriver;
import utilities.ParametersDriver;

public class LoginTest extends BaseDriver {
    private static final Logger logger = LogManager.getLogger(LoginTest.class);
    @Test
    @Parameters({"username","password"})
    public static void test1(String username,String password){
        logger.info("This is an informational log message related to Selenium.");
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement makeAppointmentBtn=driver.findElement(By.id("btn-make-appointment"));
        makeAppointmentBtn.click();
        WebElement username1 = driver.findElement(By.id("txt-username"));
        username1.sendKeys(username);
        WebElement password1=driver.findElement(By.id("txt-password"));
        password1.sendKeys(password);
        driver.findElement(By.id("btn-login")).click();
    }
}
