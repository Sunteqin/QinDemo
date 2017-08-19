package com.siteazure.demo.autotest;

import java.io.IOException;

import org.dom4j.DocumentException;
import org.suren.autotest.web.framework.settings.SettingUtil;
import org.xml.sax.SAXException;

import com.siteazure.demo.page.SiteMap_MainPage.ClickMenu_MainPage;

public class ClickMenu {
	
	public static void main(String[] args) throws IOException, DocumentException, SAXException{
		SettingUtil util = new SettingUtil();
		util.readFromClassPath("clickmenu.xml"); //加载元素定位配置文件
		ClickMenu_MainPage clickmenupage=util.getPage(ClickMenu_MainPage.class);
		clickmenupage.open();
		//clickmenupage.getParentNode().click();	
		//clickmenupage.getChirldrenNode_First().click();
	}

	
}
