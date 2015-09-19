package edu.hebut.dh.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface ConnectionDao {

	/**
	 * 用户在线执行sql语句
	 * 
	 * @param sql
	 * @return
	 * @throws SQLException
	 */
	boolean executeSQL(String dbname, String sql) throws SQLException;

	/**
	 * SDK接口，用来执行query语句
	 * 
	 * @param dbname
	 * @param sql
	 * @return
	 * @throws SQLException
	 */
	List<Map<String, Object>> query(String dbname, String sql)
			throws SQLException;

	/**
	 * SDK接口，用来执行update语句
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
