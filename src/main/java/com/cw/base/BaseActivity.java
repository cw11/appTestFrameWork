package com.cw.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;

public class BaseActivity {
	AndroidDriver<AndroidElement> driver;
	public static Logger logger = Logger.getLogger(BaseActivity.class.getName());
	public static AppiumDriverLocalService service;
	
	@BeforeClass
	
	//自启动appium服务
	/*public void startTest(ITestContext context) throws MalformedURLException{
		logger.info("------------启动appium服务--------------");
		PropertyConfigurator.configure("config/log4j.properties");
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
		if(service == null || !service.isRunning()) {
			throw new AppiumServerHasNotBeenStartedLocallyException("an appium server node is not started");			
			}		
	}*/
	
	public void setUp() throws Exception{
		 PropertyConfigurator.configure("config/log4j.properties");
		 logger.info("--------测试用例开始执行--------");
		 DesiredCapabilities capabilities = new DesiredCapabilities();
	        // File appDir = new File("E:\\");
	        // File app = new File(appDir, "selendroid-test-app-0.17.0.apk");
	        capabilities.setCapability("deviceName", "xiaomi");
	       // capabilities.setCapability("udid", "claeae297d72");
	        capabilities.setCapability("platformVersion", "6.0.1");
	        capabilities.setCapability("platformName", "Android");
	       // capabilities.setCapability("app", "app.getAbsolutePath()");
	        // capabilities.setCapability("automationName", AutomationName.APPIUM);
	        capabilities.setCapability("appPackage", "com.ss.android.article.lite");
	        capabilities.setCapability("appActivity", ".activity.SplashActivity");
	        //capabilities.setCapability("unicodeKeyboard", "True");
	        //capabilities.setCapability("noSign", "True");
	        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void endTest() {
		logger.info("--------测试用例执行结束--------");
		driver.quit();
		/*if(service != null) {
			service.start();
		}*/
	}
	
	public AndroidDriver<AndroidElement> getDriver(){
		return driver;
	}
	
}
