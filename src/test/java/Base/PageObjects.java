package Base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
    protected AppiumDriver driver;
    public PageObjects(AppiumDriver driver) throws InterruptedException
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
