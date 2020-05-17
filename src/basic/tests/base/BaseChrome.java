package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseChrome {

    public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {


		//File f = new File("src/ApiDemos-debug.apk");

        DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        //cap.setCapability("chromedriverExecutable", "C://chromedriver/chromedriver.exe");
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "EmulatorPhoneAndroid9");
		//cap.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

}
