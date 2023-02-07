package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM_PF {
    private WebDriver driverObject;
    @FindBy(id="name")
    WebElement usernameTxt;

    @FindBy(id ="password")
    WebElement passwordTxt;

    @FindBy(id="login")
    WebElement loginBtn;


    public LoginPagePOM_PF(WebDriver driverObject) {
        this.driverObject = driverObject;
               PageFactory.initElements( driverObject,this);
    }
    public void enterUserName(String str) {
        usernameTxt.sendKeys(str);  }
    public void enterPassword(String str) {
        passwordTxt.sendKeys(str);  }
    public void setLoginBtn(String str) {
        loginBtn.click();  }
    public void loginProcess(String s1, String s2)
    {
        usernameTxt.sendKeys(s1);
        passwordTxt.sendKeys(s2);
        loginBtn.click();
    }
}
