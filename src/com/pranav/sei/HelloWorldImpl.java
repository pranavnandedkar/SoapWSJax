package com.pranav.sei;  
import javax.jws.WebService;  

@WebService(endpointInterface="com.pranav.sei.HelloWorld")  
public class HelloWorldImpl implements HelloWorld{  
	
	String pp;
	public String getPp() {
		return pp;
	}
	public void setPp(String pp) {
		this.pp = pp;
	}
	public String helloWorld(String name) {  
		return "Hello world from "+name;  
	}  

	
}  

