import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class DragDrop extends Base {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities();

        driver.findElementByXPath("//android.widget.TextView[@text = 'Views']").click();
        driver.findElementByXPath("//android.widget.TextView[@text = 'Drag and Drop']").click();
        WebElement source = driver.findElementsByClassName("android.view.View").get(0);
        WebElement destination = driver.findElementsByClassName("android.view.View").get(1);

        TouchAction touch = new TouchAction(driver);
        touch.longPress(element(source)).moveTo(element(destination)).release().perform();


    }

}
