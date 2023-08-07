package day7;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseDriver;
import utilities.Parent;

public class NopeCommerceTest extends BaseDriver {
    NopeCommerceElements np;
    @Test
    void loginTest(){
        driver.get("https://admin-demo.nopcommerce.com/login?");
        np=new NopeCommerceElements();
        Parent.sendKeysFunction(np.getEmail(),"admin@yourstore.com");
        Parent.sendKeysFunction(np.getPassword(),"admin");
        Parent.clickFunction(np.getLogInBtn());
        String text=np.getDashboardText().getText();
        Assert.assertTrue(text.toLowerCase().contains("dashboard"));
        Assert.assertTrue(np.getDashboardText().isDisplayed());
    }
}
