package com.hello.service;

import java.util.List;

import com.hello.pojo.User;

public interface UserService {

	List<User> list();
	/**
	 * ��¼��֤ҵ�񷽷�
	 * @param username  �û���
	 * @param userpsw   ����
	 * @return  �����¼ʧ�ܷ���null�����򷵻طǿ�
	 */
	public User login(String username,String userpsw);

}