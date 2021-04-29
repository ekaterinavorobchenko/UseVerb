package Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseAndroid {
    public static AppiumDriver driver;

    public String platformName = "Android";
    public String platformVersion = "6.0.1";
    public String deviceName = "BH90LETH1L";
    public String app = "/Users/ekaterinavolobchenko/Downloads/UseVerb_test.apk";
    public String automationName = AutomationName.ANDROID_UIAUTOMATOR2;
    public String url = "http://127.0.0.1:4723/wd/hub";
    public Boolean noReset = true;
    public Boolean fullReset = false;
    private AppiumDriverLocalService service;
    private AppiumServiceBuilder server;

    @BeforeTest
         public void setUp() throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        capabilities.setCapability(MobileCapabilityType.APP, app);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, automationName);
        capabilities.setCapability(MobileCapabilityType.NO_RESET, noReset);
        capabilities.setCapability(MobileCapabilityType.FULL_RESET, fullReset);

        driver = new AndroidDriver(new URL(url),capabilities);
        Thread.sleep(5000);
    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

