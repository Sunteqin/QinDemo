package com.siteazure.demo.serviceimpl;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.siteazure.demo.model.CaseResult;
import com.siteazure.demo.model.ReportResult;
import com.siteazure.demo.service.LoginService;
import com.siteazure.demo.util.FileUtils;
import org.suren.autotest.web.framework.settings.SettingUtil;

import com.siteazure.demo.page.LoginPage;
import com.siteazure.demo.util.ScreenShot;

public class LoginServiceImpl implements LoginService {

	public ReportResult login(SettingUtil util) {
		ReportResult loginReportResult = new ReportResult();
		loginReportResult.setReportName("登录");
		loginReportResult.setReportImplState(false);
		loginReportResult.setScreenshotState(false);
		List<CaseResult> caseResults = new ArrayList<CaseResult>();
		loginReportResult.setCaseResults(caseResults);

		ScreenShot cam = new ScreenShot(FileUtils.judeDirExists("") + "\\sitea", "png");//
		try {
			util.readFromClassPath("login.xml"); //加载元素定位配置文件
		} catch (Exception e) {
			e.printStackTrace();
			caseResults.add(new CaseResult("初始化用例失败", false));
			return loginReportResult;
		}
		LoginPage loginpage = util.getPage(LoginPage.class);
		loginpage.open();
		try {
			loginpage.getLoginAdminName().setValue("administrator");
			loginpage.getLoginAdminName().fillValue(); //向文本框中填充值
			caseResults.add(new CaseResult("输入用户名", true));
		} catch (Exception e) {
			e.printStackTrace();
			caseResults.add(new CaseResult("输入用户名", false));
			return loginReportResult;
		}
		try {
			loginpage.getLoginAdminPassword().setValue("admin888");
			loginpage.getLoginAdminPassword().fillValue();
			caseResults.add(new CaseResult("输入密码", true));
		} catch (Exception e) {
			e.printStackTrace();
			caseResults.add(new CaseResult("输入密码", false));
			return loginReportResult;
		}
		try {
			loginpage.getSiteManageCode().setValue("8888");
			loginpage.getSiteManageCode().fillValue();
			caseResults.add(new CaseResult("输入认证码", true));
		} catch (Exception e) {
			e.printStackTrace();
			caseResults.add(new CaseResult("输入认证码", false));
			return loginReportResult;
		}
		try {
			loginpage.getSubmit().click();
			caseResults.add(new CaseResult("点击登录按钮", true));
		} catch (Exception e) {
			e.printStackTrace();
			caseResults.add(new CaseResult("点击登录按钮", false));
			return loginReportResult;
		}
		loginReportResult.setScreenshotState(cam.snapShot());

		loginReportResult.setReportImplState(true);
		return loginReportResult;
	}

}
