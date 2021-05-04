package Test;

import Base.BaseIOS;
import org.testng.annotations.Test;

public class LoginPageIOS extends BaseIOS {
    @Test
    public void Test2() throws InterruptedException {
        SignIn s = new SignIn(driver);
        s.setBySignIn();
        s.setByUsername();
        s.setByPassword();
        s.setBySignIn2();
    }
}
