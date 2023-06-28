package BasicsAutomation2048;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Game2048AutomationTest extends BaseTest {
//    private static AppiumDriver driver;

//    @BeforeClass
//    public void setUp() {
//        // Set the desired capabilities
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("deviceName", "Your_Device_Name");
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("appPackage", "com.example.game2048");
//        capabilities.setCapability("appActivity", ".MainActivity");
//
//        // Create the driver
//        try {
//            URL appiumServerURL = new URL("http://localhost:4723/wd/hub");
//            driver = new AndroidDriver(appiumServerURL, capabilities);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    @Test(priority = 1)
    public void verifyGameBoardDisplayed() {
    	
    	WebElement StartGame = driver.findElement(By.id("game2048.b2048game.twozerofoureight2048.game:id/menu_btn_start"));
    	StartGame.click();
        // Verify that the game board is displayed correctly
//        WebElement gameBoard = driver.findElement(By.id("game-board"));
//        Assert.assertTrue(gameBoard.isDisplayed());
    }
//
//    @Test(priority = 2)
//    public void verifyNewGameResetsBoard() {
//        // Start a new game or reset the current game
//        WebElement newGameButton = driver.findElement(By.id("new-game-button"));
//        newGameButton.click();
//
//        // Verify that the initial tiles are displayed correctly
//        WebElement initialTiles = driver.findElement(By.className("initial-tiles"));
//        Assert.assertTrue(initialTiles.isDisplayed());
//    }
//
//    @Test(priority = 3)
//    public void verifyTileMovement() {
//        // Perform tile movement
//        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"UP\")")).click();
//        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"DOWN\")")).click();
//        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"LEFT\")")).click();
//        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"RIGHT\")")).click();
//
//        // TODO: Add assertions to verify tile movements
//    }

    // Add more test cases as needed

    @AfterClass
    public void tearDown() {
        // Close the driver
        if (driver != null) {
            driver.quit();
        }
    }
}

