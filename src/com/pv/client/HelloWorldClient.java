    package com.pv.client;  
    import java.net.URL;  
    import javax.xml.namespace.QName;  
    import javax.xml.ws.Service;

import com.pranav.sei.HelloWorld;  
    public class HelloWorldClient{  
        public static void main(String[] args) throws Exception {  
        URL url = new URL("http://localhost:8081/WS/HelloWorld?wsdl");  
       
            //1st argument service URI, refer to wsdl document above  
        	//2nd argument is service name, refer to wsdl document above  
            QName qname = new QName("http://sei.pranav.com/", "HelloWorldImplService");  
            Service service = Service.create(url, qname);  
            HelloWorld hello = service.getPort(HelloWorld.class);  
            hello.setPp("javatpoint rpc");  
            System.out.println(hello.helloWorld("pppppppppppppppppppppppppppp"));
         }  
     }  