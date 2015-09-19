package edu.hebut.dh.dao;

import java.sql.SQLException;

import edu.hebut.dh.domain.Message;

public interface MessageDao {
	
	/**
	 * ÃÌº”“ªÃı¡Ù—‘
	 * @param msg
	 * @throws SQLException 
	 */
	void addMessage(Message msg) throws SQLException;
}
