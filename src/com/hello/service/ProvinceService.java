package com.hello.service;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hello.pojo.OrderWay;



public interface ProvinceService{ 
	/*
	 * �����������ݰ���ʡ�ݣ�������ʽ����������ѡ������ʾ����
	 */
	List<OrderWay> list();
	List<OrderWay> prov_list(@Param("order_way")int order_way);
}