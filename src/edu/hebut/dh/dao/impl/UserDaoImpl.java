package edu.hebut.dh.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import edu.hebut.dh.dao.UserDao;
import edu.hebut.dh.domain.User;
import edu.hebut.dh.utils.DBCPUtils;

public class UserDaoImpl implements UserDao {

	private QueryRunner qr = new QueryRunner(DBCPUtils.getDataSource());

	/**
	 * 通过User的Username查找用户
	 */
	@Override
	public User findUserByUsername(String username) {
		User user = null;
		try {
			user = qr
					.query("SELECT id,username,password,nickname,email,telephone,create_time AS time,token FROM user_info where username=?",
							new BeanHandler<User>(User.class), username);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return user;
	}

	/**
	 * 通过User的id查找用户
	 */
	@Override
	public User findUserById(String userid) {
		User user = null;
		try {
			user = qr
					.query("SELECT id,username,password,nickname,email,telephone,create_time AS time,token FROM user_info where id=?",
							new BeanHandler<User>(User.class), userid);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return user;
	}
	
	/**
	 * 通过User的Token查找User并返回,如果没有则返回null
	 */
	@Override
	public User findUserByToken(String token) {
		User user = null;
		try {
			user = qr
					.query("SELECT id,username,password,nickname,email,telephone,create_time AS time,token FROM user_info where token=?",
							new BeanHandler<User>(User.class), token);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return user;
	}

	/**
	 * 更新User,通过User的id找到User
	 * 
	 * @throws SQLException
	 */
	@Override
	public void updateUserById(User user) throws SQLException {
		qr.update(
				DBCPUtils.getThreadLocalConnection(),
				"UPDATE user_info SET password=?,nickname=?,email=?,telephone=?,token=? WHERE id=?",
				user.getPassword(), user.getNickname(), user.getEmail(),
				user.getTelephone(), user.getToken(),user.getId());

	}

	/**
	 * 新增一个User
	 * 
	 * @throws SQLException
	 */
	@Override
	public void addUser(User user) throws SQLException {
		qr.update(
				DBCPUtils.getThreadLocalConnection(),
				"INSERT INTO user_info (id,username,password,nickname,email,telephone,create_time,token) VALUES (?,?,?,?,?,?,?,?)",
				user.getId(), user.getUsername(), user.getPassword(),
				user.getNickname(), user.getEmail(), user.getTelephone(),
				user.getTime(), user.getToken());
	}

	/**
	 * 删除User,通过User的ID找到User
	 * 
	 * @throws SQLException
	 */
	@Override
	public void deleteUserById(String userid) throws SQLException {
		qr.update(DBCPUtils.getThreadLocalConnection(),"DELETE FROM user_info WHERE id=?", userid);
	}
	
}
