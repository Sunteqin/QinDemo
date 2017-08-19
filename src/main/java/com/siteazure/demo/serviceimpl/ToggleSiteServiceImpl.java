package com.siteazure.demo.serviceimpl;

import com.siteazure.demo.model.CaseResult;
import com.siteazure.demo.model.ReportResult;
import com.siteazure.demo.page.ToggleSitePage;
import com.siteazure.demo.service.ToggleSiteService;
import com.siteazure.demo.util.FileUtils;
import com.siteazure.demo.util.ScreenShot;
import org.suren.autotest.web.framework.settings.SettingUtil;

import java.util.ArrayList;

/**
 * Created by family-sunte on 2017/6/18.
 */
public class ToggleSiteServiceImpl implements ToggleSiteService{


    public ReportResult toggleSite(SettingUtil util) {
        ReportResult toggleSiteReportResult = new ReportResult();
        toggleSiteReportResult.setReportName("切换站点操作");
        toggleSiteReportResult.setReportImplState(false);
        java.util.List<CaseResult> caseResults = new ArrayList<CaseResult>();
        toggleSiteReportResult.setCaseResults(caseResults);

        ScreenShot cam = new ScreenShot(FileUtils.judeDirExists("") + "\\sitea", "png");//
        try {
            util.readFromClassPath("togglesite.xml"); //加载元素定位配置文件
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("初始化用例失败", false));
            return toggleSiteReportResult;
        }
        ToggleSitePage toggleSitePage = util.getPage(ToggleSitePage.class);
        toggleSitePage.open();
        try {
            toggleSitePage.getToggleButton().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击站点切换按钮", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击站点切换按钮", false,cam.snapShot()));
//            return toggleSiteReportResult;
        }
        try {
            toggleSitePage.getPlatform_Site().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击站点_平台管理", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击站点_平台管理", false,cam.snapShot()));
            return toggleSiteReportResult;
        }
        try {
            toggleSitePage.getToggleButton().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击站点切换按钮", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击站点切换按钮", false,cam.snapShot()));
            return toggleSiteReportResult;
        }
        try {
            toggleSitePage.getMain_Site().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击站点_默认主站", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击站点_默认主站", false,cam.snapShot()));
            return toggleSiteReportResult;
        }
        try {
            toggleSitePage.getToggleButton().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击站点切换按钮", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击站点切换按钮", false,cam.snapShot()));
            return toggleSiteReportResult;
        }
        try {
            toggleSitePage.getHbj_Site().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击站点_环保局", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击站点_环保局", false,cam.snapShot()));
            return toggleSiteReportResult;
        }
        try {
            toggleSitePage.getToggleButton().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击站点切换按钮", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击站点切换按钮", false,cam.snapShot()));
            return toggleSiteReportResult;
        }
        try {
            toggleSitePage.getLhz_Site().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击站点_兰花镇", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击站点_兰花镇", false,cam.snapShot()));
            return toggleSiteReportResult;
        }
        try {
            toggleSitePage.getToggleButton().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击站点切换按钮", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击站点切换按钮", false,cam.snapShot()));
            return toggleSiteReportResult;
        }
        try {
            toggleSitePage.getXf_Site().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击站点_信访局", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击站点_信访局", false,cam.snapShot()));
            return toggleSiteReportResult;
        }
        try {
            toggleSitePage.getToggleButton().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击站点切换按钮", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击站点切换按钮", false,cam.snapShot()));
            return toggleSiteReportResult;
        }
        try {
            toggleSitePage.getKj_Site().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击站点_科技局", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击站点_科技局", false,cam.snapShot()));
            return toggleSiteReportResult;
        }

        toggleSiteReportResult.setReportImplState(true);
        return toggleSiteReportResult;
    }
}
