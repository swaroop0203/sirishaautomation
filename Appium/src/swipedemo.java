import java.net.MalformedURLException;
import java.time.Duration;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class swipedemo extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		//driver.findElementByAndroidUIAutomator("text(\"Data Widgets\")");
		driver.findElementByXPath("//*[@content-desc='9']").click();
		TouchAction t =new TouchAction(driver);
	
		
		t.press(driver.findElementByXPath("//*[@content-desc='9']")).waitAction(Duration.ofSeconds(2)).moveTo(driver.findElementByXPath("//*[@content-desc='45']")).release().perform();
	}

}
