package cn.com.wanx.core.base.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 后台 base action
 * 
 * @author xietaijun
 */
public class BaseAction extends ActionSupport implements ServletContextAware,
		ServletResponseAware, ServletRequestAware, SessionAware,
		ApplicationAware {

	private static final long serialVersionUID = 1L;
	public final static Logger logger = LoggerFactory.getLogger(BaseAction.class);
	protected ServletContext servletContext;
	protected HttpServletRequest httpServletRequest;
	protected HttpServletResponse httpServletResponse;
	protected HttpSession httpSession;
	
	protected Map<String, Object> session;
	protected Map<String, Object> application;
	public static final String NOT_FOUND = "not_found";
	public String _;//不知道什么原因ajax提交后，参数里多了这个属性，防止STURTS2报错，所以定义该属性，没有任何业务意义

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.httpServletRequest = request;
		this.httpSession = request.getSession();
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.httpServletResponse = response;
	}

	@Override
	public void setServletContext(ServletContext context) {
		this.servletContext = context;
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

	public String get_() {
		return _;
	}

	public void set_(String _) {
		this._ = _;
	}
	

}
