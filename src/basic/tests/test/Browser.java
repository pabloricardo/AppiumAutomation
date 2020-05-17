package basic.tests;

import base.BaseChrome;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class Browser extends BaseChrome {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.get("http://google.com");
        //JavascriptExecutor jse = (JavascriptExecutor) driver;
        //jse.executeScript("window.scrollBy(0,480)", "");

    }
}
