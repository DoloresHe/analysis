package com.hello.pojo;

public class OrderWay {
	
	private int order_way;
	private long  num;
	private String prov_name;
	
	public String getOrder_way() {
		if(order_way == 1){
			return "�ƶ��̳�";
		}else if(order_way == 2){
			return "�ֻ�Ӫҵ��";
		}else return "�������̳�";
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
