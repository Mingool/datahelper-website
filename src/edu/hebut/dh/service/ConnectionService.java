package edu.hebut.dh.service;

public interface ConnectionService {
	
	
	/**
	 * SDK query�ӿ�
	 * @param token
	 * @param sql
	 * @return
	 */
	String querySQL(String token,String sql);
	
	/**
	 * SDK update�ӿ�
	 * @param token
	 * @param sql
	 * @return
	 */
	int updateSQL(String token,String sql);
}
