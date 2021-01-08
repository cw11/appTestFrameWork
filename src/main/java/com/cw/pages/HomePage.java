package com.cw.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;



import io.appium.java_client.android.AndroidDriver;

public class HomePage {
    AndroidDriver<?> driver;
    Logger log = Logger.getLogger(HomePage.class.getName());
    public HomePage(AndroidDriver<?> driver){
        this.driver = driver;
    }
    
    private static By first_btn = By.xpath("//*[@text='推荐']");
    
    public static By verify_btn = By.className("android.view.View");
    
    public void home_page(){
    	
    	log.info("点击首页推荐刷新");
        driver.findElement(first_btn).click();     
        // 返回RegisterPage页面对象
        //return new LoginPage(driver);
    }
    
    public String get_text() {
    	return driver.findElement(verify_btn).getText().toString();
    }
    
}
