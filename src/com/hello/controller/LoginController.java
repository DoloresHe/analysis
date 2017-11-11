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
 * ��½��controller
 * ��ȫ��֤û��Ū
 * ʵ�ֻ����ĵ�½�ɹ���תҳ��
 */

@Controller
@RequestMapping("")
public class LoginController {
	@Autowired
	UserService userService;
	
	/*
	 * ��֤�û��������Ƿ�һ�£�һ����תҳ��
	 * ��һ�»���������䣨û�����������ģ�
	 * ���ڲ�һ����תҳ�棬���ڵ���
	 */
    @RequestMapping(value="login.do")
    public ModelAndView handleRequest(@RequestParam("username")String username,
    		@RequestParam("password")String password,HttpServletRequest request,
    		HttpServletResponse response) throws Exception {
    	
    	User user = userService.login(username, password);
		if(user != null) {
			ModelAndView mav = new ModelAndView("redirect:/front");
		   return mav; // �������ʾ success.jsp,��ҳ�ı���λ����spring-web.xml�����ã��ڱ�����������ҳ�����Eclipse���̵�WebContent��
		} else {
	        ModelAndView mav = new ModelAndView("redirect:/detail2");
			return mav;  //�������ʾfail.jsp����ҳ�ı���λ����spring-web.xml������
		}
	}

 /*   	
  * �����ݿ����ӵĵ��Դ���
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

