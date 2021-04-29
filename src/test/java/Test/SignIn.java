package Test;
import Base.PageObjects;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignIn extends PageObjects {

    @FindBy(xpath = "\t\n" +
        "//XCUIElementTypeStaticText[@name=\"Sign in\"]")
    public WebElement bySignIn;
    @FindBy(xpath = "//XCUIElementTypeTextField[@value=\"Type your username or email address...\"]")
    public WebElement byUsername;
    @FindBy(xpath = "//XCUIElementTypeSecureTextField[@value=\"Your password\"]")
    public WebElement byPassword;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Sign in\"]")
    public WebElement bySignIn2;

    public SignIn(AppiumDriver driver) throws InterruptedException
    {
        super(driver);
    }

    public void setBySignIn() throws InterruptedException{
        bySignIn.click();
    }

    public void setByUsername() throws InterruptedException{
        byUsername.sendKeys("pjs+9@useverb.com");
    }
    public void setByPassword() throws InterruptedException{
        byPassword.sendKeys("Passwd000!");
    }
    public void setBySignIn2() throws InterruptedException{
        bySignIn2.click();
    }



//    public void bySignIn() {
//        bySignIn.click();
//    }
//    public void byUsername() {
//        byUsername.sendKeys("pjs+9@useverb.com");
//    }
//    public void byPassword(){
//        byPassword.sendKeys("Passwd000!");
//    }
//    public void bySignIn2() {
//        bySignIn2.click();
//    }


//    public void bySingIn() throws InterruptedException{
//        bySignIn.click();
//    }
//    public void byUsername() throws InterruptedException{
//        byUsername.sendKeys("pjs+9@useverb.com");
//    }
//    public void byPassword() throws InterruptedException{
//        byPassword.sendKeys("Passwd000!");
//    }
//    public void bySingIn2() throws InterruptedException{
//        bySignIn2.click();
//    }
}
