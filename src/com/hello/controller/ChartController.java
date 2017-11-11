package com.hello.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hello.pojo.OrderWay;
import com.hello.service.ProvinceService;

/*
 * �漰����controller
 * ��1������ָ���ʡ�ݷ�������һ��������ת��Ӧ����һ����ʾ������������ָ�꣨Ŀǰûʵ�֣���
 * ֻʵ������������ת��ʽ
 * ��2��Ʒ�ƺ������һ���������û��ʵ�ֵ���ǰ���ܹ���
 * ���Ե�ʱ��Ҫ����ע����session������
 */

@Controller
public class ChartController {
	@Autowired
	ProvinceService provinceService;
	
	int order;


/*
 * ��Ҫ����������һ�������ܲ����ж��controller
 * ����ǿ���
 * ����ûʲô��
 */
	@RequestMapping("province")
    @ResponseBody
    public void pass(String orderway) {
		order=Integer.parseInt(orderway);
		System.out.println("hello"+orderway );
    }  

/*
 * ��״ͼ���صĴ��κ���
 */	
    @RequestMapping(value = "/hello1")
    @ResponseBody
    public List<OrderWay> page(HttpServletRequest request) {
	     HttpSession session = request.getSession();  
	     order=Integer.parseInt((session.getAttribute("orderway").toString()));
		List<OrderWay> ow= provinceService.prov_list(2);
    	//List<OrderWay> ow= provinceService.list();
		System.out.println("hello1"+(order));  
	    // session.getAttribute("orderway");	
		System.out.println("hello1"+ session.getAttribute("orderway"));
        return ow;
    }


}