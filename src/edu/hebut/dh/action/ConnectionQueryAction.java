package edu.hebut.dh.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.hebut.dh.service.ConnectionService;
import edu.hebut.dh.service.impl.ConnectionServiceImpl;

public class ConnectionQueryAction extends ActionSupport {

	private String sql;
	private String token;

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	ConnectionService service = new ConnectionServiceImpl();

	/**
	 * SDK query interface,before this the XML has checked the from data.
	 */
	@Override
	public String execute() {
		/* add 1 to query count from application scope */
		Integer count = (Integer) ActionContext.getContext().getApplication()
				.get(this.token + "_" + "count" + "_" + "query");
		if (count == null)
			count = new Integer(0);
		count++;
		ActionContext.getContext().getApplication()
				.put(this.token + "_" + "count" + "_" + "query", count);

		/* get json string */
		String msg = service.querySQL(token, sql);
		System.out.println("msg=" + msg);
		/* write the json String to the PrintWriter */
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		try {
			PrintWriter out = response.getWriter();
			out.println(msg.trim());
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
}
