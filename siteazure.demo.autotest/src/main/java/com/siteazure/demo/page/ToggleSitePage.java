package com.siteazure.demo.page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.suren.autotest.web.framework.core.ui.Button;
import org.suren.autotest.web.framework.page.Page;

/**
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
public class ToggleSitePage extends Page{
	
	 @Autowired
	 private Button ToggleButton;//切换按钮
	 @Autowired
     private Button Platform_Site;//站点_平台管理
	 @Autowired
     private Button Main_Site;//站点_默认主站
	 @Autowired
     private Button Hbj_Site;//站点_环保局
	 @Autowired
     private Button Lhz_Site;//站点_兰花镇
	 @Autowired
     private Button Xf_Site;//站点_信访局
	 @Autowired
     private Button Kj_Site;//站点_科技局
	 
	 
	public Button getPlatform_Site() {
		return Platform_Site;
	}
	public void setPlatform_Site(Button platform_Site) {
		Platform_Site = platform_Site;
	}
	public Button getMain_Site() {
		return Main_Site;
	}
	public void setMain_Site(Button main_Site) {
		Main_Site = main_Site;
	}
	public Button getHbj_Site() {
		return Hbj_Site;
	}
	public void setHbj_Site(Button hbj_Site) {
		Hbj_Site = hbj_Site;
	}
	public Button getLhz_Site() {
		return Lhz_Site;
	}
	public void setLhz_Site(Button lhz_Site) {
		Lhz_Site = lhz_Site;
	}
	public Button getXf_Site() {
		return Xf_Site;
	}
	public void setXf_Site(Button xf_Site) {
		Xf_Site = xf_Site;
	}
	public Button getKj_Site() {
		return Kj_Site;
	}
	public void setKj_Site(Button kj_Site) {
		Kj_Site = kj_Site;
	}
	public Button getToggleButton() {
		return ToggleButton;
	}
	public void setToggleButton(Button toggleButton) {
		ToggleButton = toggleButton;
	}
	
	
}
