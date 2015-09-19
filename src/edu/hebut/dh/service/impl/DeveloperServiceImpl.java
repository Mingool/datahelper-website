package edu.hebut.dh.service.impl;

import java.sql.SQLException;
import java.util.Date;
import java.util.UUID;

import edu.hebut.dh.dao.ConnectionDao;
import edu.hebut.dh.dao.MessageDao;
import edu.hebut.dh.dao.UserDBDao;
import edu.hebut.dh.dao.UserDao;
import edu.hebut.dh.dao.impl.ConnectionDaoImpl;
import edu.hebut.dh.dao.impl.MessageDaoImpl;
import edu.hebut.dh.dao.impl.UserDBDaoImpl;
import edu.hebut.dh.dao.impl.UserDaoImpl;
import edu.hebut.dh.domain.Message;
import edu.hebut.dh.domain.User;
import edu.hebut.dh.domain.UserDB;
import edu.hebut.dh.service.DeveloperService;
import edu.hebut.dh.utils.DBCPUtils;
import edu.hebut.dh.utils.StringUtils;

public class DeveloperServiceImpl implements DeveloperService {

	private UserDao userdao = new UserDaoImpl();
	private UserDBDao userdbdao = new UserDBDaoImpl();
	private ConnectionDao conndao = new ConnectionDaoImpl();
	private MessageDao messagedao = new MessageDaoImpl();

	/**
	 * 处理用户登录
	 */
	@Override
	public User login(String username, String password) {
		User user = userdao.findUserByUsername(username);
		if (user == null)
			return null;
		if (!user.getPassword().equals(password))
			return null;
		UserDB userdb = userdbdao.findUserDBByUserId(user.getId());
		user.setUserdb(userdb);
		return user;
	}

	/**
	 * 处理用户申请Token
	 */
	@Override
	public User getToken(User user) {
		String token = StringUtils.getRandomString(15);
		user.setToken(token);
		try {
			userdao.updateUserById(user);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return user;
	}

	/**
	 * 动态的为用户创建数据库
	 */
	@Override
	public User createUserDB(String userid, UserDB userdb) {
		userdb.setId(UUID.randomUUID().toString());
		userdb.setTime(new Date(System.currentTimeMillis()));
		DBCPUtils.startThreadLocalConnTransaction();
		try {
			userdbdao.addUserDB(userdb);
			userdbdao.createMySQLDB(userdb.getName(), userdb.getUsername(),
					userdb.getPassword());
		} catch (SQLException e) {
			e.printStackTrace();
			DBCPUtils.rollbackThreadLocalConn();
			return null;
		} finally {
			DBCPUtils.commitThreadLocalConn();
			DBCPUtils.releaseThreadLocalConn();
		}
		userdb.getUserinfo().setUserdb(userdb);
		return userdb.getUserinfo();
	}

	/**
	 * 在线执行SQL语句
	 * 
	 * @throws SQLException
	 */
	@Override
	public boolean executeSQL(String dbname, String sql) throws SQLException {
		DBCPUtils.startThreadLocalConnTransaction();
		try {
			conndao.startChangeDataBase(dbname);
			return conndao.executeSQL(dbname, sql);
		} catch (SQLException e) {
			DBCPUtils.rollbackThreadLocalConn();
			throw new SQLException(e);
		} finally {
			try {
				conndao.engChangeDataBase();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			DBCPUtils.commitThreadLocalConn();
			DBCPUtils.releaseThreadLocalConn();
		}
	}

	/**
	 * 处理用户留言
	 */
	@Override
	public void leaveMessage(User user, Message message) {
		DBCPUtils.startThreadLocalConnTransaction();
		message.setUser(user);
		message.setId(UUID.randomUUID().toString());
		message.setTime(new Date(System.currentTimeMillis()));
		try {
			messagedao.addMessage(message);
		} catch (SQLException e) {
			e.printStackTrace();
			DBCPUtils.rollbackThreadLocalConn();
		} finally {
			DBCPUtils.commitThreadLocalConn();
			DBCPUtils.releaseThreadLocalConn();
		}
	}
}
