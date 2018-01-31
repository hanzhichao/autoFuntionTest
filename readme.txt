src:存放功能测试的代码
	|--com.testing.java.utils.PropUtil:PropUtil类专门用于操作properties
	
	|--com.testing.java.contants:用来存放常量值，比如properties配置文件的路径
		|--FilePath:存放每个配置文件的路径
		
	|--com.testing.java.pageobject:存放每个页面的操作事件，每个页面对应一个类
		|--BaiduIndexPageObject:该类用来存放该页面的所有操作时间，比如点击新闻链接、点击hao123链接、输入搜索文本
								且需要继承AutoBase
	|--com.testing.java.testcase:存放所有测试用例代码
		|--BaiduIndexTest:每个页面新建一个类，编写测试用例代码，结合TestNG使用
		
test:存放测试代码

libs：存放需要使用的jar包

driver：存浏览器驱动程序

configData:用来存放工程的配置信息
	|--config.properties:用例存放工程的基本配置信息，比如，url、账号、密码、浏览器
		properties配置文件，专门用来存放键值对，比如 username=zhangshan,无双引号，结尾无分号
	|--uiElement:用于除非你每个页面的元素，每个页面对应一个配置文件，如BaiduIndexUIElement.properties
	
	
	
针对