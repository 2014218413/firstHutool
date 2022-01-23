package webService;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) throws Exception {

        User user = new User();
        user.setName("100");
        user.setAddress("100");
        User[] users = {user};

        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setAddress("http://192.168.145.91:8000/L/H?wsdl");
//        jaxWsProxyFactoryBean.setAddress("http://localhost:8082/webService/H");
        jaxWsProxyFactoryBean.setServiceClass(HelloWebService.class);
        HelloWebService helloWebService = jaxWsProxyFactoryBean.create(HelloWebService.class);
        System.out.println(helloWebService.sayHello("username",users));
    }
}
