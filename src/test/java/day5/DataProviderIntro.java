package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import utilities.BaseDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderIntro extends BaseDriver {
    @Test(dataProvider = "getData")
    public void loginTest(String uName,String passw){
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys(uName);
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys(passw);
        List<WebElement> locations=driver.findElements(By.xpath("//ul[@id='sessionLocation']/li"));
        int randomNumber= (int) (Math.random()* locations.size());
        locations.get(randomNumber).click();
        WebElement logInBtn=driver.findElement(By.xpath("//input[@id='loginButton']"));
        logInBtn.click();

        if (!uName.equalsIgnoreCase("Admin") || !passw.equalsIgnoreCase("Admin123")){
            WebElement errorMsg=driver.findElement(By.id("error-message"));
            Assert.assertTrue(errorMsg.getText().contains("Invalid"));
            System.out.println(errorMsg.getText());
        }else {
            WebElement logOut=driver.findElement(By.xpath("//a[@href=\"/openmrs/appui/header/logout.action?successUrl=openmrs\"]"));
            logOut.click();
        }




    }

    @DataProvider
    public Object[][] generateData(){
        Object [][] list= new Object[2][2];

        list[0]=new Object[]{"Admin","Admin123"};
        list[1]=new Object[]{"Admin","Admin123"};
        return list;
    }

    @DataProvider
    private Iterator<Object[]> getData(){
        List<Object[]> credentialsList=new ArrayList<>();
        credentialsList.add(new Object[]{"Admin","Admin123"});
        credentialsList.add(new Object[]{"Admin",""});
        credentialsList.add(new Object[]{"","Admin123"});
        credentialsList.add(new Object[]{"Admin","Admin123"});
        credentialsList.add(new Object[]{"gdfgfhdf","Admin123"});
        credentialsList.add(new Object[]{"Admin","cgbc"});
        credentialsList.add(new Object[]{"Admin","Admin123"});
        credentialsList.add(new Object[]{"xbcb","Admin123"});
        credentialsList.add(new Object[]{"Admin","Admin123"});

        return credentialsList.iterator();
    }
}
