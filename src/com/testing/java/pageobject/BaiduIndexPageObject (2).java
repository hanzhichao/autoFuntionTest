package com.testing.java.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.testing.java.AutoBase;
import com.testing.java.contains.FilePath;
import com.testing.java.utils.PropUtil;

/**
 * 用户存放百度首页的所有操作事件
 * @author 51Testing
 *
 */
public class BaiduIndexPageObject extends AutoBase {
	private WebDriver driver;
	
	//初始化工作
	public BaiduIndexPageObject(WebDriver driver){
		this.driver = driver; //创建浏览器
		//打开百度首页,需要打开百度首页之后，才能对百度首页进行相关事件操作（前提条件很重要）
		get(driver,PropUtil.getProperty(FilePath.CONFIG, "baseURL"));
		
	}
	//点击百度首页-糯米
	public void clickNuomi(){
		click(driver.findElement(By.xpath(PropUtil.getProperty(FilePath.BAIDUINDEX_XPATH, "nuomi"))));
	}
	//点击百度首页-新闻
	public void clickNews(){
		click(driver.findElement(By.xpath(PropUtil.getProperty(FilePath.BAIDUINDEX_XPATH, "news"))));
	}
	//点击百度首页-Hao123
	public void clickHao123(){
		click(driver.findElement(By.xpath(PropUtil.getProperty(FilePath.BAIDUINDEX_XPATH, "hao123"))));
	}
	//点击百度首页-地图
	public void clickMap(){
		click(driver.findElement(By.xpath(PropUtil.getProperty(FilePath.BAIDUINDEX_XPATH, "map"))));
	}
	//点击百度首页-视频
	public void clickVedio(){
		click(driver.findElement(By.xpath(PropUtil.getProperty(FilePath.BAIDUINDEX_XPATH, "news"))));
	}
	//点击百度首页-贴吧
	public void clickTieba(){
		click(driver.findElement(By.xpath(PropUtil.getProperty(FilePath.BAIDUINDEX_XPATH, "tieba"))));
	}
	//点击百度首页-登录
	public void clickLogin(){
		click(driver.findElement(By.xpath(PropUtil.getProperty(FilePath.BAIDUINDEX_XPATH, "login"))));
	}
	//点击百度首页-设置
	public void clickShezhi(){
		click(driver.findElement(By.xpath(PropUtil.getProperty(FilePath.BAIDUINDEX_XPATH, "shezhi"))));
	}
	//点击百度首页-更多产品
	public void clickMoreProduct(){
		click(driver.findElement(By.xpath(PropUtil.getProperty(FilePath.BAIDUINDEX_XPATH, "moreproduct"))));
	}
	//输入搜索文本框内容
	public void inputSearch(String content){
		input(driver.findElement(By.xpath(PropUtil.getProperty(FilePath.BAIDUINDEX_XPATH, "search"))),content);
			
	}
	//点击百度一下按钮
	public void searchSubmit(){
		submit(driver.findElement(By.xpath(PropUtil.getProperty(FilePath.BAIDUINDEX_XPATH, "submitbutton"))));
		
	}
	
}
