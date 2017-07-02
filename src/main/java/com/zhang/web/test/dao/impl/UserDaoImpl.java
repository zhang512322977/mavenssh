package com.zhang.web.test.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.zhang.web.test.dao.UserDao;
import com.zhang.web.test.entity.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	
	
	@Override
	public void save(User entity) {
		// TODO Auto-generated method stub
		System.out.println("presave");
		if(getHibernateTemplate()!=null){
			getHibernateTemplate().save(entity);
		}else{
			
			System.out.println("daosave");
		}
		
	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub
		
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
