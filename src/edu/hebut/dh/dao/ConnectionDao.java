package edu.hebut.dh.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface ConnectionDao {

	/**
	 * �û�����ִ��sql���
	 * 
	 * @param sql
	 * @return
	 * @throws SQLException
	 */
	boolean executeSQL(String dbname, String sql) throws SQLException;

	/**
	 * SDK�ӿڣ�����ִ��query���
	 * 
	 * @param dbname
	 * @param sql
	 * @return
	 * @throws SQLException
	 */
	List<Map<String, Object>> query(String dbname, String sql)
			throws SQLException;

	/**
	 * SDK�ӿڣ�����ִ��update���
	 * 
	 * @param dbname
	 * @param sql
	 * @return
	 * @throws SQLException
	 */
	int update(String dbname, String sql) throws SQLException;

	/*********************************************************************************************/
	/**
	 * start change db
	 * 
	 * @param dbname
	 * @throws SQLException
	 */
	void startChangeDataBase(String dbname) throws SQLException;

	/**
	 * end change db;
	 * 
	 * @throws SQLException
	 */
	void engChangeDataBase() throws SQLException;
}
