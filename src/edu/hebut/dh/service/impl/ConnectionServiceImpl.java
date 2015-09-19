package edu.hebut.dh.service.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import edu.hebut.dh.dao.ConnectionDao;
import edu.hebut.dh.dao.UserDBDao;
import edu.hebut.dh.dao.UserDao;
import edu.hebut.dh.dao.impl.ConnectionDaoImpl;
import edu.hebut.dh.dao.impl.UserDBDaoImpl;
import edu.hebut.dh.dao.impl.UserDaoImpl;
import edu.hebut.dh.domain.User;
import edu.hebut.dh.domain.UserDB;
import edu.hebut.dh.service.ConnectionService;
import edu.hebut.dh.utils.DBCPUtils;
import edu.hebut.dh.utils.JSONUtils;

public class ConnectionServiceImpl implements ConnectionService {

	private UserDao userdao = new UserDaoImpl();
	private UserDBDao userdbdao = new UserDBDaoImpl();
	private ConnectionDao conndao = new ConnectionDaoImpl();

	/**
	 * SDK query接口
	 */
	@Override
	public String querySQL(String token, String sql) {
		User user = userdao.findUserByToken(token);
		if (user == null)
			return null;
		UserDB userdb = userdbdao.findUserDBByUserId(user.getId());
		if (userdb == null)
			return null;
		/* start query */
		List<Map<String, Object>> list = null;
		DBCPUtils.startThreadLocalConnTransaction();
		try {
			conndao.startChangeDataBase(userdb.getName());
			list = conndao.query(userdb.getName(), sql);
		} catch (SQLException e) {
			DBCPUtils.rollbackThreadLocalConn();
		} finally {
			try {
				conndao.engChangeDataBase();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			DBCPUtils.commitThreadLocalConn();
			DBCPUtils.releaseThreadLocalConn();
		}
		if (list == null)
			return null;
		/*
		 * Now let's parse the List<Map<String,Object>> to Json String and
		 * return
		 */
		return JSONUtils.makeJson(list);
	}

	/**
	 * SDK update接口
	 */
	@Override
	public int updateSQL(String token, String sql) {
		User user = userdao.findUserByToken(token);
		if (user == null)
			return -1;
		UserDB userdb = userdbdao.findUserDBByUserId(user.getId());
		if (userdb == null)
			return -1;
		/* start query */
		int result = -1;
		DBCPUtils.startThreadLocalConnTransaction();
		try {
			conndao.startChangeDataBase(userdb.getName());
			result = conndao.update(userdb.getName(), sql);
		} catch (SQLException e) {
			DBCPUtils.rollbackThreadLocalConn();
		} finally {
			try {
				conndao.engChangeDataBase();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			DBCPUtils.commitThreadLocalConn();
			DBCPUtils.releaseThreadLocalConn();
		}
		return result;
	}
}
