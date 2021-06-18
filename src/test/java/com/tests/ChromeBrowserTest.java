package com.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class ChromeBrowserTest {

         WebDriver driver;
  //// or  WebDriver driver;

    @Before
    public void setup() throws Exception{
        // deriedCapabilities.setCapability("platformName", "Android");
        //to specify test settings and required info about deveir and app under the test

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_2");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomation2");
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
//        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.calculator2");
//        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.calculator2.Caldulator");

        //for new apps - just use "app"
        //for pre-installed - "appPackage" and "appActivity"
        //address of appium server
        //localhost means that appium server is running on your computer
        //if, appium server launched on some other computer
        //specify IP/DNS address instead of localhost
        //4723 - default port number of appium server. Can be changed

        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new RemoteWebDriver(url, desiredCapabilities);
    }

        @Test
        public void mobileChromeTest() throws Exception {
        driver.get("http://qa1.vytrack.com");
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager85");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123", Keys.ENTER);
        Thread.sleep(3000);

        }
        public void tearDown(){

        driver.quit();
        }
}
