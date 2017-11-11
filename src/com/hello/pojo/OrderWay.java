package com.hello.pojo;

public class OrderWay {
	
	private int order_way;
	private long  num;
	private String prov_name;
	
	public String getOrder_way() {
		if(order_way == 1){
			return "移动商城";
		}else if(order_way == 2){
			return "手机营业厅";
		}else return "触屏版商城";
	}
	
	public void  setOrder_way(int order_way) {
		this.order_way = order_way;
	}
	public long getNum() {
		return num;
	}
	public void  setNum(long num) {
		this.num = num;
	}
	public String getProv_name() {
		return prov_name;
	}
	public void  setProv_name(String prov_name) {
		this.prov_name = prov_name;
	}
	
}
