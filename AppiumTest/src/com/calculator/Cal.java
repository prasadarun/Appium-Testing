package com.calculator;



import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



public class Cal {
	 AndroidDriver<MobileElement> driver;


	@Test
	public void launchcalc () throws MalformedURLException{
		DesiredCapabilities cap = new DesiredCapabilities();
	
		//device config
		
		cap.setCapability("deviceName", "MI Note3");
		cap.setCapability("udid","abf1b56f" );
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6.0.1");
		
		// App information
		
		cap.setCapability("appPackage", "com.miui.calculator");
		cap.setCapability("appActivity","com.miui.calculator.cal.CalculatorActivity");
		
	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4724/wd/hub"),cap);
		

	}
}