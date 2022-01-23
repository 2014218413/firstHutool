package webService;

import cn.hutool.http.HttpUtil;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class PWebS {
    public static void main(String[] args) {
        //发布服务的工厂
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
        //设置服务地址
        jaxWsServerFactoryBean.setAddress("http://localhost:8001/L/H");
        //设置服务类
        jaxWsServerFactoryBean.setServiceBean(new HelloServiceImpl());
        //发布服务
        jaxWsServerFactoryBean.create();
        //
        System.out.println("发布完成-------------------");

    }
}
