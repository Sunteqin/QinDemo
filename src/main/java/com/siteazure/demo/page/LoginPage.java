package com.siteazure.demo.page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.suren.autotest.web.framework.core.ui.Button;
import org.suren.autotest.web.framework.core.ui.Text;
import org.suren.autotest.web.framework.page.Page;
/**
 * 逻辑页面，包含页面中需要定位的元素信息</br>
 * Text是文本框、文本域</br>
 * Button是按钮，可以是a标签或者input标签类型为button的以及其他所有可以电机的元素</br>
 * Selector是下拉列表</br>
 * 类上必须加Component，属性上必须加Autowired注解</br>
 * 所有的属性必须添加对应的getter和setter方法</br>
 * 另外，框架提供了工具类用于根据baidu.xml来生成当前Page类的方法，具体请查看code工程
 * @author suren
 * @date 2016年12月13日 下午7:57:44
 */
@Component
public class LoginPage extends Page {

	@Autowired
	private Text LoginAdminName;
	@Autowired
	private Text LoginAdminPassword;
	@Autowired
	private Text SiteManageCode;
	@Autowired
	private Button submit;
	
	public Text getLoginAdminName() {
		return LoginAdminName;
	}
	public void setLoginAdminName(Text loginAdminName) {
		LoginAdminName = loginAdminName;
	}
	public Text getLoginAdminPassword() {
		return LoginAdminPassword;
	}
	public void setLoginAdminPassword(Text loginAdminPassword) {
		LoginAdminPassword = loginAdminPassword;
	}
	public Text getSiteManageCode() {
		return SiteManageCode;
	}
	public void setSiteManageCode(Text siteManageCode) {
		SiteManageCode = siteManageCode;
	}
	public Button getSubmit() {
		return submit;
	}
	public void setSubmit(Button submit) {
		this.submit = submit;
	}
	
	
	
}
