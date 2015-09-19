package edu.hebut.dh.dao;

import java.sql.SQLException;

import edu.hebut.dh.domain.User;

public interface UserDao {
	
	/**
	 * 通过User的username查找User并返回,如果没有则返回null
	 * @param username
	 * @return
	 */
	User findUserByUsername(String username);
	
	/**
	 * 通过User的id查找User并返回,如果没有则返回null
	 * @param userid
	 * @return
	 */
	User findUserById(String userid);
	
	/**
	 * 通过User的Token查找User并返回,如果没有则返回null
	 * @param token
	 * @return
	 */
	User findUserByToken(String token);
	
	/**
	 * 通过User的id查找User然后更新User信息
	 * @param user
	 * @throws SQLException 
	 */
	void updateUserById(User user) throws SQLException;
	
	/**
	 * 添加一个User
	 * @throws SQLException 
	 */
	void addUser(User user) throws SQLException;
	
	/**
	 * 通过User的id删除User
	 * @param userid
	 * @throws SQLException 
	 */
	void deleteUserById(String userid) throws SQLException;
}
