package ecommerce.tests.test;

import ecommerce.tests.base.Base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.util.List;

public class SumOfPriceProducts extends Base {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();

        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Test01");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//*[@text='Female']")).click();
        driver.findElement(By.id("android:id/text1")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(text(\"Brazil\"));"));
        driver.findElement(By.xpath("//*[@text='Brazil']")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(0).click();
        driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(1).click();
        List<AndroidElement> priceProducts = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
        Double priceProduct01 = getPrice(priceProducts.get(0).getText());
        Double priceProduct02 = getPrice(priceProducts.get(1).getText());
        Double sum = priceProduct01+priceProduct02;
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        Double totalDisplayed = getPrice(driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText());
        Assert.assertEquals(sum, totalDisplayed);
    }

    private static Double getPrice(String price) {
        return Double.parseDouble(price.substring(1));
    }
}
