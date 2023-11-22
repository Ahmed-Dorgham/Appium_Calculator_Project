package TestBase;

import io.appium.java_client.android.AndroidDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    public AndroidDriver driver ;
   // @BeforeClass
    @Test
    public void setup() throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("deviceName", "Pixel 7");
        // dc.setCapability("deviceName", "Redmi Note 7");
        //  dc.setCapability("browserName", "chrome");
        dc.setCapability("appPackage", "com.google.android.calculator");
        dc.setCapability("appActivity", "com.android.calculator2.Calculator");
        //dc.setCapability("automationName", "Appium");
        //   dc.setCapability("automationName", "uiautomator2");
        WebDriverManager.chromedriver().setup();
        dc.setCapability("chromedriverExecutableDir", WebDriverManager.chromedriver().getDownloadedDriverPath());
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
        //driver.get("https://www.google.com/");
        // driver.findElement(By.className("gLFyf")).sendKeys("test");
    }
}
