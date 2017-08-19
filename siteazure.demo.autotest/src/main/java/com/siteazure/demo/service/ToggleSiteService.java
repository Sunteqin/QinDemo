package com.siteazure.demo.service;

import com.siteazure.demo.model.ReportResult;
import org.suren.autotest.web.framework.settings.SettingUtil;

/**
 * Created by family-sunte on 2017/6/18.
 */
public interface ToggleSiteService {
    //登录的方法
    public ReportResult toggleSite(SettingUtil util);
}
