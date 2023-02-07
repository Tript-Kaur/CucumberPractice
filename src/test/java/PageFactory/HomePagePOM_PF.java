package PageFactory;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOM_PF {
    private WebDriver driverObject;
    @FindBy(id = "jumbo")
    private By logoutBtn ;

    public HomePagePOM_PF(WebDriver driverObject)
    {
        if(this.driverObject==null)
            this.driverObject = driverObject;
        PageFactory.initElements( driverObject,this);
    }


    public String CurrentURL()
    {
        return driverObject.getCurrentUrl();
    }
}
