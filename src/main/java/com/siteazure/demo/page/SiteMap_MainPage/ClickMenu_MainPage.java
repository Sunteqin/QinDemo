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
public class ClickMenu_MainPage extends Page {

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


	@Autowired
	private Button parentNode_EngineeringConstructionField;//一级菜单_工程建设领域
	@Autowired
	private Button chirldrenNode_ProjectinfoPublicity;//二级菜单_项目公开信息
	@Autowired
	private Button chirldrenNode_ConstructionCompany;//二级菜单_从业单位信用信息
	@Autowired
	private Button chirldrenNode_Employee;//二级菜单_从业人员信用信息
	@Autowired
	private Button chirldrenNode_LandRightsInformation;//二级菜单_土地使用权信息
	@Autowired
	private Button chirldrenNode_MiningRightsInformation;//二级菜单_矿业权信息
	@Autowired
	private Button chirldrenNode_EngineeringConstructionAllocation;//二级菜单_工程建设配置
	@Autowired
	private Button chirldrenNode_CatalogManage;//三级菜单_公开目录管理
	@Autowired
	private Button chirldrenNode_ProjectinfoPublicityMold;//三级菜单_工程信息模型管理
	@Autowired
	private Button chirldrenNode_ProjectinfoPublicityConfig;//三级菜单_工程建设领域配置


	@Autowired
	private Button parentNode_ConvenienceInformation;//一级菜单_便民咨询
	@Autowired
	private Button chirldrenNode_LetterManage;//二级菜单_咨询信件管理
	@Autowired
	private Button chirldrenNode_LetterCategory;//二级菜单_信件分类管理
	@Autowired
	private Button parentNode_LetterComment;//一级菜单_信件评论管理
	@Autowired
	private Button chirldrenNode_SiteLetterboxConfig;//二级菜单_便民咨询配置

	@Autowired
	private Button parentNode_PetitionManagement;//一级菜单_信访管理
	@Autowired
	private Button chirldrenNode_PetitionLetter;//二级菜单_信件管理
	@Autowired
	private Button chirldrenNode_LeaderLetter;//二级菜单_批核信件管理
	@Autowired
	private Button parentNode_DdepartmentLetter;//一级菜单_部门信件办理
	@Autowired
	private Button chirldrenNode_SetDdepartmentManager;//二级菜单_信访部门成员设置


	@Autowired
	private Button parentNode_OnlineInterview;//一级菜单_在线访谈
	@Autowired
	private Button chirldrenNode_InterviewManage;//二级菜单_访谈管理
	@Autowired
	private Button chirldrenNode_RelatedContentCategory;//二级菜单_相关内容分类
	@Autowired
	private Button chirldrenNode_OnlineinterViewConfig;//二级菜单_在线访谈配置


	@Autowired
	private Button parentNode_OnlineService;//一级菜单_网上办事
	@Autowired
	private Button chirldrenNode_ServiceitemManage;//二级菜单_服务事项管理
	@Autowired
	private Button chirldrenNode_WorkWindow;//二级菜单_办事窗口管理
	@Autowired
	private Button chirldrenNode_ServicehallDepartment;//二级菜单_部门管理
	@Autowired
	private Button chirldrenNode_ServicehallTopic;//二级菜单_主题管理
	@Autowired
	private Button chirldrenNode_AdministrativeDivision;//二级菜单_行政区域
	@Autowired
	private Button chirldrenNode_servicehallconfig;//二级菜单_网上办事配置

	@Autowired
	private Button parentNode_CustomForm;//一级菜单_在线表单
	@Autowired
	private Button chirldrenNode_FormManage;//二级菜单_表单管理
	@Autowired
	private Button chirldrenNode_FormCategory;//二级菜单_表单分类管理
	@Autowired
	private Button chirldrenNode_SiteCustomformConfig;//二级菜单_表单配置


	@Autowired
	private Button parentNode_Advertising;//一级菜单_广告管理
	@Autowired
	private Button chirldrenNode_AdvertisementSpace;//二级菜单_广告版位管理
	@Autowired
	private Button chirldrenNode_Advertisement;//二级菜单_广告基本信息管理


	@Autowired
	private Button parentNode_Survey;//一级菜单_问卷调查
	@Autowired
	private Button chirldrenNode_QuestionnaireManage;//二级菜单_问卷调查管理
	@Autowired
	private Button chirldrenNode_QuestionnaireTemplateConfig;//二级菜单_问卷调查配置

	@Autowired
	private Button parentNode_Voting;//一级菜单_投票管理
	@Autowired
	private Button chirldrenNode_VoteManage;//二级菜单_投票管理
	@Autowired
	private Button chirldrenNode_VoteTemplateConfig;//二级菜单_投票模板配置


