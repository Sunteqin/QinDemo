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
public class ClickPerformanceCenter_MainServiceImpl implements ClickMenu_MainService {

    public ReportResult clickMenu(SettingUtil util) {
        ReportResult clickMenuReportResult = new ReportResult();
        clickMenuReportResult.setReportName("点击主站sitemap菜单_绩效中心");
        clickMenuReportResult.setReportImplState(false);
        java.util.List<CaseResult> caseResults = new ArrayList<CaseResult>();
        clickMenuReportResult.setCaseResults(caseResults);

        ScreenShot cam = new ScreenShot(FileUtils.judeDirExists("") + "\\PerformanceCenter", "png");//
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
            clickMenuPage.getparentNode_PerformanceCenter().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_绩效中心", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_绩效中心", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_ArticleScore().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_内容管理统计", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_内容管理统计", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_NodeUpdateCycleStatistics().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_内容更新统计", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_内容更新统计", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_CountByDepartmentApprove().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_部门录用量统计", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_部门录用量统计", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_ScoreOfDepartment().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_部门总分统计", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_部门总分统计", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_ScoreByApproveDataCount().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_录入者录用量统计", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_录入者录用量统计", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_ScoreOfInputtert().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_录入者总分统计", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_录入者总分统计", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_RemunerationOfInputter().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_稿费按录入者统计", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_稿费按录入者统计", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_StatisticsOfPublicInformation().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_信息公开统计", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_信息公开统计", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_SubjectCategoryUpdateCycleStatistics().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_信息公开更新统计", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_信息公开更新统计", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_PetitionStatistics().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_信访统计", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_信访统计", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_PetitionLetterReplyStatistics().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_信件办理统计", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_信件办理统计", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        try {
            clickMenuPage.getchirldrenNode_SiteTraffic().click();
            Thread.sleep(1000);
            caseResults.add(new CaseResult("点击SiteMap_站点浏览量明细", true,cam.snapShot()));
        } catch (Exception e) {
            e.printStackTrace();
            caseResults.add(new CaseResult("点击SiteMap_站点浏览量明细", false,cam.snapShot()));
            return clickMenuReportResult;
        }
        clickMenuReportResult.setReportImplState(true);
        return clickMenuReportResult;
    }
}
