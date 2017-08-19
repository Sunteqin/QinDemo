package com.siteazure.demo.serviceimpl.ClickMenu_MainServiceImpl;

import com.siteazure.demo.model.CaseResult;
import com.siteazure.demo.model.ReportResult;
import com.siteazure.demo.page.SiteMap_MainPage.ClickMenu_MainPage;
import com.siteazure.demo.service.ClickMenu_MainService;
import com.siteazure.demo.util.FileUtils;
import com.siteazure.demo.util.ScreenShot;
import org.suren.autotest.web.framework.settings.SettingUtil;

import java.util.ArrayList;

/**
 * Created by family-sunte on 2017/6/21.
 */
public class ClickMyWork_MainServiceImpl implements ClickMenu_MainService {
    public ReportResult clickMenu(SettingUtil util) {
        ReportResult clickMenuReportResult = new ReportResult();
        clickMenuReportResult.setReportName("点击主站sitemap菜单:我的工作");
        clickMenuReportResult.setReportImplState(false);
        java.util.List<CaseResult> caseResults = new ArrayList<CaseResult>();
        clickMenuReportResult.setCaseResults(caseResults);

        ScreenShot cam = new ScreenShot(FileUtils.judeDirExists("") + "\\sitea", "png");//
        try {
            util.readFromClassPath("clickmenu.xml"); //加载元素定位配置文件
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("初始化用例失败", false));
            return clickMenuReportResult;
        }
        ClickMenu_MainPage clickMenuPage = util.getPage(ClickMenu_MainPage.class);
        clickMenuPage.open();
        try {
            clickMenuPage.getparentNode_MyWork().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_我的工作", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_我的工作", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_MyWorkbench().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_我的工作台", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_我的工作台", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_MessageListNavigation().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_我的站内短消息", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_我的站内短消息", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_ContentManage().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_内容管理", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_内容管理", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_Drafts().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_草稿箱", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_草稿箱", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_RejectionBox().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_退稿箱", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_退稿箱", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        clickMenuReportResult.setReportImplState(true);
        return clickMenuReportResult;
    }
}