	@Autowired
	private Button parentNode_WeChatManagement;//一级菜单_微信管理
	@Autowired
	private Button chirldrenNode_MssSendMessage;//二级菜单_群发管理
	@Autowired
	private Button chirldrenNode_CustommenuManage;//二级菜单_菜单管理
	@Autowired
	private Button chirldrenNode_MaterialManagement;//二级菜单_素材管理
	@Autowired
	private Button chirldrenNode_NewsSetMaterial;//三级菜单_图文素材
	@Autowired
	private Button chirldrenNode_PhotoMaterial;//三级菜单_图片素材
	@Autowired
	private Button chirldrenNode_FanManage;//二级菜单_用户管理
	@Autowired
	private Button chirldrenNode_PublicaccountManage;//二级菜单_公众号管理


	@Autowired
	private Button parentNode_FullTextSearch;//一级菜单_全文检索
	@Autowired
	private Button chirldrenNode_searchItem;//二级菜单_搜索项管理
	@Autowired
	private Button chirldrenNode_ModifyConfig;//二级菜单_全文检索配置

	@Autowired
	private Button parentNode_DataCenter;//一级菜单_数据中心
	@Autowired
	private Button chirldrenNode_DataCenterHome;//二级菜单_共享数据

	@Autowired
	private Button parentNode_DataCollection;//一级菜单_数据采集管理
	@Autowired
	private Button chirldrenNode_CollectionItem;//二级菜单_采集项目管理


	@Autowired
	private Button parentNode_FileManage;//一级菜单_文件管理
	@Autowired
	private Button chirldrenNode_SiteViewFile;//二级菜单_模板管理
	@Autowired
	private Button chirldrenNode_SiteStyleFile;//二级菜单_风格管理


	@Autowired
	private Button parentNode_SiteAdministratorManage;//一级菜单_权限管理
	@Autowired
	private Button chirldrenNode_SiteAdministrator;//二级菜单_管理员管理
	@Autowired
	private Button chirldrenNode_SiteAdministratorGroup;//二级菜单_管理员组管理
	@Autowired
	private Button chirldrenNode_SitePermissionset;//二级菜单_站点角色管理


	@Autowired
	private Button parentNode_SiteManage;//一级菜单_站点管理
	@Autowired
	private Button chirldrenNode_SiteSetting;//二级菜单_站点设置
	@Autowired
	private Button chirldrenNode_SiteSettingSetIpLimit;//二级菜单_站点IP访问限定


	public Button getparentNode_MyWork() {
		return parentNode_MyWork;
	}

	public void setparentNode_MyWork(Button parentNode_MyWork) {
		parentNode_MyWork = parentNode_MyWork;
	}

	public Button getchirldrenNode_MyWorkbench() {
		return chirldrenNode_MyWorkbench;
	}

	public void setchirldrenNode_MyWorkbench(Button chirldrenNode_MyWorkbench) {
		chirldrenNode_MyWorkbench = chirldrenNode_MyWorkbench;
	}

	public Button getchirldrenNode_MessageListNavigation() {
		return chirldrenNode_MessageListNavigation;
	}

	public void setchirldrenNode_MessageListNavigation(
			Button chirldrenNode_MessageListNavigation) {
		chirldrenNode_MessageListNavigation = chirldrenNode_MessageListNavigation;
	}

	public Button getchirldrenNode_ContentManage() {
		return chirldrenNode_ContentManage;
	}

	public void setchirldrenNode_ContentManage(Button chirldrenNode_ContentManage) {
		chirldrenNode_ContentManage = chirldrenNode_ContentManage;
	}

	public Button getchirldrenNode_Drafts() {
		return chirldrenNode_Drafts;
	}

	public void setchirldrenNode_Drafts(Button chirldrenNode_Drafts) {
		chirldrenNode_Drafts = chirldrenNode_Drafts;
	}

	public Button getchirldrenNode_RejectionBox() {
		return chirldrenNode_RejectionBox;
	}

	public void setchirldrenNode_RejectionBox(Button chirldrenNode_RejectionBox) {
		chirldrenNode_RejectionBox = chirldrenNode_RejectionBox;
	}


	public Button getparentNode_PerformanceCenter() {
		return parentNode_PerformanceCenter;
	}

	public void setparentNode_PerformanceCenter(Button parentNode_PerformanceCenter) {
		parentNode_PerformanceCenter = parentNode_PerformanceCenter;
	}

	public Button getchirldrenNode_ArticleScore() {
		return chirldrenNode_ArticleScore;
	}

	public void setchirldrenNode_ArticleScore(Button chirldrenNode_ArticleScore) {
		chirldrenNode_ArticleScore = chirldrenNode_ArticleScore;
	}

	public Button getchirldrenNode_NodeUpdateCycleStatistics() {
		return chirldrenNode_NodeUpdateCycleStatistics;
	}

	public void setchirldrenNode_NodeUpdateCycleStatistics(Button chirldrenNode_NodeUpdateCycleStatistics) {
		chirldrenNode_NodeUpdateCycleStatistics = chirldrenNode_NodeUpdateCycleStatistics;
	}

	public Button getchirldrenNode_CountByDepartmentApprove() {
		return chirldrenNode_CountByDepartmentApprove;
	}

