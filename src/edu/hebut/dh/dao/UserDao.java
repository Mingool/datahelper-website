package edu.hebut.dh.dao;

import java.sql.SQLException;

import edu.hebut.dh.domain.User;

public interface UserDao {
	
	/**
	 * ͨ��User��username����User������,���û���򷵻�null
	 * @param username
	 * @return
	 */
	User findUserByUsername(String username);
	
	/**
	 * ͨ��User��id����User������,���û���򷵻�null
	 * @param userid
	 * @return
	 */
	User findUserById(String userid);
	
	/**
	 * ͨ��User��Token����User������,���û���򷵻�null
	 * @param token
	 * @return
	 */
	User findUserByToken(String token);
	
	/**
	 * ͨ��User��id����UserȻ�����User��Ϣ
	 * @param user
	 * @throws SQLException 
	 */
	void updateUserById(User user) throws SQLException;
	
	/**
	 * ���һ��User
	 * @throws SQLException 
	 */
	void addUser(User user) throws SQLException;
	
	/**
	 * ͨ��User��idɾ��User
	 * @param userid
	 * @throws SQLException 
	 */
	void deleteUserById(String userid) throws SQLException;
}
