package edu.hebut.dh.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class DBCPUtils {
	
	private static DataSource ds;
	private static ThreadLocal<Connection> th = new ThreadLocal<Connection>();
	
	static{
		try{
			InputStream in = DBCPUtils.class.getClassLoader().getResourceAsStream("dbcp.properties");
			Properties prop = new Properties();
			prop.load(in);
			ds = BasicDataSourceFactory.createDataSource(prop);
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	/**
	 * ��������Դ
	 * @return
	 */
	public static DataSource getDataSource(){
		return ds;
	}
	
	/**
	 * �õ����̵߳�Connection
	 * @return
	 */
	public static Connection getThreadLocalConnection(){
		Connection conn = th.get();
		if(conn==null){
			try {
				conn = ds.getConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			th.set(conn);
		}
		return conn;
	}
	
	/**
	 * �������̵߳�Connection������
	 */
	public static void startThreadLocalConnTransaction(){
		Connection conn = th.get();
		if(conn==null)
			conn = getThreadLocalConnection();
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * �ع����̵߳�Connection������
	 */
	public static void rollbackThreadLocalConn(){
		Connection conn = th.get();
		if(conn==null)
			conn = getThreadLocalConnection();
		try {
			conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * �ύ���̵߳�Connection������
	 */
	public static void commitThreadLocalConn(){
		Connection conn = th.get();
		if(conn==null)
			conn = getThreadLocalConnection();
		try {
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * �ͷŸ��̵߳�Connection,ʹ��ص����ӳ�
	 */
	public static void releaseThreadLocalConn(){
		Connection conn = th.get();
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			th.remove();
		}
	}
}
