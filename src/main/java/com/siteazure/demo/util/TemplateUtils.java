package com.siteazure.demo.util;

import com.siteazure.demo.model.CaseResult;
import com.siteazure.demo.model.ReportResult;

import java.util.List;
import java.util.Map;

/**
 * Created by family-sunte on 2017/6/18.
 */

public class TemplateUtils {
    /**
     * 获取报告html内容
     * @param reportResults 用例列表执行结果
     * @return
     */
    public static String getReportTemplateHtml(List<ReportResult> reportResults) {

        StringBuffer htmlContent = new StringBuffer("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<style>\n" +
                "    *{\n" +
                "        margin:0;\n" +
                "        padding:0;\n" +
                "    }\n" +
                "    .title{text-align: center;}\n" +
                "    .table_title{ font-weight: bold;}\n" +
                "    .report_content{margin-top:10px;}\n" +
                "    .report_result,.table_title{\n" +
                "        width:100%;\n" +
                "        text-align: center;\n" +
                "    }\n" +
                "    .report_result tr,.table_title tr{\n" +
                "        background: #E8E8E8;\n" +
                "    }\n" +
                "    .report_result tr td,.table_title  tr td{\n" +
                "        width:33%;\n" +
                "        padding:10px 0;\n" +
                "    }\n" +
                "\n" +
                "\n" +
                ".case_content{width:99%; margin:0 .5%;}\n"+
                "    .case_result{\n" +
                "        width:100%;\n" +
                "        text-align: center;\n" +
                "        font-size:14px;\n"+
                "    }\n" +
                "    .case_result tbody{\n" +
                "        width:100%;\n" +
                "    }\n" +
                "    .case_result tr{\n" +
                "        background: ghostwhite;\n" +
                "    }\n" +
                "    .case_result tr td{\n" +
                "        width:33%;\n" +
                "        padding:5px;\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    .success_result{background:greenyellow;color:#FFFFFF;}\n" +
                "    .fail_result{background: red;color:#FFFFFF;}\n" +
                "</style>\n" +
                "<body>\n" +
                "    <h1 class = \"title\">测试用例执行结果报告</h1>\n" +
                "    <table class=\"table_title\"  cellpadding=\"0\" cellspacing=\"0\" >\n" +
                "        <tr>\n" +
                "            <td>测试用例名称</td>\n" +
                "            <td>执行状态</td>\n" +
                "            <td>截图状态</td>\n" +
                "        </tr>\n" +
                "    </table>\n" +
                "    <hr/>\n");
        for (ReportResult reportResult : reportResults) {
            htmlContent.append("    <div class = \"report_content\">\n" +
                    "        <table class=\"report_result\" cellpadding=\"0\" cellspacing=\"0\" >\n" +
                    "            <tr>\n" +
                    "                <td>" + reportResult.getReportName() + "</td>\n" +
                    "                <td class=\""+getStateSituation(reportResult.getReportImplState())+"\">"+reportResult.getReportImplState()+"</td>\n" +
                    "                <td class=\""+getStateSituation(reportResult.getScreenshotState())+"\">" + (reportResult.getScreenshotState()==null?"无截图":reportResult.getScreenshotState())+"</td>\n" +
                    "            </tr>\n" +
                    "    </table><div class = \"case_content\"  style=\"display: none;border:1px solid #E8E8E8\" >" +
                    "                  <table class = \"case_result\">\n" +
                    "                    <tr class=\"table_title\">\n" +
                    "                        <td>测试详情名称</td>\n" +
                    "                        <td>执行状态</td>\n" +
                    "                        <td>截图状态</td>\n" +
                    "                    </tr>\n");
            List<CaseResult> caseResults = reportResult.getCaseResults();
            for (CaseResult caseResult : caseResults) {
                htmlContent.append("                    <tr>\n" +
                        "                        <td>" + caseResult.getCaseName() + "</td>\n" +
                        "                        <td class=\""+getStateSituation(caseResult.getCaseImplState())+"\">"+caseResult.getCaseImplState()+"</td>\n" +
                        "                        <td class = \""+getStateSituation(caseResult.getScreenshotState())+"\">" + (caseResult.getScreenshotState()==null?"无截图":caseResult.getScreenshotState()) + "</td>\n" +
                        "                    </tr>\n");
            }
            htmlContent.append("                </table></div>\n" +
                    "    </div>\n");
        }

        htmlContent.append("</body>\n" +
                "<script type=\"text/javascript\">\n" +
                "    window.onload = function(){\n" +
                "\n" +
                "        var reports = document.getElementsByClassName(\"report_result\");\n" +
                "\n" +
                "        for(var i = 0 ; i < reports.length ; i ++  ) {\n" +
                "            reports[i].onclick = function (e) {\n" +
                "                var report = this;\n" +
                "                var caseResult = report.nextSibling;\n" +
                "                var caseResultDisplay = caseResult.style.display;\n" +
                "                caseResult.style.display = caseResultDisplay == \"none\" ? \"table\" : \"none\";\n" +
                "            }\n" +
                "        }\n" +
                "        var ts = document.getElementsByTagName(\"table\");\n" +
                "        for(var i = 0 ; i < ts.length ; i ++  ) {\n" +
                "            ts[i].onmouseover = function () {\n" +
                "                var t = this;\n" +
                "                t.style.opacity = \"0.8\";\n" +
                "            }\n" +
                "            ts[i].onmouseout = function () {\n" +
                "                var t = this;\n" +
                "                t.style.opacity = \"1\";\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "\n" +
                "</script>\n" +
                "</html>");
        return htmlContent.toString();
    }


    private static String getStateSituation(Boolean state){
        if(state == null) return "" ;
        else if(state) return "success_result";
        else return "fail_result";
    }
}
