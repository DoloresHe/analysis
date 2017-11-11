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
 * 涉及表格的controller
 * （1）三种指标的省份分析表，由一级界面跳转，应该有一个标示量来区分三个指标（目前没实现），
 * 只实现了渠道的跳转方式
 * （2）品牌和零件的一级界面表，还没有实现但是前端跑过了
 * 测试的时候不要忘了注释了session！！！
 */

@Controller
public class ChartController {
	@Autowired
	ProvinceService provinceService;
	
	int order;


/*
 * 主要是用来测试一个界面能不能有多个controller
 * 结果是可以
 * 基本没什么用
 */
	@RequestMapping("province")
    @ResponseBody
    public void pass(String orderway) {
		order=Integer.parseInt(orderway);
		System.out.println("hello"+orderway );
    }  

/*
 * 柱状图加载的传参函数
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