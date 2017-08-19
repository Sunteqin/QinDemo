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
public class Publicinformation_MainPage extends Page {

    @Autowired
    private Button parentNode_Publicinformation;//一级菜单_信息公开
    @Autowired
    private Button chirldrenNode_PublicinformationManage;//三级菜单_公开信息管理
    @Autowired
    private Button chirldrenNode_ApplicationForInformationDisclosure;//二级菜单_信息公开申请表
    @Autowired
    private Button chirldrenNode_ApplicationformManage;//三级菜单_申请表管理
    @Autowired
    private Button chirldrenNode_SetCurrenSiteDepartmentManager;//三级菜单_申请表管理员设置
    @Autowired
    private Button chirldrenNode_SubjectcategoryManage;//二级菜单_主题管理
    @Autowired
    private Button chirldrenNode_SubjectCategoryPermissionsetManage;//二级菜单_主题角色管理
    @Autowired
    private Button chirldrenNode_DepartmentSetting;//二级菜单_部门设置

    public Button getParentNode_Publicinformation() {
        return parentNode_Publicinformation;
    }

    public void setParentNode_Publicinformation(Button parentNode_Publicinformation) {
        this.parentNode_Publicinformation = parentNode_Publicinformation;
    }

    public Button getChirldrenNode_PublicinformationManage() {
        return chirldrenNode_PublicinformationManage;
    }

    public void setChirldrenNode_PublicinformationManage(Button chirldrenNode_PublicinformationManage) {
        this.chirldrenNode_PublicinformationManage = chirldrenNode_PublicinformationManage;
    }

    public Button getChirldrenNode_ApplicationForInformationDisclosure() {
        return chirldrenNode_ApplicationForInformationDisclosure;
    }

    public void setChirldrenNode_ApplicationForInformationDisclosure(Button chirldrenNode_ApplicationForInformationDisclosure) {
        this.chirldrenNode_ApplicationForInformationDisclosure = chirldrenNode_ApplicationForInformationDisclosure;
    }

    public Button getChirldrenNode_ApplicationformManage() {
        return chirldrenNode_ApplicationformManage;
    }

    public void setChirldrenNode_ApplicationformManage(Button chirldrenNode_ApplicationformManage) {
        this.chirldrenNode_ApplicationformManage = chirldrenNode_ApplicationformManage;
    }

    public Button getChirldrenNode_SetCurrenSiteDepartmentManager() {
        return chirldrenNode_SetCurrenSiteDepartmentManager;
    }

    public void setChirldrenNode_SetCurrenSiteDepartmentManager(Button chirldrenNode_SetCurrenSiteDepartmentManager) {
        this.chirldrenNode_SetCurrenSiteDepartmentManager = chirldrenNode_SetCurrenSiteDepartmentManager;
    }

    public Button getChirldrenNode_SubjectcategoryManage() {
        return chirldrenNode_SubjectcategoryManage;
    }

    public void setChirldrenNode_SubjectcategoryManage(Button chirldrenNode_SubjectcategoryManage) {
        this.chirldrenNode_SubjectcategoryManage = chirldrenNode_SubjectcategoryManage;
    }

    public Button getChirldrenNode_SubjectCategoryPermissionsetManage() {
        return chirldrenNode_SubjectCategoryPermissionsetManage;
    }

    public void setChirldrenNode_SubjectCategoryPermissionsetManage(Button chirldrenNode_SubjectCategoryPermissionsetManage) {
        this.chirldrenNode_SubjectCategoryPermissionsetManage = chirldrenNode_SubjectCategoryPermissionsetManage;
    }

    public Button getChirldrenNode_DepartmentSetting() {
        return chirldrenNode_DepartmentSetting;
    }

    public void setChirldrenNode_DepartmentSetting(Button chirldrenNode_DepartmentSetting) {
        this.chirldrenNode_DepartmentSetting = chirldrenNode_DepartmentSetting;
    }
}
