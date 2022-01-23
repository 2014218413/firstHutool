package webService;

import cn.hutool.core.lang.Console;
import cn.hutool.http.webservice.SoapClient;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) throws ParseException {
//
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//        Date date2 = simpleDateFormat.parse("2021-12-01 12:00:00");
//        Date date3 = simpleDateFormat.parse("2021-12-01 12:00:00");
//        Date date4 = simpleDateFormat.parse("2021-12-01 12:00:00");
//
//        SDSaleOrder sdSaleOrder = new SDSaleOrder("XSD0000211200003","1","2021-12-01","2021-12-02","","","","",
//                "31111753","31111753","001","","","","","",
//                "AL400101-4","注射用丙戊酸钠(德巴金)","","","","",
//                "400mg","注射剂","","",
//                "赛诺菲(杭州)制药有限公司(分装)","国药准字J20150064","",100.00,"盒",120.00,0.00,0.00,
//                "11111111","2021-12-01","12000","","","0J8631","2020-09-01",
//                "2023-08-31","系统管理员",date2,0,"","","","","",
//                "","",new Date(),"","","","","11111111",
//                "","0J8631",new Date(),"12000","","","","","","",
//                new Date(),"","","","");
//
//        SDSaleOrder[] sdSaleOrders = {sdSaleOrder};
//
//        SoapClient client = SoapClient.create("http://120.133.63.8:8082/WebService/SwapData/Supplier/SupplierWebService.asmx")
//                // 设置要请求的方法，此接口方法前缀为web，传入对应的命名空间
//                .setMethod("web:CUSDSaleOrder_Invoice", "http://tempuri.org/")
//                // 设置参数，此处自动添加方法的前缀：web
//                .setParam("userName", "xhyy_gybj")
//                .setParam("pwd", "gybj@123")
//                .setParam("myDomain", "xhyy_gybj")
//                .setParam("orderType", "10")
//                .setParam("partnerId", "100001")
//                .setParam("saleOrders", sdSaleOrders);
//
//        // 发送请求，参数true表示返回一个格式化后的XML内容
//        // 返回内容为XML字符串，可以配合XmlUtil解析这个响应
//        Console.log(client.send(true));
//
//
//        System.out.println(12*30);
        //************************************************************************************************
        User user = new User();
        user.setName("100");
        user.setAddress("100");
//        ArrayList<User> users = new ArrayList<User>();
//        users.add(user);
        User[] users = {user};
            SoapClient client = SoapClient.create("http://192.168.145.91:8000/L/H")
                // 设置要请求的方法，此接口方法前缀为web，传入对应的命名空间
                .setMethod("web:sayHello", "http://webService.myBoot/")
                // 设置参数，此处自动添加方法的前缀：web
                .setParam("users", users);

        // 发送请求，参数true表示返回一个格式化后的XML内容
        // 返回内容为XML字符串，可以配合XmlUtil解析这个响应
        Console.log(client.send(true));


    }
}
