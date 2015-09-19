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
	 * ����ִ��SQL��䣬�ڴ�֮ǰ��xml�Ѽ��������. �����һ������� ResultSet �����򷵻�
	 * true�������һ������Ǹ��¼�������û�н�����򷵻� false
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
				ActionContext.getContext().put("message", "�벻Ҫִ�в�ѯ���");
			else
				ActionContext.getContext().put("message", "ִ�гɹ�!");
		} catch (SQLException e) {
			ActionContext.getContext().put("message", "ִ�д���.��������SQL���.");
		}
		return SUCCESS;
	}
}
