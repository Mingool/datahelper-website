package edu.hebut.dh.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.hebut.dh.domain.User;
import edu.hebut.dh.service.DeveloperService;
import edu.hebut.dh.service.impl.DeveloperServiceImpl;

public class LoginoutAction extends ActionSupport {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	private DeveloperService service = new DeveloperServiceImpl();
	
	/**
	 * 处理用户登录，在此之前xml已经对数据进行了校验
	 * @return
	 */
	public String login(){
		User user = service.login(username, password);
		if(user==null){
			//登录失败
			ActionContext.getContext().put("message", "用户名或密码有误!");
			return INPUT;
		}else{
			//登录成功
			ActionContext.getContext().getSession().put("user", user);
			return SUCCESS;
		}
	}
	
	/**
	 * 处理用户注销登录
	 * @return
	 */
	public String logout(){
		User user = (User) ActionContext.getContext().getSession().get("user");
		if(user!=null){
			ActionContext.getContext().getSession().remove(user);
		}
		return SUCCESS;
	}
}
