package com.zhang.web.test.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhang.web.test.dao.UserDao;
import com.zhang.web.test.entity.User;
import com.zhang.web.test.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	
	@Override
	public void save(User entity) {
		System.out.println("save");
		userDao.save(entity);
	}
	@Override
	public void update(User entity) {
		System.out.println("update");
		
	}
	@Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public User findObjectById(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<User> findObjects() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
