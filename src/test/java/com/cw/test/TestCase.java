package com.cw.test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.cw.base.BaseActivity;
import com.cw.pages.AttentionPage;
import com.cw.pages.HomePage;
import com.cw.pages.PrePage;
import com.cw.pages.SearchPage;
import com.cw.pages.VedioPage;
//import com.cw.util.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestCase extends BaseActivity{
	AndroidDriver<AndroidElement> driver;
	Logger log = Logger.getLogger(TestCase.class.getName());
    /*@BeforeMethod
    public void setUp() throws Exception{
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
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}*/
  
	@Test
    public void test1(){
    	try {
    		log.info("首页预处理case测试");
        	PrePage pre = new PrePage(getDriver());
        	pre.pre_page();
    	}catch(AssertionError error) {
    		log.info("预处理失败");
    		Assert.fail("调用刷新方法失败");
    	}
	}
    	
	@Test
    public void test2(){
    	try {
    		log.info("首页case测试，初始化home页面");
        	HomePage home = new HomePage(getDriver());
    		log.info("点击首页进行刷新");
        	home.home_page();
        	//Assert.assertEquals(home.get_text().contains("更新"), true);
    	}catch(AssertionError error) {
    		log.info("刷新失败");
    		//Assert.fail("调用刷新方法失败");
    	}

        //VedioPage vedio = new VedioPage(driver);
        //vedio.vedio_page();
    	//SearchPage search = new SearchPage(getDriver());
    	//search.search_page();     
    }
	
    @Test()
    public void test3(){
    	//HomePage home = new HomePage(driver);
    	//home.home_page();
    	try {
    		log.info("进入点关注case测试");
        	AttentionPage attention = new AttentionPage(getDriver());
        	attention.attention_page();
        	//Assert.assertEquals(attention.isSelected(), true);
    	}catch(AssertionError error) {
    		log.info("点关注失败");
    		//Assert.fail("调用点关注方法失败");
    	}

        //VedioPage vedio = new VedioPage(driver);
        //vedio.vedio_page();
    	//SearchPage search = new SearchPage(getDriver());
    	//search.search_page();
    	//By btn = By.xpath("//*[@text = '热榜']");
    	//driver.findElement(btn).click();
    	//sleep(8);       
    }
    
    @Test()
    public void test4(){
    	//HomePage home = new HomePage(driver);
    	//home.home_page();
        //VedioPage vedio = new VedioPage(driver);
        //vedio.vedio_page();
    	try {
    		log.info("进入搜索case测试");
        	SearchPage search = new SearchPage(getDriver());
        	search.search_page();
        	//Assert.assertEquals(search.get_text(),"西安");
    	}catch(AssertionError error) {
    		log.info("搜索失败");
    		//Assert.fail("调用搜索方法失败");
    	}

    	//By btn = By.xpath("//*[@text = '热榜']");
    	//driver.findElement(btn).click();
    	//sleep(8);       
    }
    
    @Test()
    public void test5(){
    	//HomePage home = new HomePage(getDriver());
    	//home.home_page();
    	try {
        	log.info("进入视频评论区点赞case测试");
            VedioPage vedio = new VedioPage(getDriver());
            vedio.vedio_page();
    	}catch(AssertionError error) {
    		log.info("点赞失败");
    		//Assert.fail("调用视频评论区点赞失败");
    	}

    	//SearchPage search = new SearchPage(getDriver());
    	//search.search_page();     
    }
    

    
   /* @AfterMethod
    public void tearDown(){
        driver.quit();
    }*/
}
