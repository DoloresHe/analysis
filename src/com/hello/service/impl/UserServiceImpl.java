package com.hello.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.mapper.UserMapper;
import com.hello.pojo.User;
import com.hello.service.UserService;


@Service
public class UserServiceImpl  implements UserService{
	@Autowired
	UserMapper userMapper;
	
	
	public List<User> list(){
		return userMapper.list();
	};

	public User login(String username, String userpsw) {
		return userMapper.checkUser(username, userpsw);//����userdao����ķ���������û����������Ƿ���ȷ��
	}

}


