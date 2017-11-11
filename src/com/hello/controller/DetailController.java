package com.hello.controller;


import java.text.DecimalFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hello.pojo.OrderWay;
import com.hello.service.ProvinceService;


/*
 *����������Ʒ�ƶ��������controller
 *����һ�����洫�صĲ�ѯ���� �����ɱ��ǰ�˵��Թ����������û��ɣ�
 *��״ͼ�ݶ���chartcontroller������
 */

@Controller
public class DetailController {
	@Autowired
	ProvinceService provinceService;
    
	int order;
	/*
	 * û������
	 * ��jsp��include�����
	 * �Ǵ����ظ�
	 */	
    @RequestMapping(value = "/province2")
    @ResponseBody
    public List<OrderWay> detail2(HttpServletRequest request) {
	     //HttpSession session = request.getSession();  
	     //order=Integer.parseInt((session.getAttribute("orderway").toString()));
		List<OrderWay> ow= provinceService.prov_list(2);
    	//List<OrderWay> ow= provinceService.list();
		System.out.println("hello1"+(order));  
	    // session.getAttribute("orderway");	
		//System.out.println("hello2"+ session.getAttribute("orderway"));
        return ow;
    }	
    
	
	@RequestMapping("detail2")
    public ModelAndView orderWeb1() throws Exception {
        ModelAndView mav = new ModelAndView("detail2");
		List<OrderWay> ow= provinceService.list();
		System.out.println("hello2333");
		long tnum=0;
		float per1=0,per2=0,per3=0;
		for(OrderWay o:ow) 				tnum+=o.getNum();
		mav.addObject("tnum", tnum);
		DecimalFormat df = new DecimalFormat("0.00");//��ʽ��С�� 
		for(OrderWay o:ow){
			if(o.getOrder_way().equals("�ƶ��̳�")) 		
				{
				mav.addObject("num1", o.getNum());
				per1=(float)o.getNum()/tnum*100;

				System.out.println(per1);
				mav.addObject("per1", df.format(per1)+"%");				
				}
			if(o.getOrder_way().equals("�ֻ�Ӫҵ��")) 		{
				mav.addObject("num2", o.getNum());			
				per2=(float)o.getNum()/tnum*100;
				mav.addObject("per2", df.format(per2)+"%");
			}
			if(o.getOrder_way().equals("�������̳�")) 		{
				mav.addObject("num3", o.getNum());
				per3=(float)o.getNum()/tnum*100;
				mav.addObject("per3", df.format(per3)+"%");
			}			
		}
		
        return mav; 
    }
}