package com.automation;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import sun.security.krb5.internal.KdcErrException;

import java.net.MalformedURLException;
import java.net.URL;

public class TestRunner {
    //create appium driver
    private AppiumDriver<MobileElement> driver;

    @Test
    public void test(){
        try {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
            desiredCapabilities.setCapability(MobileCapabilityType.VERSION,"7.0");
            desiredCapabilities.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir") +"\\etsy.apk");
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_2");
            desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,2000);

            driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),desiredCapabilities);
            Thread.sleep(3000);
            driver.closeApp();

        }catch( Exception e){
            e.printStackTrace();
        }







    }

}
