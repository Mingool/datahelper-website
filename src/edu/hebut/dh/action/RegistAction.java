package edu.hebut.dh.action;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.BeanUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.hebut.dh.domain.User;
import edu.hebut.dh.exception.UserExistsException;
import edu.hebut.dh.service.NormalService;
import edu.hebut.dh.service.impl.NormalServiceImpl;

public class RegistAction extends ActionSupport implements Serializable {
	private String username;
	private String password;
	private String nickname;
	private String email;
	private String telephone;
	/* getting and setting method */
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	private NormalService service = new NormalServiceImpl();
	
	/**
	 * 处理用户注册需求,在此之前,已利用xml文件对表单数据进行校验
	 * @return
	 */
	public String regist(){
		User user = new User();
		try {
			BeanUtils.copyProperties(user, this);
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		
		try {
			user = service.regist(user);
		} catch (UserExistsException e) {
			addFieldError("message", "该用户名已经存在!");
			return INPUT;
		}
		if(user==null){
			//注册失败
			ActionContext.getContext().put("message", "Error:注册失败");
			return ERROR;
		}else{
			//注册成功
			ActionContext.getContext().put("message", "恭喜您,注册成功!");
			return SUCCESS;
		}
	}
}
