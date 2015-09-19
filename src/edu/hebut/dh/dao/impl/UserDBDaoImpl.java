package edu.hebut.dh.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import edu.hebut.dh.dao.UserDBDao;
import edu.hebut.dh.domain.User;
import edu.hebut.dh.domain.UserDB;
import edu.hebut.dh.utils.DBCPUtils;

public class UserDBDaoImpl implements UserDBDao {

	private QueryRunner qr = new QueryRunner(DBCPUtils.getDataSource());

	/**
	 * 通过User的ID查找与之对应的UserDB
	 */
	@Override
	public UserDB findUserDBByUserId(String userid) {
		UserDB db = null;
		try {
			db = qr.query(
					"SELECT id , db_name AS name , db_username AS username ,db_password AS password ,create_time AS time FROM user_db where user_id=?",
					new BeanHandler<UserDB>(UserDB.class), userid);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return db;
	}

	/**
	 * 新增一个UserDB
	 * 
	 * @throws SQLException
	 */
	@Override
	public void addUserDB(UserDB userdb) throws SQLException {
		qr.update(
				DBCPUtils.getThreadLocalConnection(),
				"INSERT INTO user_db (id,db_name,db_username,db_password,create_time,user_id) VALUES (?,?,?,?,?,?)",
				userdb.getId(), userdb.getName(), userdb.getUsername(), userdb
						.getPassword(), userdb.getTime(), userdb.getUserinfo()
						.getId());
	}

	/**
	 * 通过User的ID删除与之对应的UserDB
	 * 
	 * @throws SQLException
	 */
	@Override
	public void deleteUserDBByUserId(String userid) throws SQLException {
		qr.update(DBCPUtils.getThreadLocalConnection(),
				"UPDATE FROM user_db WHERE user_id=?", userid);
	}

	/**
	 * 在MySQL中创建新的库，并且分配权限给用户
	 * 
	 * @throws SQLException
	 */
	@Override
	public void createMySQLDB(String dbname, String dbusername,
			String dbpassword) throws SQLException {
		/* create database */
		qr.update(DBCPUtils.getThreadLocalConnection(),
				"drop database if exists " + dbname);
		qr.update(DBCPUtils.getThreadLocalConnection(), "CREATE DATABASE "
				+ dbname
				+ " DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci");
		/* create database user */
		qr.update(DBCPUtils.getThreadLocalConnection(), "CREATE USER "
				+ dbusername + "@'%' IDENTIFIED BY '" + dbpassword + "';");
		qr.update("CREATE USER " + dbusername + "@'localhost' IDENTIFIED BY '"
				+ dbpassword + "';");
		/* deal with the permissions */
		qr.update(DBCPUtils.getThreadLocalConnection(), "GRANT ALL ON "
				+ dbname + ".* TO " + dbusername + "@'%' with grant option;");
		qr.update(DBCPUtils.getThreadLocalConnection(), "GRANT ALL ON "
				+ dbname + ".* TO " + dbusername
				+ "@'localhost' with grant option;");
		/* flush the sql language */
		qr.update(DBCPUtils.getThreadLocalConnection(), "flush privileges;");
	}
}
