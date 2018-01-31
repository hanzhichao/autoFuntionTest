package com.testing.java.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.testing.java.AutoBase;
import com.testing.java.contains.FilePath;
import com.testing.java.utils.PropUtil;


public class Testcase {
	private WebDriver driver;
	@Test
	public void testSearch001(){
		
		AutoBase autobase = new AutoBase();
		//打开浏览器
		driver = new FirefoxDriver();
		//打开首页
		
		//System.out.println(PropUtil.getProperty(FilePath.CONFIG, "baseURL"));
		
		autobase.get(driver, PropUtil.getProperty(FilePath.CONFIG, "baseURL"));
		//driver.get("http://www.baidu.com");
		//driver.get(PropUtil.getProperty(FilePath.CONFIG, "baseURL"));
		
		//获取搜索文本框
		//autobase.input(driver.findElement(By.xpath(PropUtil.getProperty(FilePath.BAIDUINDEX_XPATH, "search"))), "51Testing");
		driver.findElement(By.xpath(PropUtil.getProperty(FilePath.BAIDUINDEX_XPATH, "search"))).sendKeys("51Testing");
		
		//获取登陆按钮
		//autobase.click(driver.findElement(By.xpath(PropUtil.getProperty(FilePath.BAIDUINDEX_XPATH, "submitbutton"))));
		driver.findElement(By.xpath(PropUtil.getProperty(FilePath.BAIDUINDEX_XPATH, "submitbutton"))).submit();
		
		
	}
	@AfterTest
	public void afterTest(){
		driver.quit();
	}
}
