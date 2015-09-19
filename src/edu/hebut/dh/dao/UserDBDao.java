package edu.hebut.dh.dao;

import java.sql.SQLException;

import edu.hebut.dh.domain.UserDB;

public interface UserDBDao {
	
	/**
	 * 通过User的id查找UserDB,如果没有则返回null
	 * @return
	 */
	UserDB findUserDBByUserId(String userid);
	
	/**
	 * 添加一个UserDB
	 * @param userdb
	 * @throws SQLException 
	 */
	void addUserDB(UserDB userdb) throws SQLException;
	
	/**
	 * 通过User的id删除UserDB
	 * @param userid
	 * @throws SQLException 
	 */
	void deleteUserDBByUserId(String userid) throws SQLException;
	
	/**
	 * 在MySQL中创建新的库，并且分配权限给用户
	 * @param dbname
	 * @param dbusername
	 * @param dbpassword
	 * @throws SQLException 
	 */
	void createMySQLDB(String dbname , String dbusername , String dbpassword) throws SQLException;
}
