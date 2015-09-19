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
	 * �����û���¼���ڴ�֮ǰxml�Ѿ������ݽ�����У��
	 * @return
	 */
	public String login(){
		User user = service.login(username, password);
		if(user==null){
			//��¼ʧ��
			ActionContext.getContext().put("message", "�û�������������!");
			return INPUT;
		}else{
			//��¼�ɹ�
			ActionContext.getContext().getSession().put("user", user);
			return SUCCESS;
		}
	}
	
	/**
	 * �����û�ע����¼
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
