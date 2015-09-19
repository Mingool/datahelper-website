package edu.hebut.dh.action;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.hebut.dh.domain.Message;
import edu.hebut.dh.domain.User;
import edu.hebut.dh.service.DeveloperService;
import edu.hebut.dh.service.impl.DeveloperServiceImpl;

public class LeaveMessageAction extends ActionSupport implements Serializable {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	DeveloperService service = new DeveloperServiceImpl();
	
	/**
	 * 处理用户留言,在此之前，XML对表单进行了校验
	 */
	@Override
	public String execute() throws Exception {
		User user = (User) ActionContext.getContext().getSession().get("user");
		if(user==null)
			return ERROR;
		Message msg = new Message();
		msg.setContent(this.content);
		service.leaveMessage(user, msg);
		ActionContext.getContext().put("message", "留言成功!");
		return SUCCESS;
	}
}
