package edu.hebut.dh.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import edu.hebut.dh.dao.MessageDao;
import edu.hebut.dh.domain.Message;
import edu.hebut.dh.utils.DBCPUtils;

public class MessageDaoImpl implements MessageDao {

	QueryRunner qr = new QueryRunner(DBCPUtils.getDataSource());

	/**
	 * 添加一个留言信息
	 * 
	 * @throws SQLException
	 */
	@Override
	public void addMessage(Message msg) throws SQLException {
		qr.update(
				DBCPUtils.getThreadLocalConnection(),
				"insert into user_message (id,content,time,user_id) values (?,?,?,?)",
				msg.getId(), msg.getContent(), msg.getTime(), msg.getUser()
						.getId());
	}
}
