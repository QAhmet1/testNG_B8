package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.BaseDriver;

public class MultipleClasses extends BaseDriver {
    @Test
    public static void test1(){
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement makeAppointmentBtn=driver.findElement(By.id("btn-make-appointment"));
        makeAppointmentBtn.click();
        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");
        WebElement password=driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();
    }
}
