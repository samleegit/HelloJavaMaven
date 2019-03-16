package com.dongnao;



import com.alibaba.fastjson.JSONObject;


public class HelloDongnao {
	public String sayHello(String name){
		return "Hello "+name;
		
	}
	
	public static void main(String[] args) {
		HelloDongnao test = new HelloDongnao();
		String helloString = test.sayHello("dongnao");
		
		JSONObject a = new JSONObject();
		a.put("helloString", helloString);
		
		System.out.println(a.get("helloString"));
		
		test.getNum();
	}
	
	public float getNum(){
		
		System.out.println("chu fa!");
		float a = 5 / 0;
		
		return a;		
	}
}
