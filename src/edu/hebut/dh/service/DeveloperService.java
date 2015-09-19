package edu.hebut.dh.service;

import java.sql.SQLException;

import edu.hebut.dh.domain.Message;
import edu.hebut.dh.domain.User;
import edu.hebut.dh.domain.UserDB;

public interface DeveloperService {
	
	/**
	 * �����û���¼
	 * @param username
	 * @param password
	 * @return
	 */
	User login(String username,String password);
	
	/**
	 * �����û��õ�Token
	 * @param user
	 * @return
	 */
	User getToken(User user);
	
	/**
	 * �����û���̬�������ݿ�
	 * @param userid
	 * @param userdb
	 * @return
	 */
	User createUserDB(String userid,UserDB userdb);
	
	/**
	 * ����ִ��SQL���
	 * @param sql
	 * @return
	 * @throws SQLException 
	 */
	boolean executeSQL(String dbname,String sql) throws SQLException;
	
	/**
	 * �����û�����
	 * @param user
	 * @param message
	 */
	void leaveMessage(User user,Message message);
}
