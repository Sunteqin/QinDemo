package com.siteazure.demo.model;

import java.util.List;

/**
 * 用例执行结果
 * Created by family-sunte on 2017/6/18.
 */
public class ReportResult {

    /**
     * 用例名称
     */
    private String reportName ;

    /**
     * 用例执行结果
     */
    private Boolean reportImplState;

    /**
     * 截图状态
     */
    private Boolean screenshotState ;

    /**
     * 用例详情执行结果列表
     */
    private List<CaseResult> caseResults ;


    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public Boolean getReportImplState() {
        return reportImplState;
    }

    public void setReportImplState(Boolean reportImplState) {
        this.reportImplState = reportImplState;
    }

    public Boolean getScreenshotState() {
        return screenshotState;
    }

    public void setScreenshotState(Boolean screenshotState) {
        this.screenshotState = screenshotState;
    }

    public List<CaseResult> getCaseResults() {
        return caseResults;
    }

    public void setCaseResults(List<CaseResult> caseResults) {
        this.caseResults = caseResults;
    }
}