	public void setchirldrenNode_CountByDepartmentApprove(Button chirldrenNode_CountByDepartmentApprove) {
		chirldrenNode_CountByDepartmentApprove = chirldrenNode_CountByDepartmentApprove;
	}

	public Button getchirldrenNode_ScoreOfDepartment() {
		return chirldrenNode_ScoreOfDepartment;
	}

	public void setchirldrenNode_ScoreOfDepartment(Button chirldrenNode_ScoreOfDepartment) {
		chirldrenNode_ScoreOfDepartment = chirldrenNode_ScoreOfDepartment;
	}

	public Button getchirldrenNode_ScoreByApproveDataCount() {
		return chirldrenNode_ScoreByApproveDataCount;
	}

	public void setchirldrenNode_ScoreByApproveDataCount(Button chirldrenNode_ScoreByApproveDataCount) {
		chirldrenNode_ScoreByApproveDataCount = chirldrenNode_ScoreByApproveDataCount;
	}

	public Button getchirldrenNode_ScoreOfInputtert() {
		return chirldrenNode_ScoreOfInputtert;
	}

	public void setchirldrenNode_ScoreOfInputtert(Button chirldrenNode_ScoreOfInputtert) {
		chirldrenNode_ScoreOfInputtert = chirldrenNode_ScoreOfInputtert;
	}

	public Button getchirldrenNode_RemunerationOfInputter() {
		return chirldrenNode_RemunerationOfInputter;
	}

	public void setchirldrenNode_RemunerationOfInputter(Button chirldrenNode_RemunerationOfInputter) {
		chirldrenNode_RemunerationOfInputter = chirldrenNode_RemunerationOfInputter;
	}

	public Button getchirldrenNode_StatisticsOfPublicInformation() {
		return chirldrenNode_StatisticsOfPublicInformation;
	}

	public void setchirldrenNode_StatisticsOfPublicInformation(Button chirldrenNode_StatisticsOfPublicInformation) {
		chirldrenNode_StatisticsOfPublicInformation = chirldrenNode_StatisticsOfPublicInformation;
	}

	public Button getchirldrenNode_SubjectCategoryUpdateCycleStatistics() {
		return chirldrenNode_SubjectCategoryUpdateCycleStatistics;
	}

	public void setchirldrenNode_SubjectCategoryUpdateCycleStatistics(Button chirldrenNode_SubjectCategoryUpdateCycleStatistics) {
		chirldrenNode_SubjectCategoryUpdateCycleStatistics = chirldrenNode_SubjectCategoryUpdateCycleStatistics;
	}

	public Button getchirldrenNode_PetitionStatistics() {
		return chirldrenNode_PetitionStatistics;
	}

	public void setchirldrenNode_PetitionStatistics(Button chirldrenNode_PetitionStatistics) {
		chirldrenNode_PetitionStatistics = chirldrenNode_PetitionStatistics;
	}

	public Button getchirldrenNode_PetitionLetterReplyStatistics() {
		return chirldrenNode_PetitionLetterReplyStatistics;
	}

	public void setchirldrenNode_PetitionLetterReplyStatistics(Button chirldrenNode_PetitionLetterReplyStatistics) {
		chirldrenNode_PetitionLetterReplyStatistics = chirldrenNode_PetitionLetterReplyStatistics;
	}

	public Button getchirldrenNode_SiteTraffic() {
		return chirldrenNode_SiteTraffic;
	}

	public void setchirldrenNode_SiteTraffic(Button chirldrenNode_SiteTraffic) {
		chirldrenNode_SiteTraffic = chirldrenNode_SiteTraffic;
	}

	public Button getparentNode_ContentManage() {
		return parentNode_ContentManage;
	}

	public void setparentNode_ContentManage(Button parentNode_ContentManage) {
		parentNode_ContentManage = parentNode_ContentManage;
	}

	public Button getchirldrenNode_ContentHome() {
		return chirldrenNode_ContentHome;
	}

	public void setchirldrenNode_ContentHome(Button chirldrenNode_ContentHome) {
		chirldrenNode_ContentHome = chirldrenNode_ContentHome;
	}

	public Button getchirldrenNode_ContentNavigationFiling() {
		return chirldrenNode_ContentNavigationFiling;
	}

	public void setchirldrenNode_ContentNavigationFiling(Button chirldrenNode_ContentNavigationFiling) {
		chirldrenNode_ContentNavigationFiling = chirldrenNode_ContentNavigationFiling;
	}

	public Button getchirldrenNode_ContentRecycle() {
		return chirldrenNode_ContentRecycle;
	}

	public void setchirldrenNode_ContentRecycle(Button chirldrenNode_ContentRecycle) {
		chirldrenNode_ContentRecycle = chirldrenNode_ContentRecycle;
	}

	public Button getchirldrenNode_SpecialManage() {
		return chirldrenNode_SpecialManage;
	}

