package edu.hebut.dh.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import edu.hebut.dh.dao.ConnectionDao;
import edu.hebut.dh.dao.impl.ConnectionDaoImpl;
import edu.hebut.dh.utils.DBCPUtils;

public class ConnectionDaoTestCase {

	private ConnectionDaoImpl dao = new ConnectionDaoImpl();

	@Test
	public void testExecuteSQL() {
		DBCPUtils.startThreadLocalConnTransaction();
		try {
			dao.startChangeDataBase("db_giraffe");
			
			//int res = dao.executeSQL("db_giraffe", "INSERT INTO apple (id,NAME) VALUES ('4','zhangsan4');");
			boolean res = dao.executeSQL("db_giraffe", "select * from apple");
			System.out.println("res="+res);
			
		} catch (SQLException e) {
			e.printStackTrace();
			DBCPUtils.rollbackThreadLocalConn();
		} finally {
			try {
				dao.engChangeDataBase();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			DBCPUtils.commitThreadLocalConn();
			DBCPUtils.releaseThreadLocalConn();
		}
	}

	@Test
	public void testQuery() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

}
