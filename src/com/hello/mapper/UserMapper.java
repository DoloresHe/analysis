package com.hello.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hello.pojo.User;

public interface UserMapper {
	public List<User> list();
	public User checkUser
(@Param("username") String username, @Param("userpsw") String userpsw);

}
