package com.siteazure.demo.service;
import com.siteazure.demo.model.ReportResult;
import com.siteazure.demo.page.LoginPage;
import org.dom4j.DocumentException;
import org.suren.autotest.web.framework.settings.SettingUtil;
import org.xml.sax.SAXException;

public interface ClickMenu_MainService {

	//点击菜单的方法
	public ReportResult clickMenu(SettingUtil util);

}
