package edu.hebut.dh.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;

import edu.hebut.dh.dao.ConnectionDao;
import edu.hebut.dh.utils.DBCPUtils;

public class ConnectionDaoImpl implements ConnectionDao {

	private final String XDATEHELP_DB_NAME = "xdatahelp";
	QueryRunner qr = new QueryRunner(DBCPUtils.getDataSource());

	/**
	 * 用户在线执行SQL语句
	 * 
	 * @throws SQLException
	 */
	@Override
	public boolean executeSQL(String dbname, String sql) throws SQLException {
		Connection conn = DBCPUtils.getThreadLocalConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		boolean flag = pstmt.execute(sql);
		return flag;
	}

	/**
	 * SDK接口，用来执行query语句
	 * 
	 * @throws SQLException
	 */
	@Override
	public List<Map<String, Object>> query(String dbname, String sql)
			throws SQLException {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		list = qr.query(DBCPUtils.getThreadLocalConnection(), sql,
				new ListMapHandler());
		return list;
	}

	/**
	 * SDK语句，用来执行update语句
	 * 
	 * @throws SQLException
	 */
	@Override
	public int update(String dbname, String sql) throws SQLException {
		return qr.update(DBCPUtils.getThreadLocalConnection(), sql);
	}

	/*********************************************************************************************/
	/**
	 * change db
	 * 
	 * @throws SQLException
	 */
	public void startChangeDataBase(String dbname) throws SQLException {
		qr.update(DBCPUtils.getThreadLocalConnection(), "use " + dbname + ";");
	}

	/**
	 * end change db
	 * 
	 * @throws SQLException
	 */
	public void engChangeDataBase() throws SQLException {
		qr.update(DBCPUtils.getThreadLocalConnection(), "use "
				+ XDATEHELP_DB_NAME + ";");
	}
}
