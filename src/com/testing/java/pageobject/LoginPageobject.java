package com.testing.java.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.testing.java.AutoBase;
import com.testing.java.contains.FilePath;
import com.testing.java.utils.PropUtil;

public class LoginPageobject extends AutoBase {
	
	private WebDriver driver;
	//初始化工作
	public LoginPageobject(WebDriver driver){ //构造方法没有void
		this.driver=driver;
		BaiduIndexPageObject bdob= new BaiduIndexPageObject(driver);
		bdob.clickLogin();
	}
	
	//输入登录名
	public void inputUserName(String content){
		input(driver.findElement(By.xpath(PropUtil.getProperty(FilePath.LOGIN_XPATH, "username"))),content);
	}
	//输入密码
	public void inputPassword(String content){
		input(driver.findElement(By.xpath(PropUtil.getProperty(FilePath.LOGIN_XPATH, "password"))),content);
	}
	//点击登录
	public void clickLoginbtn(){
		click(driver.findElement(By.xpath(PropUtil.getProperty(FilePath.LOGIN_XPATH, "loginbtn"))));
	}
}
