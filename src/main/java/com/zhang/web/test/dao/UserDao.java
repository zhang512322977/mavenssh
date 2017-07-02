package com.zhang.web.test.dao;

import java.io.Serializable;
import java.util.List;

import com.zhang.web.test.entity.User;

public interface UserDao {

	// 新增
	public void save(User entity);

	// 更新
	public void update(User entity);

	// 根据id删除
	public void delete(Serializable id);

	// 根据id查找
	public User findObjectById(Serializable id);

	// 查找列表
	public List<User> findObjects();
}
