package com.hello.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.mapper.OrderMapper;
import com.hello.pojo.OrderWay;
import com.hello.service.ProvinceService;




@Service
public class ProvinceServiceImpl  implements ProvinceService{
	@Autowired
	OrderMapper orderMapper;
	
	public List<OrderWay> list(){
		return orderMapper.list();
	}
	public List<OrderWay> prov_list(@Param("order_way")int order_way){
		return orderMapper.prov_list(order_way);
	}
}