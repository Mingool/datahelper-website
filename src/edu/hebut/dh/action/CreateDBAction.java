package edu.hebut.dh.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.hebut.dh.domain.User;
import edu.hebut.dh.domain.UserDB;
import edu.hebut.dh.service.DeveloperService;
import edu.hebut.dh.service.impl.DeveloperServiceImpl;

public class CreateDBAction extends ActionSupport {
	
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
	 * Ϊ�û��������ݿ�
	 * @return
	 */
	public String createDB(){
		User user = (User) ActionContext.getContext().getSession().get("user");
		UserDB userdb = new UserDB();
		userdb.setUsername(username);
		userdb.setPassword(password);
		userdb.setName( "db_" + user.getUsername() );
		userdb.setUserinfo(user);
		
		user = service.createUserDB(user.getId(), userdb);
		if(user==null){
			//ʧ����
			return ERROR;
		}
		return SUCCESS;
	}
}
