package com.zhang.web.test.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.zhang.web.test.entity.User;
import com.zhang.web.test.service.UserService;

public class UserAction extends ActionSupport {

	private UserService userService;
	
	



	public void setUserService(UserService userService) {
		this.userService = userService;
	}





	public String  hello(){
		User entity = new User();
		entity.setUsername("zhangsan");
		entity.setPassword("123456");
		System.out.println("123456");
		userService.save(entity);
		return "success";
	}
	
}
