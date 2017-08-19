package com.siteazure.demo.page.SiteMap_MainPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.suren.autotest.web.framework.core.ui.Button;
import org.suren.autotest.web.framework.page.Page;

/**
 * 逻辑页面，包含页面中需要定位的元素信息</br>
 * Text是文本框、文本域</br>
 * Button是按钮，可以是a标签或者input标签类型为button的以及其他所有可以电机的元素</br>
 * Selector是下拉列表</br>
 * 类上必须加Component，属性上必须加Autowired注解</br>
 * 所有的属性必须添加对应的getter和setter方法</br>
 * 另外，框架提供了工具类用于根据baidu.xml来生成当前Page类的方法，具体请查看code工程
 */
@Component
public class PerformanceCenter_MainPage extends Page {

    @Autowired
    private Button parentNode_PerformanceCenter;//一级菜单_绩效中心
    @Autowired
    private Button chirldrenNode_ArticleScore;//二级菜单_内容管理统计
    @Autowired
    private Button chirldrenNode_NodeUpdateCycleStatistics;//三级菜单_内容更新统计
    @Autowired
    private Button chirldrenNode_CountByDepartmentApprove;//三级菜单_部门录用量统计
    @Autowired
    private Button chirldrenNode_ScoreOfDepartment;//三级菜单_部门总分统计
    @Autowired
    private Button chirldrenNode_ScoreByApproveDataCount;//三级菜单_录入者录用量统计
    @Autowired
    private Button chirldrenNode_ScoreOfInputtert;//三级菜单_录入者总分统计
    @Autowired
    private Button chirldrenNode_RemunerationOfInputter;//三级菜单_稿费按录入者统计
    @Autowired
    private Button chirldrenNode_StatisticsOfPublicInformation;//二级菜单_信息公开统计
    @Autowired
    private Button chirldrenNode_SubjectCategoryUpdateCycleStatistics;//三级菜单_信息公开更新统计
    @Autowired
    private Button chirldrenNode_PetitionStatistics;//二级菜单_信访统计
    @Autowired
    private Button chirldrenNode_PetitionLetterReplyStatistics;//三级菜单_信件办理统计
    @Autowired
    private Button chirldrenNode_SiteTraffic;//二级菜单_站点浏览量明细

    public Button getParentNode_PerformanceCenter() {
        return parentNode_PerformanceCenter;
    }

    public void setParentNode_PerformanceCenter(Button parentNode_PerformanceCenter) {
        this.parentNode_PerformanceCenter = parentNode_PerformanceCenter;
    }

    public Button getChirldrenNode_ArticleScore() {
        return chirldrenNode_ArticleScore;
    }

    public void setChirldrenNode_ArticleScore(Button chirldrenNode_ArticleScore) {
        this.chirldrenNode_ArticleScore = chirldrenNode_ArticleScore;
    }

    public Button getChirldrenNode_NodeUpdateCycleStatistics() {
        return chirldrenNode_NodeUpdateCycleStatistics;
    }

    public void setChirldrenNode_NodeUpdateCycleStatistics(Button chirldrenNode_NodeUpdateCycleStatistics) {
        this.chirldrenNode_NodeUpdateCycleStatistics = chirldrenNode_NodeUpdateCycleStatistics;
    }

    public Button getChirldrenNode_CountByDepartmentApprove() {
        return chirldrenNode_CountByDepartmentApprove;
    }

    public void setChirldrenNode_CountByDepartmentApprove(Button chirldrenNode_CountByDepartmentApprove) {
        this.chirldrenNode_CountByDepartmentApprove = chirldrenNode_CountByDepartmentApprove;
    }

    public Button getChirldrenNode_ScoreOfDepartment() {
        return chirldrenNode_ScoreOfDepartment;
    }

    public void setChirldrenNode_ScoreOfDepartment(Button chirldrenNode_ScoreOfDepartment) {
        this.chirldrenNode_ScoreOfDepartment = chirldrenNode_ScoreOfDepartment;
    }

    public Button getChirldrenNode_ScoreByApproveDataCount() {
        return chirldrenNode_ScoreByApproveDataCount;
    }

    public void setChirldrenNode_ScoreByApproveDataCount(Button chirldrenNode_ScoreByApproveDataCount) {
        this.chirldrenNode_ScoreByApproveDataCount = chirldrenNode_ScoreByApproveDataCount;
    }

    public Button getChirldrenNode_ScoreOfInputtert() {
        return chirldrenNode_ScoreOfInputtert;
    }

    public void setChirldrenNode_ScoreOfInputtert(Button chirldrenNode_ScoreOfInputtert) {
        this.chirldrenNode_ScoreOfInputtert = chirldrenNode_ScoreOfInputtert;
    }

    public Button getChirldrenNode_RemunerationOfInputter() {
        return chirldrenNode_RemunerationOfInputter;
    }

    public void setChirldrenNode_RemunerationOfInputter(Button chirldrenNode_RemunerationOfInputter) {
        this.chirldrenNode_RemunerationOfInputter = chirldrenNode_RemunerationOfInputter;
    }

    public Button getChirldrenNode_StatisticsOfPublicInformation() {
        return chirldrenNode_StatisticsOfPublicInformation;
    }

    public void setChirldrenNode_StatisticsOfPublicInformation(Button chirldrenNode_StatisticsOfPublicInformation) {
        this.chirldrenNode_StatisticsOfPublicInformation = chirldrenNode_StatisticsOfPublicInformation;
    }

    public Button getChirldrenNode_SubjectCategoryUpdateCycleStatistics() {
        return chirldrenNode_SubjectCategoryUpdateCycleStatistics;
    }

    public void setChirldrenNode_SubjectCategoryUpdateCycleStatistics(Button chirldrenNode_SubjectCategoryUpdateCycleStatistics) {
        this.chirldrenNode_SubjectCategoryUpdateCycleStatistics = chirldrenNode_SubjectCategoryUpdateCycleStatistics;
    }

    public Button getChirldrenNode_PetitionStatistics() {
        return chirldrenNode_PetitionStatistics;
    }

    public void setChirldrenNode_PetitionStatistics(Button chirldrenNode_PetitionStatistics) {
        this.chirldrenNode_PetitionStatistics = chirldrenNode_PetitionStatistics;
    }

    public Button getChirldrenNode_PetitionLetterReplyStatistics() {
        return chirldrenNode_PetitionLetterReplyStatistics;
    }

    public void setChirldrenNode_PetitionLetterReplyStatistics(Button chirldrenNode_PetitionLetterReplyStatistics) {
        this.chirldrenNode_PetitionLetterReplyStatistics = chirldrenNode_PetitionLetterReplyStatistics;
    }

    public Button getChirldrenNode_SiteTraffic() {
        return chirldrenNode_SiteTraffic;
    }

    public void setChirldrenNode_SiteTraffic(Button chirldrenNode_SiteTraffic) {
        this.chirldrenNode_SiteTraffic = chirldrenNode_SiteTraffic;
    }
}
