package com.testing.java.testcase;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testing.java.pageobject.BaiduIndexPageObject;

/**
 * 针对百度首页编写测试用例
 * @author 51Testing
 *
 */
public class BaiduIndexTest {
	private BaiduIndexPageObject po;
	private WebDriver driver;
	@BeforeMethod
	public void beforeMethod(){
		
		//执行用例之前的准备工作-实例化BaiduIndexpageobject对象
		 driver = new FirefoxDriver();
		po = new BaiduIndexPageObject(driver);
	}
	
	@Test
	public void testNuomi001(){//测试百度首页糯米链接是否正常
		po.clickNuomi();
		//断言，判断该用例是否成功
		//Assert.assertEquals(expected, actual);
	}
	@Test
	public void search001(){
		po.inputSearch("51Tesing");
		po.searchSubmit();
		//采用Assert断言，判定用例是否成功
	}
	@Test
	public void clickLogin(){
		po.clickLogin();//点击登录链接
		//采用Assert断言，判定用例是否成功
	}
	@AfterMethod
	public void afterMethod(){
		driver.quit();
	}
}