	public void setchirldrenNode_SpecialManage(Button chirldrenNode_SpecialManage) {
		chirldrenNode_SpecialManage = chirldrenNode_SpecialManage;
	}

	public Button getchirldrenNode_NodeManage() {
		return chirldrenNode_NodeManage;
	}

	public void setchirldrenNode_NodeManage(Button chirldrenNode_NodeManage) {
		chirldrenNode_NodeManage = chirldrenNode_NodeManage;
	}

	public Button getchirldrenNode_TagManage() {
		return chirldrenNode_TagManage;
	}

	public void setchirldrenNode_TagManage(Button chirldrenNode_TagManage) {
		chirldrenNode_TagManage = chirldrenNode_TagManage;
	}

	public Button getchirldrenNode_ArticleTag() {
		return chirldrenNode_ArticleTag;
	}

	public void setchirldrenNode_ArticleTag(Button chirldrenNode_ArticleTag) {
		chirldrenNode_ArticleTag = chirldrenNode_ArticleTag;
	}

	public Button getchirldrenNode_PhotoTag() {
		return chirldrenNode_PhotoTag;
	}

	public void setchirldrenNode_PhotoTag(Button chirldrenNode_PhotoTag) {
		chirldrenNode_PhotoTag = chirldrenNode_PhotoTag;
	}

	public Button getchirldrenNode_SpecialTag() {
		return chirldrenNode_SpecialTag;
	}

	public void setchirldrenNode_SpecialTag(Button chirldrenNode_SpecialTag) {
		chirldrenNode_SpecialTag = chirldrenNode_SpecialTag;
	}

	public Button getchirldrenNode_PrivilegeManage() {
		return chirldrenNode_PrivilegeManage;
	}

	public void setchirldrenNode_PrivilegeManage(Button chirldrenNode_PrivilegeManage) {
		chirldrenNode_PrivilegeManage = chirldrenNode_PrivilegeManage;
	}

	public Button getchirldrenNode_NodePermissionSet() {
		return chirldrenNode_NodePermissionSet;
	}

	public void setchirldrenNode_NodePermissionSet(Button chirldrenNode_NodePermissionSet) {
		chirldrenNode_NodePermissionSet = chirldrenNode_NodePermissionSet;
	}

	public Button getchirldrenNode_BatchNodePermissionSetRelationConfig() {
		return chirldrenNode_BatchNodePermissionSetRelationConfig;
	}

	public void setchirldrenNode_BatchNodePermissionSetRelationConfig(Button chirldrenNode_BatchNodePermissionSetRelationConfig) {
		chirldrenNode_BatchNodePermissionSetRelationConfig = chirldrenNode_BatchNodePermissionSetRelationConfig;
	}

	public Button getchirldrenNode_AuditProcess() {
		return chirldrenNode_AuditProcess;
	}

	public void setchirldrenNode_AuditProcess(Button chirldrenNode_AuditProcess) {
		chirldrenNode_AuditProcess = chirldrenNode_AuditProcess;
	}

	public Button getchirldrenNode_FieldPermissionManage() {
		return chirldrenNode_FieldPermissionManage;
	}

	public void setchirldrenNode_FieldPermissionManage(Button chirldrenNode_FieldPermissionManage) {
		chirldrenNode_FieldPermissionManage = chirldrenNode_FieldPermissionManage;
	}

	public Button getchirldrenNode_DispatchDepartment() {
		return chirldrenNode_DispatchDepartment;
	}

	public void setchirldrenNode_DispatchDepartment(Button chirldrenNode_DispatchDepartment) {
		chirldrenNode_DispatchDepartment = chirldrenNode_DispatchDepartment;
	}

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

	public Button getParentNode_EngineeringConstructionField() {
		return parentNode_EngineeringConstructionField;
	}

	public void setParentNode_EngineeringConstructionField(Button parentNode_EngineeringConstructionField) {
		this.parentNode_EngineeringConstructionField = parentNode_EngineeringConstructionField;
	}

	public Button getChirldrenNode_ProjectinfoPublicity() {
		return chirldrenNode_ProjectinfoPublicity;
	}

	public void setChirldrenNode_ProjectinfoPublicity(Button chirldrenNode_ProjectinfoPublicity) {
		this.chirldrenNode_ProjectinfoPublicity = chirldrenNode_ProjectinfoPublicity;
	}

	public Button getChirldrenNode_ConstructionCompany() {
		return chirldrenNode_ConstructionCompany;
	}

	public void setChirldrenNode_ConstructionCompany(Button chirldrenNode_ConstructionCompany) {
		this.chirldrenNode_ConstructionCompany = chirldrenNode_ConstructionCompany;
	}

	public Button getChirldrenNode_Employee() {
		return chirldrenNode_Employee;
	}

	public void setChirldrenNode_Employee(Button chirldrenNode_Employee) {
		this.chirldrenNode_Employee = chirldrenNode_Employee;
	}

	public Button getChirldrenNode_LandRightsInformation() {
		return chirldrenNode_LandRightsInformation;
	}

