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
public class ClickPublicinformation_MainServiceImpl implements ClickMenu_MainService {
    public ReportResult clickMenu(SettingUtil util) {
        ReportResult clickMenuReportResult = new ReportResult();
        clickMenuReportResult.setReportName("点击主站sitemap菜单_信息公开");
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
            clickMenuPage.getParentNode_Publicinformation().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_信息公开", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_信息公开", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getChirldrenNode_PublicinformationManage().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_公开信息管理", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_公开信息管理", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getChirldrenNode_ApplicationForInformationDisclosure().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_信息公开申请表", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_信息公开申请表", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getChirldrenNode_ApplicationformManage().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_申请表管理", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_申请表管理", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_NodeManage().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_申请表管理员设置", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_申请表管理员设置", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_TagManage().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_主题管理", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_主题管理", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_ArticleTag().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_主题角色管理", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_主题角色管理", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_PhotoTag().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_部门设置", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_部门设置", false,cam.snapShot()));
            return clickMenuReportResult;
        }

        clickMenuReportResult.setReportImplState(true);
        return clickMenuReportResult;
    }
}
