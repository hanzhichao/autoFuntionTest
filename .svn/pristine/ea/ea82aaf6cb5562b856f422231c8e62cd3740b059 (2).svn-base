package com.testing.java.utils;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

/**
 * 专门用来读取properties文件
 * @author bluekevinhan
 */
public class PropUtil {
	/**
	 * 
	 * @param propPath:接受配置文件所在的路径
	 * @param name：属性值
	 * @return 返回Properties文件对应的属性的值
	 * 
	 * 方法采用static修饰，以后通过类名.方法名直接访问，不需要实例化对象再去访问；
	 * 建议以后的公共方法且该类没有属性，可以采用static修饰方法
	 */
	
	public static String getProperty(String propPath, String name) {
        //实例化Properties对象，用于操作Properties文件
		Properties p = new Properties();
        try {
        	//加载指定的Properties配置文件
            p.load(new FileReader(new File(propPath)));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        //返回Properties文件属性的值
        return p.getProperty(name);
    }

}
