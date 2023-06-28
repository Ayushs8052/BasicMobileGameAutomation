package BasicsAutomation2048;

import org.testng.annotations.AfterMethod;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	
	public AndroidDriver driver = null;
	public AppiumDriverLocalService service =  null;
	
	public void configureAppium() {
		
		//code to start server
		
		service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Ayush.Srivastava1\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js"))
						 .withIPAddress("127.0.0.1").usingPort(4723).build();
				service.start();
		  UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName("GameTesting");
			options.setPlatformName("Android");
			options.setPlatformVersion("11.0");
//			options.setApp("C:\\APPIUM\\base.apk");
//			options.setApp("src\\test\\resources\\base.apk");
			options.setApp("src/test/resources/base.apk");
							
//			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
			try {
				driver = (AndroidDriver) new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options).getCapabilities();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));					
	}	
	
	public void tearDown() {	
	    driver.quit();
		driver.close();
		service.stop();
		
	}
}

