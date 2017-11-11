package com.hello.controller;
import java.text.DecimalFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hello.pojo.OrderWay;
import com.hello.service.ProvinceService;

/*
 * ������controller
 * �������ɣ�������ת�¼�
 * ��������������ָ��Ķ������棬���λ��б仯���Ҫ���ǣ�ûʵ�֣����������ڰ�������ʵ�ֶ�̬������ݹ���,������õ�)
 */


@Controller
public class OrderwayController {
	@Autowired
	ProvinceService provinceService;

	/*
	 * �������ɺ���
	 * ���������Ż����е�����
	 * 
	 */
@RequestMapping("form")
    public ModelAndView orderWeb() throws Exception {
        ModelAndView mav = new ModelAndView("form");
		List<OrderWay> ow= provinceService.list();
		System.out.println("hello");
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
	
/*
 * ���������ǵ���û���������ת����
 * ���Կ���ת�Ƶ�ǰ��
 * ��������
 */
	@RequestMapping(value="num1")
    public String clickNum1(HttpServletRequest request, HttpServletResponse response) throws Exception {
	     HttpSession session = request.getSession();  
	     session.setAttribute("orderway", "1");	
        return "province";
	}
	
	@RequestMapping(value="num2")
    public String clickNum2(HttpServletRequest request, HttpServletResponse response) throws Exception {
	     HttpSession session = request.getSession();  
	     session.setAttribute("orderway", "2");	
        return "province";
	}
	@RequestMapping(value="num5")
    public String clickNum5(HttpServletRequest request, HttpServletResponse response) throws Exception {
	     HttpSession session = request.getSession();  
	     session.setAttribute("orderway", "5");	
        return "province";
	}
	

}