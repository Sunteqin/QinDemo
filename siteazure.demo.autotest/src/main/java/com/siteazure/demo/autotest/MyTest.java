package com.siteazure.demo.autotest;

import com.siteazure.demo.model.ReportResult;
import com.siteazure.demo.service.ClickMenu_MainService;
import com.siteazure.demo.service.LoginService;
import com.siteazure.demo.service.ToggleSiteService;
import com.siteazure.demo.serviceimpl.ClickMenu_MainServiceImpl.ClickPerformanceCenter_MainServiceImpl;
import com.siteazure.demo.serviceimpl.ClickMenu_MainServiceImpl.ClickMyWork_MainServiceImpl;
import com.siteazure.demo.serviceimpl.ClickMenu_MainServiceImpl.ClickPublicinformation_MainServiceImpl;
import com.siteazure.demo.serviceimpl.LoginServiceImpl;
import com.siteazure.demo.serviceimpl.ToggleSiteServiceImpl;
import com.siteazure.demo.util.FileUtils;
import com.siteazure.demo.util.TemplateUtils;
import org.suren.autotest.web.framework.settings.SettingUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by family-sunte on 2017/6/18.
 */
public class MyTest {
    public static void main(String [] args) throws InterruptedException {
        SettingUtil util = new SettingUtil();
        List<ReportResult> reportResults = new ArrayList<ReportResult>();
       //登录操作
        LoginService loginService = new LoginServiceImpl();
        reportResults.add(loginService.login(util));
        Thread.sleep(1000);

        //切换站点操作
        ToggleSiteService  toggleSiteService=new ToggleSiteServiceImpl();
        reportResults.add(toggleSiteService.toggleSite(util));
        Thread.sleep(1000);

       //点击默认主站sitemap菜单
        ClickMenu_MainService ClickMyWorkServiceMain =new ClickMyWork_MainServiceImpl();
        reportResults.add(ClickMyWorkServiceMain.clickMenu(util));
        Thread.sleep(1000);

        ClickMenu_MainService ClickPerformanceCenterServiceMain =new ClickPerformanceCenter_MainServiceImpl();
        reportResults.add(ClickPerformanceCenterServiceMain.clickMenu(util));
        Thread.sleep(1000);

        ClickMenu_MainService ClickCententServiceMain =new ClickPerformanceCenter_MainServiceImpl();
        reportResults.add(ClickCententServiceMain.clickMenu(util));
        Thread.sleep(1000);

        ClickMenu_MainService ClickPublicinformationServiceMain =new ClickPublicinformation_MainServiceImpl();
        reportResults.add(ClickPublicinformationServiceMain.clickMenu(util));
        Thread.sleep(1000);

        try {
            util.close(); //关闭框架
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileUtils.createFile("E:\\Hello\\report\\myTest.html", TemplateUtils.getReportTemplateHtml(reportResults));

    }
}
