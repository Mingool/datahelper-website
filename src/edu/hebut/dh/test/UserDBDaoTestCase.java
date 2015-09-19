package edu.hebut.dh.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import edu.hebut.dh.dao.UserDBDao;
import edu.hebut.dh.dao.impl.UserDBDaoImpl;
import edu.hebut.dh.utils.DBCPUtils;

public class UserDBDaoTestCase {

	private UserDBDao userdbdao = new UserDBDaoImpl();

	@Test
	public void testFindUserDBByUserId() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddUserDB() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteUserDBByUserId() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateMySQLDB() {
		DBCPUtils.startThreadLocalConnTransaction();
		try {
			userdbdao.createMySQLDB("db_ttt", "hebut", "123");
			int i = 1 / 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ดํมห");
			DBCPUtils.rollbackThreadLocalConn();
		} finally {
			DBCPUtils.commitThreadLocalConn();
			DBCPUtils.releaseThreadLocalConn();
		}
	}

}
