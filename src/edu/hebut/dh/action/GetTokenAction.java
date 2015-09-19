package edu.hebut.dh.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.hebut.dh.domain.User;
import edu.hebut.dh.service.DeveloperService;
import edu.hebut.dh.service.impl.DeveloperServiceImpl;

public class GetTokenAction extends ActionSupport{
	
	private DeveloperService service = new DeveloperServiceImpl();
	
	/**
	 * Ϊ�û�����һ��Token
	 * @return
	 */
	public String getToken(){
		User user = (User) ActionContext.getContext().getSession().get("user");
		if(user.getToken()!=null ){
			return SUCCESS;
		}
		user = service.getToken(user);
		if(user==null){
			//���tokenʧ��
			return ERROR;
		}
		ActionContext.getContext().getSession().put("user", user);
		return SUCCESS;
	}
}
