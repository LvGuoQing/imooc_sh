package service.impl;

import org.junit.Test;

import entity.Users;
import junit.framework.Assert;
import service.UsersDAO;


public class TestUsersDAOImpl {
	@Test
	public void testUsersLogin(){
		Users u=new Users(2,"12","1234567");
		UsersDAO udao=new UsersDAOImpl();
		Assert.assertEquals(true,udao.usersLogin(u));
	}

}
