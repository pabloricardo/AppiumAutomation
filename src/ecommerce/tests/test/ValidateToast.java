package ecommerce.tests.test;

import ecommerce.tests.base.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.net.MalformedURLException;

public class ValidateToast extends Base {

    public static void main(String[] args) throws MalformedURLException {
        AppiumDriver<AndroidElement> driver = capabilities();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        AndroidElement toast = driver.findElement(By.xpath("//android.widget.Toast[1]"));
        String toastMessage = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
        Assert.assertEquals("Please enter your name", toastMessage);
    }
}
