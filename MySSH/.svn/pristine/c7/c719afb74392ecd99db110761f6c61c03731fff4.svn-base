package cn.com.wanx.application.action;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.springframework.stereotype.Controller;

import cn.com.wanx.application.model.Authuser;
import cn.com.wanx.application.service.AuthuserService;
import cn.com.wanx.core.base.action.BaseAction;

@ParentPackage("struts-root")
@Namespace("/login")
@Controller("/login/LoginAction")
public class LoginAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	@Resource
	private AuthuserService authuserService;
	private String userName;
	private String password;
	private String randCode;
	private String checkResult;

	public String login() {

		return SUCCESS;
	}
	
	@Action(value = "checkuser", results = { @Result(name = SUCCESS, type = "json", params = {
			"root", "checkResult" }) })
	public String logincheck() {
		AjaxJson ajaxjson = new AjaxJson();
		if (!session.get("randCode").equals(randCode)) {
			ajaxjson.setSuccess(false);
			ajaxjson.setMsg("验证码不正确!");
			checkResult = ajaxjson.getJsonStr();
			return SUCCESS;
		}
		Authuser user = authuserService.getByUserName(userName);
		if (user == null) {
			ajaxjson.setSuccess(false);
			ajaxjson.setMsg("无此用户!");
			checkResult = ajaxjson.getJsonStr();
			return SUCCESS;
		}
		if (!user.getPassword().equals(password)) {
			ajaxjson.setSuccess(false);
			ajaxjson.setMsg("密码不正确!");
			checkResult = ajaxjson.getJsonStr();
			return SUCCESS;
		}
		checkResult = ajaxjson.getJsonStr();
		return SUCCESS;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRandCode() {
		return randCode;
	}

	public void setRandCode(String randCode) {
		this.randCode = randCode;
	}

	public String getCheckResult() {
		return checkResult;
	}

	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}
}
