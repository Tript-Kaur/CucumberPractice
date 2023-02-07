package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePagePOM {
    private WebDriver driverObject;
    private By logoutBtn = By.id("logout");

    public  HomePagePOM(WebDriver driverObject)
    {
        if(this.driverObject==null)
            this.driverObject = driverObject;
    }


    public Boolean CheckLogOutisDisplayed()
    {
        return  driverObject.findElement(logoutBtn).isDisplayed();
    }
}
