package com.cw.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class PrePage {
	AndroidDriver<?> driver;
    Logger log = Logger.getLogger(PrePage.class.getName());
    public PrePage(AndroidDriver<?> driver){
        this.driver = driver;
    }
    
    private static By agree_btn = By.id("com.ss.android.article.lite:id/b9l");
    
    public static By x_btn = By.id("com.ss.android.article.lite:id/r9");
    
    public void pre_page(){
    	
    	log.info("点击同意");
        driver.findElement(agree_btn).click();    
    	log.info("点击x");
        driver.findElement(x_btn).click(); 
        // 返回RegisterPage页面对象
        //return new LoginPage(driver);
    }


}
