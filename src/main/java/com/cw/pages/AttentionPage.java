package com.cw.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;


public class AttentionPage {
	AndroidDriver<?> driver;
	Logger log = Logger.getLogger(AttentionPage.class.getName());
    public AttentionPage(AndroidDriver<?> driver){
        this.driver = driver;
        
    }

    //定位到选择按钮
    private static By se_btn = By.id("com.ss.android.article.lite:id/agt");
    //定位到要闻
    private static By news_btn = By.xpath("//*[@text='要闻']");;
    //定位到其中一个新闻标题按钮
    //private static By title_btn = By.id("com.ss.android.article.lite:id/bz");
    //定位到关注按钮
    //private static By attention_btn = By.id("subscribe");
    //定位到返回按钮
    //private static By back_btn = By.id("com.ss.android.article.lite:id/abo");
    
    //定位到播放按钮
    private static By title_btn = By.id("com.ss.android.article.lite:id/ok");
    //定位到关注按钮
    //private static By attention_btn = By.id("subscribe");
    private static By attention_btn = By.xpath("//*[@text='关注']");
    //定位到返回按钮
    private static By back_btn = By.id("com.ss.android.article.lite:id/i0");
    
    public void attention_page(){
    	log.info("点击三横选择按钮");
    	driver.findElement(se_btn).click();
    	log.info("点击要闻按钮");
    	driver.findElement(news_btn).click();
    	//log.info("点击其中一个标题按钮");
    	//driver.findElement(title_btn).click();
    	log.info("点击播放");
    	driver.findElement(title_btn).click();
    	log.info("点击关注按钮");
        driver.findElement(attention_btn).click();
    	log.info("点击返回按钮");
        driver.findElement(back_btn).click();

    }
    
    public  boolean isSelected() {
    	return driver.findElement(attention_btn).isSelected();
    }
}
