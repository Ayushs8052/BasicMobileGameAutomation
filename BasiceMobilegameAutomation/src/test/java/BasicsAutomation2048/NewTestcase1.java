package BasicsAutomation2048;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class NewTestcase1 {

	public AndroidDriver driver = null;

	@BeforeTest
	public void setUp() throws Exception {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "GameTesting");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "11.0");
		caps.setCapability("app", "D://Ayush//BasiceMobilegameAutomation//src//test//resources//base.apk");
		
		

		// Initialize the driver
		try {
			URL appiumServerURL = new URL("http://0.0.0.0:4723/wd/hub");
			driver = new AndroidDriver(appiumServerURL, caps);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Test
	public void automateGame() {
		driver.findElement(AppiumBy.id("game2048.b2048game.twozerofoureight2048.game:id/menu_btn_start")).click();
		
	}

}
