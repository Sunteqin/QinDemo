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
public class ContentManage_MainPage  extends Page {

    @Autowired
    private Button parentNode_ContentManage;//一级菜单_内容管理
    @Autowired
    private Button chirldrenNode_ContentHome;//二级菜单_内容采编发
    @Autowired
    private Button chirldrenNode_ContentNavigationFiling;//二级菜单_内容归档
    @Autowired
    private Button chirldrenNode_ContentRecycle;//二级菜单_内容回收站
    @Autowired
    private Button chirldrenNode_SpecialManage;//二级菜单_专题管理
    @Autowired
    private Button chirldrenNode_NodeManage;//二级菜单_节点管理
    @Autowired
    private Button chirldrenNode_TagManage;//二级菜单_标记管理
    @Autowired
    private Button chirldrenNode_ArticleTag;//三级菜单_文章标记管理
    @Autowired
    private Button chirldrenNode_PhotoTag;//三级菜单_图片标记管理
    @Autowired
    private Button chirldrenNode_SpecialTag;//三级菜单_专题标记管理
    @Autowired
    private Button chirldrenNode_PrivilegeManage;//二级菜单_权限管理
    @Autowired
    private Button chirldrenNode_NodePermissionSet;//三级菜单_节点角色管理
    @Autowired
    private Button chirldrenNode_BatchNodePermissionSetRelationConfig;//三级菜单_按节点配置权限
    @Autowired
    private Button chirldrenNode_AuditProcess;//三级菜单_审核流程管理
    @Autowired
    private Button chirldrenNode_FieldPermissionManage;//三级菜单_字段权限管理
    @Autowired
    private Button chirldrenNode_DispatchDepartment;//二级菜单_发文部门管理

    public Button getParentNode_ContentManage() {
        return parentNode_ContentManage;
    }

    public void setParentNode_ContentManage(Button parentNode_ContentManage) {
        this.parentNode_ContentManage = parentNode_ContentManage;
    }

    public Button getChirldrenNode_ContentHome() {
        return chirldrenNode_ContentHome;
    }

    public void setChirldrenNode_ContentHome(Button chirldrenNode_ContentHome) {
        this.chirldrenNode_ContentHome = chirldrenNode_ContentHome;
    }

    public Button getChirldrenNode_ContentNavigationFiling() {
        return chirldrenNode_ContentNavigationFiling;
    }

    public void setChirldrenNode_ContentNavigationFiling(Button chirldrenNode_ContentNavigationFiling) {
        this.chirldrenNode_ContentNavigationFiling = chirldrenNode_ContentNavigationFiling;
    }

    public Button getChirldrenNode_ContentRecycle() {
        return chirldrenNode_ContentRecycle;
    }

    public void setChirldrenNode_ContentRecycle(Button chirldrenNode_ContentRecycle) {
        this.chirldrenNode_ContentRecycle = chirldrenNode_ContentRecycle;
    }

    public Button getChirldrenNode_SpecialManage() {
        return chirldrenNode_SpecialManage;
    }

    public void setChirldrenNode_SpecialManage(Button chirldrenNode_SpecialManage) {
        this.chirldrenNode_SpecialManage = chirldrenNode_SpecialManage;
    }

    public Button getChirldrenNode_NodeManage() {
        return chirldrenNode_NodeManage;
    }

    public void setChirldrenNode_NodeManage(Button chirldrenNode_NodeManage) {
        this.chirldrenNode_NodeManage = chirldrenNode_NodeManage;
    }

    public Button getChirldrenNode_TagManage() {
        return chirldrenNode_TagManage;
    }

    public void setChirldrenNode_TagManage(Button chirldrenNode_TagManage) {
        this.chirldrenNode_TagManage = chirldrenNode_TagManage;
    }

    public Button getChirldrenNode_ArticleTag() {
        return chirldrenNode_ArticleTag;
    }

    public void setChirldrenNode_ArticleTag(Button chirldrenNode_ArticleTag) {
        this.chirldrenNode_ArticleTag = chirldrenNode_ArticleTag;
    }

    public Button getChirldrenNode_PhotoTag() {
        return chirldrenNode_PhotoTag;
    }

    public void setChirldrenNode_PhotoTag(Button chirldrenNode_PhotoTag) {
        this.chirldrenNode_PhotoTag = chirldrenNode_PhotoTag;
    }

    public Button getChirldrenNode_SpecialTag() {
        return chirldrenNode_SpecialTag;
    }

    public void setChirldrenNode_SpecialTag(Button chirldrenNode_SpecialTag) {
        this.chirldrenNode_SpecialTag = chirldrenNode_SpecialTag;
    }

    public Button getChirldrenNode_PrivilegeManage() {
        return chirldrenNode_PrivilegeManage;
    }

    public void setChirldrenNode_PrivilegeManage(Button chirldrenNode_PrivilegeManage) {
        this.chirldrenNode_PrivilegeManage = chirldrenNode_PrivilegeManage;
    }

    public Button getChirldrenNode_NodePermissionSet() {
        return chirldrenNode_NodePermissionSet;
    }

    public void setChirldrenNode_NodePermissionSet(Button chirldrenNode_NodePermissionSet) {
        this.chirldrenNode_NodePermissionSet = chirldrenNode_NodePermissionSet;
    }

    public Button getChirldrenNode_BatchNodePermissionSetRelationConfig() {
        return chirldrenNode_BatchNodePermissionSetRelationConfig;
    }

    public void setChirldrenNode_BatchNodePermissionSetRelationConfig(Button chirldrenNode_BatchNodePermissionSetRelationConfig) {
        this.chirldrenNode_BatchNodePermissionSetRelationConfig = chirldrenNode_BatchNodePermissionSetRelationConfig;
    }

    public Button getChirldrenNode_AuditProcess() {
        return chirldrenNode_AuditProcess;
    }

    public void setChirldrenNode_AuditProcess(Button chirldrenNode_AuditProcess) {
        this.chirldrenNode_AuditProcess = chirldrenNode_AuditProcess;
    }

    public Button getChirldrenNode_FieldPermissionManage() {
        return chirldrenNode_FieldPermissionManage;
    }

    public void setChirldrenNode_FieldPermissionManage(Button chirldrenNode_FieldPermissionManage) {
        this.chirldrenNode_FieldPermissionManage = chirldrenNode_FieldPermissionManage;
    }

    public Button getChirldrenNode_DispatchDepartment() {
        return chirldrenNode_DispatchDepartment;
    }

    public void setChirldrenNode_DispatchDepartment(Button chirldrenNode_DispatchDepartment) {
        this.chirldrenNode_DispatchDepartment = chirldrenNode_DispatchDepartment;
    }
}