	public void setChirldrenNode_LandRightsInformation(Button chirldrenNode_LandRightsInformation) {
		this.chirldrenNode_LandRightsInformation = chirldrenNode_LandRightsInformation;
	}

	public Button getChirldrenNode_MiningRightsInformation() {
		return chirldrenNode_MiningRightsInformation;
	}

	public void setChirldrenNode_MiningRightsInformation(Button chirldrenNode_MiningRightsInformation) {
		this.chirldrenNode_MiningRightsInformation = chirldrenNode_MiningRightsInformation;
	}

	public Button getChirldrenNode_EngineeringConstructionAllocation() {
		return chirldrenNode_EngineeringConstructionAllocation;
	}

	public void setChirldrenNode_EngineeringConstructionAllocation(Button chirldrenNode_EngineeringConstructionAllocation) {
		this.chirldrenNode_EngineeringConstructionAllocation = chirldrenNode_EngineeringConstructionAllocation;
	}

	public Button getChirldrenNode_CatalogManage() {
		return chirldrenNode_CatalogManage;
	}

	public void setChirldrenNode_CatalogManage(Button chirldrenNode_CatalogManage) {
		this.chirldrenNode_CatalogManage = chirldrenNode_CatalogManage;
	}

	public Button getChirldrenNode_ProjectinfoPublicityMold() {
		return chirldrenNode_ProjectinfoPublicityMold;
	}

	public void setChirldrenNode_ProjectinfoPublicityMold(Button chirldrenNode_ProjectinfoPublicityMold) {
		this.chirldrenNode_ProjectinfoPublicityMold = chirldrenNode_ProjectinfoPublicityMold;
	}

	public Button getChirldrenNode_ProjectinfoPublicityConfig() {
		return chirldrenNode_ProjectinfoPublicityConfig;
	}

	public void setChirldrenNode_ProjectinfoPublicityConfig(Button chirldrenNode_ProjectinfoPublicityConfig) {
		this.chirldrenNode_ProjectinfoPublicityConfig = chirldrenNode_ProjectinfoPublicityConfig;
	}

	public Button getParentNode_ConvenienceInformation() {
		return parentNode_ConvenienceInformation;
	}

	public void setParentNode_ConvenienceInformation(Button parentNode_ConvenienceInformation) {
		this.parentNode_ConvenienceInformation = parentNode_ConvenienceInformation;
	}

	public Button getChirldrenNode_LetterManage() {
		return chirldrenNode_LetterManage;
	}

	public void setChirldrenNode_LetterManage(Button chirldrenNode_LetterManage) {
		this.chirldrenNode_LetterManage = chirldrenNode_LetterManage;
	}

	public Button getChirldrenNode_LetterCategory() {
		return chirldrenNode_LetterCategory;
	}

	public void setChirldrenNode_LetterCategory(Button chirldrenNode_LetterCategory) {
		this.chirldrenNode_LetterCategory = chirldrenNode_LetterCategory;
	}

	public Button getParentNode_LetterComment() {
		return parentNode_LetterComment;
	}

	public void setParentNode_LetterComment(Button parentNode_LetterComment) {
		this.parentNode_LetterComment = parentNode_LetterComment;
	}

	public Button getChirldrenNode_SiteLetterboxConfig() {
		return chirldrenNode_SiteLetterboxConfig;
	}

	public void setChirldrenNode_SiteLetterboxConfig(Button chirldrenNode_SiteLetterboxConfig) {
		this.chirldrenNode_SiteLetterboxConfig = chirldrenNode_SiteLetterboxConfig;
	}

	public Button getParentNode_PetitionManagement() {
		return parentNode_PetitionManagement;
	}

	public void setParentNode_PetitionManagement(Button parentNode_PetitionManagement) {
		this.parentNode_PetitionManagement = parentNode_PetitionManagement;
	}

	public Button getChirldrenNode_PetitionLetter() {
		return chirldrenNode_PetitionLetter;
	}

	public void setChirldrenNode_PetitionLetter(Button chirldrenNode_PetitionLetter) {
		this.chirldrenNode_PetitionLetter = chirldrenNode_PetitionLetter;
	}

	public Button getChirldrenNode_LeaderLetter() {
		return chirldrenNode_LeaderLetter;
	}

	public void setChirldrenNode_LeaderLetter(Button chirldrenNode_LeaderLetter) {
		this.chirldrenNode_LeaderLetter = chirldrenNode_LeaderLetter;
	}

	public Button getParentNode_DdepartmentLetter() {
		return parentNode_DdepartmentLetter;
	}

	public void setParentNode_DdepartmentLetter(Button parentNode_DdepartmentLetter) {
		this.parentNode_DdepartmentLetter = parentNode_DdepartmentLetter;
	}

	public Button getChirldrenNode_SetDdepartmentManager() {
		return chirldrenNode_SetDdepartmentManager;
	}

