import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class miscelleanous extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(driver.currentActivity());
	     System.out.println(driver.getContext());
	     //views - Native , Hybrid, Webview
	     System.out.println(driver.getOrientation());

	     System.out.println(driver.isLocked());
	   //  driver.hideKeyboard();
	 	driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	 	//driver.pressKeyCode(AndroidKeyCode.BACK);
	     
	}

}