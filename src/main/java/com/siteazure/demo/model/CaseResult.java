package com.siteazure.demo.model;

import org.apache.xpath.operations.Bool;

/**
 * 用例详情执行结果
 * Created by family-sunte on 2017/6/18.
 */
public class CaseResult {


    /**
     * 用例详情名称
     */
    private String caseName ;

    /**
     * 用例详情执行结果
     */
    private Boolean caseImplState;

    /**
     * 截图状态
     */
    private Boolean screenshotState ;


    public CaseResult(){}

    public  CaseResult(String caseName , Boolean caseImplState){
        this.caseName = caseName ;
        this.caseImplState = caseImplState;
    }



    public  CaseResult(String caseName , Boolean caseImplState, Boolean screenshotState){
        this.caseName = caseName ;
        this.caseImplState = caseImplState;
        this.screenshotState = screenshotState ;
    }


    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public Boolean getCaseImplState() {
        return caseImplState;
    }

    public void setCaseImplState(Boolean caseImplState) {
        this.caseImplState = caseImplState;
    }

    public Boolean getScreenshotState() {
        return screenshotState;
    }

    public void setScreenshotState(Boolean screenshotState) {
        this.screenshotState = screenshotState;
    }
}
