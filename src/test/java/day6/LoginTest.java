package day6;

import org.testng.annotations.Test;
import utilities.BaseDriver;
import utilities.Parent;


public class LoginTest extends BaseDriver {
    LoginPage_POM lp;

    @Test
    void test1(){
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        lp=new LoginPage_POM();
        Parent.sendKeysFunction(lp.getUsername(), "Admin");
        Parent.sendKeysFunction(lp.getPassword(), "Admin123");
        Parent.clickFunction(lp.getLocationList().get(0));
        Parent.clickFunction(lp.getLoginBtn());

    }
}
