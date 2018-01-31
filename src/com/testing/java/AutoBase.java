package com.testing.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 针对selenium提供的定位方法进行二次封装，简化后期的使用
 * @author 51Testing
 *
 */
public class AutoBase {
	
	//click点击
	public void click(WebElement element){
		element.click();
	}
	
	//input文本框输入内容
	public void input(WebElement element,String content){
		element.clear();//清空文本框内容
		element.sendKeys(content);
	}
	
	//打开指定页面
	public void get(WebDriver driver,String url){
		driver.get(url);
		
	}
	//submit按钮的实现
	public void submit(WebElement element){
		element.submit();
	}
	//切换frame
	//切换窗口
	
	//弹出窗口
	
	//复选框
}