	public void setChirldrenNode_SetDdepartmentManager(Button chirldrenNode_SetDdepartmentManager) {
		this.chirldrenNode_SetDdepartmentManager = chirldrenNode_SetDdepartmentManager;
	}

	public Button getParentNode_OnlineInterview() {
		return parentNode_OnlineInterview;
	}

	public void setParentNode_OnlineInterview(Button parentNode_OnlineInterview) {
		this.parentNode_OnlineInterview = parentNode_OnlineInterview;
	}

	public Button getChirldrenNode_InterviewManage() {
		return chirldrenNode_InterviewManage;
	}

	public void setChirldrenNode_InterviewManage(Button chirldrenNode_InterviewManage) {
		this.chirldrenNode_InterviewManage = chirldrenNode_InterviewManage;
	}

	public Button getChirldrenNode_RelatedContentCategory() {
		return chirldrenNode_RelatedContentCategory;
	}

	public void setChirldrenNode_RelatedContentCategory(Button chirldrenNode_RelatedContentCategory) {
		this.chirldrenNode_RelatedContentCategory = chirldrenNode_RelatedContentCategory;
	}

	public Button getChirldrenNode_OnlineinterViewConfig() {
		return chirldrenNode_OnlineinterViewConfig;
	}

	public void setChirldrenNode_OnlineinterViewConfig(Button chirldrenNode_OnlineinterViewConfig) {
		this.chirldrenNode_OnlineinterViewConfig = chirldrenNode_OnlineinterViewConfig;
	}

	public Button getParentNode_OnlineService() {
		return parentNode_OnlineService;
	}

	public void setParentNode_OnlineService(Button parentNode_OnlineService) {
		this.parentNode_OnlineService = parentNode_OnlineService;
	}

	public Button getChirldrenNode_ServiceitemManage() {
		return chirldrenNode_ServiceitemManage;
	}

	public void setChirldrenNode_ServiceitemManage(Button chirldrenNode_ServiceitemManage) {
		this.chirldrenNode_ServiceitemManage = chirldrenNode_ServiceitemManage;
	}

	public Button getChirldrenNode_WorkWindow() {
		return chirldrenNode_WorkWindow;
	}

	public void setChirldrenNode_WorkWindow(Button chirldrenNode_WorkWindow) {
		this.chirldrenNode_WorkWindow = chirldrenNode_WorkWindow;
	}

	public Button getChirldrenNode_ServicehallDepartment() {
		return chirldrenNode_ServicehallDepartment;
	}

	public void setChirldrenNode_ServicehallDepartment(Button chirldrenNode_ServicehallDepartment) {
		this.chirldrenNode_ServicehallDepartment = chirldrenNode_ServicehallDepartment;
	}

	public Button getChirldrenNode_ServicehallTopic() {
		return chirldrenNode_ServicehallTopic;
	}

	public void setChirldrenNode_ServicehallTopic(Button chirldrenNode_ServicehallTopic) {
		this.chirldrenNode_ServicehallTopic = chirldrenNode_ServicehallTopic;
	}

	public Button getChirldrenNode_AdministrativeDivision() {
		return chirldrenNode_AdministrativeDivision;
	}

	public void setChirldrenNode_AdministrativeDivision(Button chirldrenNode_AdministrativeDivision) {
		this.chirldrenNode_AdministrativeDivision = chirldrenNode_AdministrativeDivision;
	}

	public Button getChirldrenNode_servicehallconfig() {
		return chirldrenNode_servicehallconfig;
	}

	public void setChirldrenNode_servicehallconfig(Button chirldrenNode_servicehallconfig) {
		this.chirldrenNode_servicehallconfig = chirldrenNode_servicehallconfig;
	}

	public Button getParentNode_CustomForm() {
		return parentNode_CustomForm;
	}

	public void setParentNode_CustomForm(Button parentNode_CustomForm) {
		this.parentNode_CustomForm = parentNode_CustomForm;
	}

	public Button getChirldrenNode_FormManage() {
		return chirldrenNode_FormManage;
	}

	public void setChirldrenNode_FormManage(Button chirldrenNode_FormManage) {
		this.chirldrenNode_FormManage = chirldrenNode_FormManage;
	}

	public Button getChirldrenNode_FormCategory() {
		return chirldrenNode_FormCategory;
	}

	public void setChirldrenNode_FormCategory(Button chirldrenNode_FormCategory) {
		this.chirldrenNode_FormCategory = chirldrenNode_FormCategory;
	}

	public Button getChirldrenNode_SiteCustomformConfig() {
		return chirldrenNode_SiteCustomformConfig;
	}

	public void setChirldrenNode_SiteCustomformConfig(Button chirldrenNode_SiteCustomformConfig) {
		this.chirldrenNode_SiteCustomformConfig = chirldrenNode_SiteCustomformConfig;
	}

	public Button getParentNode_Advertising() {
		return parentNode_Advertising;
	}

	public void setParentNode_Advertising(Button parentNode_Advertising) {
		this.parentNode_Advertising = parentNode_Advertising;
	}

