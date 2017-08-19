package com.siteazure.demo.service;

import com.siteazure.demo.model.ReportResult;
import com.siteazure.demo.page.LoginPage;
import org.dom4j.DocumentException;
import org.suren.autotest.web.framework.settings.SettingUtil;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.List;

public interface LoginService {
	
	
	    //登录的方法
		public ReportResult login(SettingUtil util);

}
