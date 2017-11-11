package com.hello.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hello.service.UserService;
import com.hello.pojo.User;

/*
 * 登陆的controller
 * 安全验证没有弄
 * 实现基本的登陆成功跳转页面
 */

@Controller
@RequestMapping("")
public class LoginController {
	@Autowired
	UserService userService;
	
	/*
	 * 验证用户名密码是否一致，一致跳转页面
	 * 不一致会多出警告语句（没有做，到最后改）
	 * 现在不一致跳转页面，便于调试
	 */
    @RequestMapping(value="login.do")
    public ModelAndView handleRequest(@RequestParam("username")String username,
    		@RequestParam("password")String password,HttpServletRequest request,
    		HttpServletResponse response) throws Exception {
    	
    	User user = userService.login(username, password);
		if(user != null) {
			ModelAndView mav = new ModelAndView("redirect:/front");
		   return mav; // 浏览器显示 success.jsp,网页的保存位置在spring-web.xml中配置，在本例配置中网页存放在Eclipse工程的WebContent下
		} else {
	        ModelAndView mav = new ModelAndView("redirect:/detail2");
			return mav;  //浏览器显示fail.jsp，网页的保存位置在spring-web.xml中配置
		}
	}

 /*   	
  * 和数据库连接的调试代码
        ModelAndView mav = new ModelAndView("login");
		List<User> us= userService.list();
        //mav.addObject("username", username);
		mav.addObject("cs", us);
        System.out.println(username);
        if(us != null){
        for (User c : us)
    		System.out.println(c.getId()+" "+c.getName()+' '+c.getPassword()+' '+c.getPrivilege()+' '+c.getCity());

        }else System.out.println("errpr");    
        System.out.println("ok");    
        return mav;   
        }*/
}  

