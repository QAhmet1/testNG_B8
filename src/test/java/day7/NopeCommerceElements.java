package day7;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class NopeCommerceElements {
    public NopeCommerceElements() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(id = "Email")
    private WebElement email;

    @FindBy(id = "Password")
    private WebElement password;

    @FindBy(css = "button[type=submit]")
    private WebElement logInBtn;
    @FindBy(xpath = "//div[@class=\"content-header\"]/h1")
    private WebElement dashboardText;


    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLogInBtn() {
        return logInBtn;
    }

    public WebElement getDashboardText() {
        return dashboardText;
    }
}
