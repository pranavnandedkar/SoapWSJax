package com.pranav.sei;  
import javax.xml.ws.Endpoint;  
  
public class HelloWorldWSPublisher {  
 public static void main(String[] args) {  
	 System.out.println("dd");
  Endpoint.publish("http://localhost:8081/WS/HelloWorld",new HelloWorldImpl());  
 }  
}  

