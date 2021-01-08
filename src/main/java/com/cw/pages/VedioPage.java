package com.cw.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;


import io.appium.java_client.android.AndroidDriver;

public class VedioPage {
	AndroidDriver<?> driver;
	Logger log = Logger.getLogger(VedioPage.class.getName());
    public VedioPage(AndroidDriver<?> driver){
        this.driver = driver;
    }
    //定位到视频按钮
    private static By vedio_btn = By.xpath("//*[@text='视频']");
    //定位到评论按钮
    private static By comment_btn = By.id("com.ss.android.article.lite:id/k8");
    //定位到评论页的点赞
    private static By like_btn = By.id("com.ss.android.article.lite:id/bep");
    //定位到返回按钮
    private static By back_btn = By.id("com.ss.android.article.lite:id/i2");
    //定位到选择按钮
    private static By select_btn = By.id("com.ss.android.article.lite:id/zl");  
    //定位到取消按钮
    private static By cancel_btn = By.id("com.ss.android.article.lite:id/e2");
    
    public void vedio_page(){
    	log.info("点击视频按钮");
        driver.findElement(vedio_btn).click();
        //log.info("点击评论按钮");
        //driver.findElement(comment_btn).click();
        //log.info("点击点赞按钮");
        //driver.findElement(like_btn).click();
        //log.info("点击返回按钮");
        //driver.findElement(back_btn).click();
        log.info("点击三点选择按钮");
        driver.findElement(select_btn).click();
        log.info("点击取消选择按钮");
        driver.findElement(cancel_btn).click();
        // 返回RegisterPage页面对象
        //return new LoginPage(driver);
    }
}
