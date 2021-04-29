package Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseIOS {
    public static AppiumDriver driver;

    public String platformName = "iOS";
    public String platformVersion = "14.4";
    public String deviceName = "iPhone 12 Pro Max";
    public String app = "/Users/ekaterinavolobchenko/Downloads/UseVerb_IOS.app";
    public String automationName = AutomationName.IOS_XCUI_TEST;
    public String url = "http://127.0.0.1:4723/wd/hub";
    public boolean noReset = false;
    private AppiumDriverLocalService service;
    private AppiumServiceBuilder server;

    @BeforeClass
    public void setUp() throws MalformedURLException, InterruptedException
    {


        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        capabilities.setCapability(MobileCapabilityType.APP, app);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, automationName);
        capabilities.setCapability(MobileCapabilityType.NO_RESET, noReset);
        capabilities.setCapability("autoAcceptAlerts", true);

        driver = new IOSDriver<IOSElement>(new URL(url),capabilities);
        Thread.sleep(5000);
    }
}
