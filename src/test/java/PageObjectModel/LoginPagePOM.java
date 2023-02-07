package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePOM {
    private WebDriver driverObject;
    private By usernameTxt = By.id("name");
    private By passwordTxt = By.id("password");
    private By loginBtn = By.id("login");


    public LoginPagePOM(WebDriver driverObject) {
        this.driverObject = driverObject;
        if (!driverObject.getCurrentUrl().equals("https://example.testproject.io/web/")) {
            throw new IllegalStateException("This is not expected Page " + driverObject.getCurrentUrl());
        }
    }
    public void enterUserName(String str) {
        driverObject.findElement(usernameTxt).sendKeys(str);  }
    public void enterPassword(String str) {
        driverObject.findElement(passwordTxt).sendKeys(str);  }
    public void setLoginBtn(String str) {
        driverObject.findElement(loginBtn).click();  }
    public void loginProcess(String s1, String s2)
    {
        driverObject.findElement(usernameTxt).sendKeys(s1);
        driverObject.findElement(passwordTxt).sendKeys(s2);
        driverObject.findElement(loginBtn).click();
    }
}