	public Button getChirldrenNode_AdvertisementSpace() {
		return chirldrenNode_AdvertisementSpace;
	}

	public void setChirldrenNode_AdvertisementSpace(Button chirldrenNode_AdvertisementSpace) {
		this.chirldrenNode_AdvertisementSpace = chirldrenNode_AdvertisementSpace;
	}

	public Button getChirldrenNode_Advertisement() {
		return chirldrenNode_Advertisement;
	}

	public void setChirldrenNode_Advertisement(Button chirldrenNode_Advertisement) {
		this.chirldrenNode_Advertisement = chirldrenNode_Advertisement;
	}

	public Button getParentNode_Survey() {
		return parentNode_Survey;
	}

	public void setParentNode_Survey(Button parentNode_Survey) {
		this.parentNode_Survey = parentNode_Survey;
	}

	public Button getChirldrenNode_QuestionnaireManage() {
		return chirldrenNode_QuestionnaireManage;
	}

	public void setChirldrenNode_QuestionnaireManage(Button chirldrenNode_QuestionnaireManage) {
		this.chirldrenNode_QuestionnaireManage = chirldrenNode_QuestionnaireManage;
	}

	public Button getChirldrenNode_QuestionnaireTemplateConfig() {
		return chirldrenNode_QuestionnaireTemplateConfig;
	}

	public void setChirldrenNode_QuestionnaireTemplateConfig(Button chirldrenNode_QuestionnaireTemplateConfig) {
		this.chirldrenNode_QuestionnaireTemplateConfig = chirldrenNode_QuestionnaireTemplateConfig;
	}

	public Button getParentNode_Voting() {
		return parentNode_Voting;
	}

	public void setParentNode_Voting(Button parentNode_Voting) {
		this.parentNode_Voting = parentNode_Voting;
	}

	public Button getChirldrenNode_VoteManage() {
		return chirldrenNode_VoteManage;
	}

	public void setChirldrenNode_VoteManage(Button chirldrenNode_VoteManage) {
		this.chirldrenNode_VoteManage = chirldrenNode_VoteManage;
	}

	public Button getChirldrenNode_VoteTemplateConfig() {
		return chirldrenNode_VoteTemplateConfig;
	}

	public void setChirldrenNode_VoteTemplateConfig(Button chirldrenNode_VoteTemplateConfig) {
		this.chirldrenNode_VoteTemplateConfig = chirldrenNode_VoteTemplateConfig;
	}

	public Button getParentNode_WeChatManagement() {
		return parentNode_WeChatManagement;
	}

	public void setParentNode_WeChatManagement(Button parentNode_WeChatManagement) {
		this.parentNode_WeChatManagement = parentNode_WeChatManagement;
	}

	public Button getChirldrenNode_MssSendMessage() {
		return chirldrenNode_MssSendMessage;
	}

	public void setChirldrenNode_MssSendMessage(Button chirldrenNode_MssSendMessage) {
		this.chirldrenNode_MssSendMessage = chirldrenNode_MssSendMessage;
	}

	public Button getChirldrenNode_CustommenuManage() {
		return chirldrenNode_CustommenuManage;
	}

	public void setChirldrenNode_CustommenuManage(Button chirldrenNode_CustommenuManage) {
		this.chirldrenNode_CustommenuManage = chirldrenNode_CustommenuManage;
	}

	public Button getChirldrenNode_MaterialManagement() {
		return chirldrenNode_MaterialManagement;
	}

	public void setChirldrenNode_MaterialManagement(Button chirldrenNode_MaterialManagement) {
		this.chirldrenNode_MaterialManagement = chirldrenNode_MaterialManagement;
	}

	public Button getChirldrenNode_NewsSetMaterial() {
		return chirldrenNode_NewsSetMaterial;
	}

	public void setChirldrenNode_NewsSetMaterial(Button chirldrenNode_NewsSetMaterial) {
		this.chirldrenNode_NewsSetMaterial = chirldrenNode_NewsSetMaterial;
	}

	public Button getChirldrenNode_PhotoMaterial() {
		return chirldrenNode_PhotoMaterial;
	}

	public void setChirldrenNode_PhotoMaterial(Button chirldrenNode_PhotoMaterial) {
		this.chirldrenNode_PhotoMaterial = chirldrenNode_PhotoMaterial;
	}

	public Button getChirldrenNode_FanManage() {
		return chirldrenNode_FanManage;
	}

	public void setChirldrenNode_FanManage(Button chirldrenNode_FanManage) {
		this.chirldrenNode_FanManage = chirldrenNode_FanManage;
	}

	public Button getChirldrenNode_PublicaccountManage() {
		return chirldrenNode_PublicaccountManage;
	}

	public void setChirldrenNode_PublicaccountManage(Button chirldrenNode_PublicaccountManage) {
		this.chirldrenNode_PublicaccountManage = chirldrenNode_PublicaccountManage;
	}

	public Button getParentNode_FullTextSearch() {
		return parentNode_FullTextSearch;
	}

