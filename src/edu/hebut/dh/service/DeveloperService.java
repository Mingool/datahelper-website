package edu.hebut.dh.service;

import java.sql.SQLException;

import edu.hebut.dh.domain.Message;
import edu.hebut.dh.domain.User;
import edu.hebut.dh.domain.UserDB;

public interface DeveloperService {
	
	/**
	 * 处理用户登录
	 * @param username
	 * @param password
	 * @return
	 */
	User login(String username,String password);
	
	/**
	 * 处理用户得到Token
	 * @param user
	 * @return
	 */
	User getToken(User user);
	
	/**
	 * 处理用户动态创建数据库
	 * @param userid
	 * @param userdb
	 * @return
	 */
	User createUserDB(String userid,UserDB userdb);
	
	/**
	 * 在线执行SQL语句
	 * @param sql
	 * @return
	 * @throws SQLException 
	 */
	boolean executeSQL(String dbname,String sql) throws SQLException;
	
	/**
	 * 处理用户留言
	 * @param user
	 * @param message
	 */
	void leaveMessage(User user,Message message);
}
