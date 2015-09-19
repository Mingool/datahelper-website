package edu.hebut.dh.service.impl;

import java.sql.SQLException;
import java.util.Date;
import java.util.UUID;

import edu.hebut.dh.dao.UserDao;
import edu.hebut.dh.dao.impl.UserDaoImpl;
import edu.hebut.dh.domain.User;
import edu.hebut.dh.exception.UserExistsException;
import edu.hebut.dh.service.NormalService;

public class NormalServiceImpl implements NormalService{
	
	private UserDao userdao = new UserDaoImpl();
	
	/**
	 * 处理用户注册
	 * @throws UserExistsException 
	 */
	@Override
	public User regist(User user) throws UserExistsException {
		user.setId( UUID.randomUUID().toString() );
		user.setTime( new Date(System.currentTimeMillis()) );
		User u = userdao.findUserByUsername(user.getUsername());
		if(u!=null){
			throw new UserExistsException();
		}else{
			try {
				userdao.addUser(user);
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			return user;
		}
	}
}
