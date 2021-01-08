package com.cw.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.cw.util.SwipeClass;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class SearchPage {
	AndroidDriver<?> driver;
	Logger log = Logger.getLogger(SearchPage.class.getName());
	
    public SearchPage(AndroidDriver<?> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    //定位到置顶新闻按钮
    //private static By top_btn = By.id("com.ss.android.article.lite:id/qz");
    //定位到去搜索按钮
    private static By to_search_btn = By.id("com.ss.android.article.lite:id/aqm");
    //定位到搜索按钮1
    //@AndroidFindBy(id = "com.ss.android.article.lite:id/da")
    //public static MobileElement search_btn;
    private static By search_btn = By.id("com.ss.android.article.lite:id/da");
    //定位到搜索按钮2
    private static By search_click = By.id("com.ss.android.article.lite:id/gp");
    //@AndroidFindBy(id = "com.ss.android.article.lite:id/gj")

    //定位到返回按钮
    private static By back_btn = By.id("com.ss.android.article.lite:id/fy");
    //定位到返回按钮2
    //private static By back_btn2 = By.id("com.ss.android.article.lite:id/fy");
    
   // private static By el1 = By.xpath("//*[content-desc='更多内容']");
    //private static By el2 = By.xpath("//*[content-desc='攻略']");
    public void search_page(){
    	//log.info("点击置顶新闻");
    	//driver.findElement(top_btn).click();
    	log.info("点击搜索按钮");
        driver.findElement(to_search_btn).click();
        log.info("点击里面的搜索按钮");  
        

        log.info("输入西安");
        //这里是为了断言才这么写的
        //SearchPage.search_btn.click();
        //SearchPage.search_btn.sendKeys("西安");
        driver.findElement(search_btn).click();
        driver.findElement(search_btn).sendKeys("西安");
        
        log.info("点击搜索按钮");
        driver.findElement(search_click).click();
        
        log.info("向上滑动");
        SwipeClass.swipeToUp(driver);
        
        log.info("向下滑动");
        SwipeClass.swipeToDown(driver);
        
        log.info("点击返回按钮1");
        driver.findElement(back_btn).click();
        driver.findElement(back_btn).click();
        //log.info("点击返回按钮2");
        //driver.findElement(back_btn2).click();
        //driver.swipe(100,2000,100,1000,3);
        // 返回RegisterPage页面对象
        //return new LoginPage(driver);
        

    }
    


	public  String get_text() {
		return driver.findElement(search_btn).getText().toString();
    }
    

}
