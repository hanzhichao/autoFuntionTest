package com.testing.java.contains;

/**
 * 存放配置文件路径
 * @author 51Testing
 *
 */
public class FilePath {
	//指定config配置文件路径,采用static修饰的属性，可以通过类名.属性名访问
	//采用final修饰的属性，属性值不可发生变化
	public static final String CONFIG = "configData\\config.properties";
	//指定BaiduIndexUIElement配置文件
	public static final String BAIDUINDEX_XPATH="configData\\uiElement\\BaiduIndexUIElement.properties";
	//指定LoginUIElement配置文件路径
	public static final String LOGIN_XPATH="configData\\uiElement\\LoginUIElement.properties";
}
