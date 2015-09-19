package edu.hebut.dh.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class PermissionInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {

	}

	/**
	 * 验证用户是否登录了
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Object obj = ActionContext.getContext().getSession().get("user");
		return obj == null ? "login" : invocation.invoke();
	}
}
