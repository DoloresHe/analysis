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
 * 渠道的controller
 * 表格的生成，带参跳转事件
 * 还有是其他两个指标的二级界面，传参会有变化这个要考虑（没实现，可以试试在包含界面实现动态添加数据功能,这个做得到)
 */


@Controller
public class OrderwayController {
	@Autowired
	ProvinceService provinceService;

	/*
	 * 表格的生成函数
	 * 还可以再优化，有点冗余
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
		DecimalFormat df = new DecimalFormat("0.00");//格式化小数 
		for(OrderWay o:ow){
			if(o.getOrder_way().equals("移动商城")) 		
				{
				mav.addObject("num1", o.getNum());
				per1=(float)o.getNum()/tnum*100;

				System.out.println(per1);
				mav.addObject("per1", df.format(per1)+"%");				
				}
			if(o.getOrder_way().equals("手机营业厅")) 		{
				mav.addObject("num2", o.getNum());			
				per2=(float)o.getNum()/tnum*100;
				mav.addObject("per2", df.format(per2)+"%");
			}
			if(o.getOrder_way().equals("触屏版商城")) 		{
				mav.addObject("num3", o.getNum());
				per3=(float)o.getNum()/tnum*100;
				mav.addObject("per3", df.format(per3)+"%");
			}			
		}
		
        return mav; 
    }
	
/*
 * 下面三个是点击用户数带参跳转函数
 * 可以考虑转移到前端
 * 还是冗余
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