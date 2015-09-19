package edu.hebut.dh.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.hebut.dh.domain.User;

public class AccessCountAction extends ActionSupport {

	private String query_num;
	private String update_num;

	public String getQuery_num() {
		return query_num;
	}

	public void setQuery_num(String query_num) {
		this.query_num = query_num;
	}

	public String getUpdate_num() {
		return update_num;
	}

	public void setUpdate_num(String update_num) {
		this.update_num = update_num;
	}

	/**
	 * 处理统计用户接口访问信息
	 */
	@Override
	public String execute() throws Exception {
		User user = (User) ActionContext.getContext().getSession().get("user");
		if (user == null)
			return ERROR;
		/* get interface access num from application scope */
		String token = user.getToken();
		Integer count_query = (Integer) ActionContext.getContext()
				.getApplication().get(token + "_" + "count" + "_" + "query");
		Integer count_update = (Integer) ActionContext.getContext()
				.getApplication().get("token" + "_" + "count" + "_" + "update");
		/* ... */
		if (count_query == null)
			this.query_num = "0";
		else
			this.query_num = count_query + "";
		if (count_update == null)
			this.update_num = "0";
		else
			this.update_num = count_update + "";

		return SUCCESS;
	}
}
