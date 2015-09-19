package edu.hebut.dh.service;

import edu.hebut.dh.domain.User;
import edu.hebut.dh.exception.UserExistsException;

public interface NormalService {
	
	/**
	 * 处理用户注册
	 * @param user
	 * @return
	 * @throws UserExistsException 
	 */
	User regist(User user) throws UserExistsException;
}
