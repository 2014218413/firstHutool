package upAndDown;

import cn.hutool.core.util.XmlUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import org.w3c.dom.Document;

import javax.xml.xpath.XPathConstants;
import java.io.File;

public class S {

    public static void main(String[] args) {
//        String message = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">\n" +
//                "   <soapenv:Header/>\n" +
//                "   <soapenv:Body>\n" +
//                "      <tem:QuerySDPurchaseOrder>\n" +
//                "         <!--Optional:-->\n" +
//                "         <tem:userName>xhyy_gybj</tem:userName>\n" +
//                "         <!--Optional:-->\n" +
//                "         <tem:pwd>gybj@123</tem:pwd>\n" +
//                "         <!--Optional:-->\n" +
//                "         <tem:myDomain>xhyy_gybj</tem:myDomain>\n" +
//                "         <!--Optional:-->\n" +
//                "         <tem:orderType>10</tem:orderType>\n" +
//                "         <!--Optional:-->\n" +
//                "         <tem:partnerId>3111075</tem:partnerId>\n" +
//                "      </tem:QuerySDPurchaseOrder>\n" +
//                "   </soapenv:Body>\n" +
//                "</soapenv:Envelope>";
//        String mm = HttpRequest.post("http://120.133.63.8:8082/WebService/SwapData/Supplier/SupplierWebService.asmx?wsdl")
//                .contentType("text/xml;charset=UTF-8").body(message).execute().body();
//
//        String m2 = mm.replace(" xmlns=\"http://tempuri.org/\"","");
//        System.out.println(m2);
//        File file = new File("D:\\firstHutool\\src\\main\\java\\upAndDown\\a.xml");
//        Document docResult = XmlUtil.parseXml(m2);
////        Document docResult = XmlUtil.readXML(file);
////
//        Object value = XmlUtil.getByXPath("/soap:Envelope/soap:Body/QuerySDPurchaseOrderResponse/purchaseOrders/SDPurchaseOrder/PurchaseOrderId", docResult, XPathConstants.STRING);
//        System.out.println(value);



        String sss = "abccccc";
        System.out.println(sss);
        System.out.println(sss.replace("abc", "A"));
        System.out.println(sss);

    }
}
