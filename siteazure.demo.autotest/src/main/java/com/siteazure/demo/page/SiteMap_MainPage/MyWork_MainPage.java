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
public class MyWork_MainPage  extends Page {

    @Autowired
    private Button parentNode_MyWork;//一级菜单_我的工作
    @Autowired
    private Button chirldrenNode_MyWorkbench;//二级菜单_我的工作台
    @Autowired
    private Button chirldrenNode_MessageListNavigation;//二级菜单_我的站内短消息
    @Autowired
    private Button chirldrenNode_ContentManage;//二级菜单_内容管理
    @Autowired
    private Button chirldrenNode_Drafts;//三级菜单_草稿箱
    @Autowired
    private Button chirldrenNode_RejectionBox;//三级菜单_退稿箱

    public Button getParentNode_MyWork() {
        return parentNode_MyWork;
    }

    public void setParentNode_MyWork(Button parentNode_MyWork) {
        this.parentNode_MyWork = parentNode_MyWork;
    }

    public Button getChirldrenNode_MyWorkbench() {
        return chirldrenNode_MyWorkbench;
    }

    public void setChirldrenNode_MyWorkbench(Button chirldrenNode_MyWorkbench) {
        this.chirldrenNode_MyWorkbench = chirldrenNode_MyWorkbench;
    }

    public Button getChirldrenNode_MessageListNavigation() {
        return chirldrenNode_MessageListNavigation;
    }

    public void setChirldrenNode_MessageListNavigation(Button chirldrenNode_MessageListNavigation) {
        this.chirldrenNode_MessageListNavigation = chirldrenNode_MessageListNavigation;
    }

    public Button getChirldrenNode_ContentManage() {
        return chirldrenNode_ContentManage;
    }

    public void setChirldrenNode_ContentManage(Button chirldrenNode_ContentManage) {
        this.chirldrenNode_ContentManage = chirldrenNode_ContentManage;
    }

    public Button getChirldrenNode_Drafts() {
        return chirldrenNode_Drafts;
    }

    public void setChirldrenNode_Drafts(Button chirldrenNode_Drafts) {
        this.chirldrenNode_Drafts = chirldrenNode_Drafts;
    }

    public Button getChirldrenNode_RejectionBox() {
        return chirldrenNode_RejectionBox;
    }

    public void setChirldrenNode_RejectionBox(Button chirldrenNode_RejectionBox) {
        this.chirldrenNode_RejectionBox = chirldrenNode_RejectionBox;
    }
}
