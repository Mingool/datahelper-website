package edu.hebut.dh.action;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.hebut.dh.domain.User;
import edu.hebut.dh.service.ConnectionService;
import edu.hebut.dh.service.DeveloperService;
import edu.hebut.dh.service.impl.ConnectionServiceImpl;
import edu.hebut.dh.service.impl.DeveloperServiceImpl;

public class ExecuteSQLAction extends ActionSupport {
	private String sql;

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	private DeveloperService service = new DeveloperServiceImpl();

	/**
	 * 在线执行SQL语句，在此之前，xml已检验表单数据. 如果第一个结果是 ResultSet 对象，则返回
	 * true；如果第一个结果是更新计数或者没有结果，则返回 false
	 */
	@Override
	public String execute() {
		User user = (User) ActionContext.getContext().getSession().get("user");
		if (user == null)
			return ERROR;
		if (user.getUserdb() == null)
			return ERROR;
		try {
			boolean flag = service.executeSQL(user.getUserdb().getName(), sql);
			if (flag)
				ActionContext.getContext().put("message", "请不要执行查询语句");
			else
				ActionContext.getContext().put("message", "执行成功!");
		} catch (SQLException e) {
			ActionContext.getContext().put("message", "执行错误.请检查您的SQL语句.");
		}
		return SUCCESS;
	}
}
