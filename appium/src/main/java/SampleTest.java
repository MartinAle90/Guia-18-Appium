import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleTest {

    private AndroidDriver driver;
//    private PORT = 4723;
//    private HOST = "127.0.0.1";


    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:deviceName", "MyDevice");
        desiredCapabilities.setCapability("appium:appPackage", "com.google.android.apps.nexuslauncher");
        desiredCapabilities.setCapability("appium:appActivity", "com.google.android.apps.nexuslauncher.NexusLauncherActivity");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appium:app", "C:\\Users\\Martin\\Downloads\\Android-NativeDemoApp-0.4.0.apk");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);



//        private URL getUrl(String host, String port) {
//            try {
//                return new URL(host+":"+port);
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            }
//            return null;
//        }
//
//        driver = new AndroidDriver(this.remoteUrl(HOST, PORT), desiredCapabilities);
    }

    @Test
    public void sampleTest() {

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}