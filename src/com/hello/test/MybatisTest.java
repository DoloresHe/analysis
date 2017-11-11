package com.hello.test;


import java.util.List;
import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hello.mapper.OrderMapper;
import com.hello.mapper.UserMapper;
import com.hello.pojo.OrderWay;
import com.hello.pojo.User;
import com.hello.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

	@Autowired
	private OrderMapper orderMapper;
	private UserService userService; 
/*
		@Test
		public void testCheckUser() throws Exception {	 
			User user = userService.login("xining", "123456");//测试dao中的方法
			System.out.println("testCheckUser()执行结果是：" + user.getId()); 
		}	
*/
	@Test
	public void testList()throws Exception{
  
        //System.out.println("hello1");               
		Scanner input = new Scanner(System.in);
        int order_way = input.nextInt();

        List<OrderWay> order = orderMapper.prov_list(order_way);
        if(order != null){
        	for (OrderWay c : order)
        		System.out.println(c.getOrder_way() + " " + c.getProv_name()+ " " + c.getNum());
        }
        input.close();
	}

}