	public void setParentNode_FullTextSearch(Button parentNode_FullTextSearch) {
		this.parentNode_FullTextSearch = parentNode_FullTextSearch;
	}

	public Button getChirldrenNode_searchItem() {
		return chirldrenNode_searchItem;
	}

	public void setChirldrenNode_searchItem(Button chirldrenNode_searchItem) {
		this.chirldrenNode_searchItem = chirldrenNode_searchItem;
	}

	public Button getChirldrenNode_ModifyConfig() {
		return chirldrenNode_ModifyConfig;
	}

	public void setChirldrenNode_ModifyConfig(Button chirldrenNode_ModifyConfig) {
		this.chirldrenNode_ModifyConfig = chirldrenNode_ModifyConfig;
	}

	public Button getParentNode_DataCenter() {
		return parentNode_DataCenter;
	}

	public void setParentNode_DataCenter(Button parentNode_DataCenter) {
		this.parentNode_DataCenter = parentNode_DataCenter;
	}

	public Button getChirldrenNode_DataCenterHome() {
		return chirldrenNode_DataCenterHome;
	}

	public void setChirldrenNode_DataCenterHome(Button chirldrenNode_DataCenterHome) {
		this.chirldrenNode_DataCenterHome = chirldrenNode_DataCenterHome;
	}

	public Button getParentNode_DataCollection() {
		return parentNode_DataCollection;
	}

	public void setParentNode_DataCollection(Button parentNode_DataCollection) {
		this.parentNode_DataCollection = parentNode_DataCollection;
	}

	public Button getChirldrenNode_CollectionItem() {
		return chirldrenNode_CollectionItem;
	}

	public void setChirldrenNode_CollectionItem(Button chirldrenNode_CollectionItem) {
		this.chirldrenNode_CollectionItem = chirldrenNode_CollectionItem;
	}

	public Button getParentNode_FileManage() {
		return parentNode_FileManage;
	}

	public void setParentNode_FileManage(Button parentNode_FileManage) {
		this.parentNode_FileManage = parentNode_FileManage;
	}

	public Button getChirldrenNode_SiteViewFile() {
		return chirldrenNode_SiteViewFile;
	}

	public void setChirldrenNode_SiteViewFile(Button chirldrenNode_SiteViewFile) {
		this.chirldrenNode_SiteViewFile = chirldrenNode_SiteViewFile;
	}

	public Button getChirldrenNode_SiteStyleFile() {
		return chirldrenNode_SiteStyleFile;
	}

	public void setChirldrenNode_SiteStyleFile(Button chirldrenNode_SiteStyleFile) {
		this.chirldrenNode_SiteStyleFile = chirldrenNode_SiteStyleFile;
	}

	public Button getParentNode_SiteAdministratorManage() {
		return parentNode_SiteAdministratorManage;
	}

	public void setParentNode_SiteAdministratorManage(Button parentNode_SiteAdministratorManage) {
		this.parentNode_SiteAdministratorManage = parentNode_SiteAdministratorManage;
	}

	public Button getChirldrenNode_SiteAdministrator() {
		return chirldrenNode_SiteAdministrator;
	}

	public void setChirldrenNode_SiteAdministrator(Button chirldrenNode_SiteAdministrator) {
		this.chirldrenNode_SiteAdministrator = chirldrenNode_SiteAdministrator;
	}

	public Button getChirldrenNode_SiteAdministratorGroup() {
		return chirldrenNode_SiteAdministratorGroup;
	}

	public void setChirldrenNode_SiteAdministratorGroup(Button chirldrenNode_SiteAdministratorGroup) {
		this.chirldrenNode_SiteAdministratorGroup = chirldrenNode_SiteAdministratorGroup;
	}

	public Button getChirldrenNode_SitePermissionset() {
		return chirldrenNode_SitePermissionset;
	}

	public void setChirldrenNode_SitePermissionset(Button chirldrenNode_SitePermissionset) {
		this.chirldrenNode_SitePermissionset = chirldrenNode_SitePermissionset;
	}

	public Button getParentNode_SiteManage() {
		return parentNode_SiteManage;
	}

	public void setParentNode_SiteManage(Button parentNode_SiteManage) {
		this.parentNode_SiteManage = parentNode_SiteManage;
	}

	public Button getChirldrenNode_SiteSetting() {
		return chirldrenNode_SiteSetting;
	}

	public void setChirldrenNode_SiteSetting(Button chirldrenNode_SiteSetting) {
		this.chirldrenNode_SiteSetting = chirldrenNode_SiteSetting;
	}

	public Button getChirldrenNode_SiteSettingSetIpLimit() {
		return chirldrenNode_SiteSettingSetIpLimit;
	}

	public void setChirldrenNode_SiteSettingSetIpLimit(Button chirldrenNode_SiteSettingSetIpLimit) {
		this.chirldrenNode_SiteSettingSetIpLimit = chirldrenNode_SiteSettingSetIpLimit;
	}
}
