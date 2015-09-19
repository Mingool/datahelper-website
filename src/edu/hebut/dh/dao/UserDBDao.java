package edu.hebut.dh.dao;

import java.sql.SQLException;

import edu.hebut.dh.domain.UserDB;

public interface UserDBDao {
	
	/**
	 * ͨ��User��id����UserDB,���û���򷵻�null
	 * @return
	 */
	UserDB findUserDBByUserId(String userid);
	
	/**
	 * ���һ��UserDB
	 * @param userdb
	 * @throws SQLException 
	 */
	void addUserDB(UserDB userdb) throws SQLException;
	
	/**
	 * ͨ��User��idɾ��UserDB
	 * @param userid
	 * @throws SQLException 
	 */
	void deleteUserDBByUserId(String userid) throws SQLException;
	
	/**
	 * ��MySQL�д����µĿ⣬���ҷ���Ȩ�޸��û�
	 * @param dbname
	 * @param dbusername
	 * @param dbpassword
	 * @throws SQLException 
	 */
	void createMySQLDB(String dbname , String dbusername , String dbpassword) throws SQLException;
}
