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
public class ClickContentManage_MainServiceImpl implements ClickMenu_MainService {
    public ReportResult clickMenu(SettingUtil util) {
        ReportResult clickMenuReportResult = new ReportResult();
        clickMenuReportResult.setReportName("点击主站sitemap菜单_内容管理");
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
            clickMenuPage.getparentNode_ContentManage().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_内容管理", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_内容管理", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_ContentHome().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_内容采编发", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_内容采编发", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_ContentNavigationFiling().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_内容归档", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_内容归档", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_ContentRecycle().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_内容回收站", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_内容回收站", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_SpecialManage().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_专题管理", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_专题管理", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_NodeManage().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_节点管理", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_节点管理", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_TagManage().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_标记管理", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_标记管理", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_ArticleTag().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_文章标记管理", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_文章标记管理", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_PhotoTag().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_图片标记管理", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_图片标记管理", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_SpecialTag().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_专题标记管理", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_专题标记管理", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_PrivilegeManage().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_权限管理", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_权限管理", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_NodePermissionSet().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_节点角色管理", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_节点角色管理", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_BatchNodePermissionSetRelationConfig().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_按节点配置权限", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_按节点配置权限", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_AuditProcess().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_审核流程管理", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_审核流程管理", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_FieldPermissionManage().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_字段权限管理", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_字段权限管理", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_DispatchDepartment().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_发文部门管理", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_发文部门管理", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        clickMenuReportResult.setReportImplState(true);
        return clickMenuReportResult;
    }
}
