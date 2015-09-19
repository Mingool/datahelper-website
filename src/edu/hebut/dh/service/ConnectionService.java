package edu.hebut.dh.service;

public interface ConnectionService {
	
	
	/**
	 * SDK query接口
	 * @param token
	 * @param sql
	 * @return
	 */
	String querySQL(String token,String sql);
	
	/**
	 * SDK update接口
	 * @param token
	 * @param sql
	 * @return
	 */
	int updateSQL(String token,String sql);
}
