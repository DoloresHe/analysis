package com.hello.service;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hello.pojo.OrderWay;



public interface ProvinceService{ 
	/*
	 * 返回类型数据包括省份，订购方式，人数，按选择来显示数据
	 */
	List<OrderWay> list();
	List<OrderWay> prov_list(@Param("order_way")int order_way);
}