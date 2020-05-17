import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;

import java.net.MalformedURLException;

public class Browser extends BaseChrome {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.get("http://google.com");
        //JavascriptExecutor jse = (JavascriptExecutor) driver;

    }
}
