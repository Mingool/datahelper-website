package edu.hebut.dh.test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.Date;

import org.junit.Test;

import edu.hebut.dh.dao.UserDao;
import edu.hebut.dh.dao.impl.UserDaoImpl;
import edu.hebut.dh.domain.User;

public class UserDaoTestCase {
	
	private UserDao dao = new UserDaoImpl();

	@Test
	public void testFindUserByUsername() {
		User user = dao.findUserByUsername("zhangsan");
		System.out.println(user);
	}

	@Test
	public void testFindUserById() {
		User user = dao.findUserById("1");
		System.out.println(user);
	}

	@Test
	public void testUpdateUserById() throws SQLException {
		User user = new User();
		user.setId("1");
		user.setUsername("zhangsan");
		user.setPassword("1234555");
		user.setNickname("张三啊");
		user.setEmail("pandaball2@qq.com");
		user.setTelephone("18002137253--");
		user.setTime(new Date());
		user.setToken("zhangsan_token");
		dao.updateUserById(user);
	}

	@Test
	public void testAddUser() throws SQLException {
		User user = new User();
		user.setId("1");
		user.setUsername("zhangsan");
		user.setPassword("1234");
		user.setNickname("张三");
		user.setEmail("pandaball@qq.com");
		user.setTelephone("18002137253");
		user.setTime(new Date());
		user.setToken("zhangsan_token");
		dao.addUser(user);
	}

	@Test
	public void testDeleteUserById() throws SQLException {
		dao.deleteUserById("1");
	}
}
