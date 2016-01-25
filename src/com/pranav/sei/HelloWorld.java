package com.pranav.sei;
import javax.jws.WebService;

@WebService
public interface HelloWorld {

	public String helloWorld(String name);
	public String getPp();
 	public void setPp(String pp) ;
}
