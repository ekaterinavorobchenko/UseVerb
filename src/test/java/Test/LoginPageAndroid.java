package Test;
import Base.BaseAndroid;
import org.testng.annotations.Test;


public class LoginPageAndroid extends BaseAndroid{
    @Test
    public void Test1() throws InterruptedException {
        SignIn s = new SignIn(driver);
        s.setBySignIn();
        s.setByUsername();
        s.byPassword.sendKeys("Passwd000!");
        s.bySignIn2.click();
    }
}
