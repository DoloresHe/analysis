package com.hello.service;

import java.util.List;

import com.hello.pojo.User;

public interface UserService {

	List<User> list();
	/**
	 * 登录验证业务方法
	 * @param username  用户名
	 * @param userpsw   密码
	 * @return  如果登录失败返回null，否则返回非空
	 */
	public User login(String username,String userpsw);

}