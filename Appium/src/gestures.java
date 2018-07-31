import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
//import org.openqa.selenium.support.ui.Duration;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class gestures extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		//driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']").click();
		driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")").click();
		driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		//driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		TouchAction t =new TouchAction(driver);
		
		//TAP
		//t.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
		  //t.press(driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"))).waitAction(Duration.ofSeconds(3)).release().perform();
//t.press(driver.findElementByXPath("//android.widget.TextView[@text='People Names']")).waitAction(3000).release().perform();
//System.out.println(driver.findElementById("android:id/alertTitle").getText());
		  t.press(driver.findElementByXPath("//android.widget.TextView[@text='People Names']")).waitAction(Duration.ofSeconds(3)).release().perform();
		//
	
		
		System.out.println(driver.findElementByAndroidUIAutomator("text(\"Sample action\")").getText());
		
		// Tap, Press and release,scroll,Swipe, drap and drop
	}

}
