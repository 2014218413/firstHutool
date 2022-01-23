package My.test;

import cn.hutool.core.util.XmlUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
//        String a = "{\"xsxx\":[{\"销售部门\":\"新特药品分公司\",\"AS订单日期\":1618362130000,\"随货同行单文件\":\"<附件><FileID>85e3dec25d21408ea66c674f9f63c34a</FileID><FileName>18365436_随货同行单.pdf</FileName><FileUploadTime>2021-05-07</FileUploadTime></附件>\",\"客户编码\":\"31110406\",\"订单流水号\":\"0003\",\"销售订单外码\":\"XSD0504210402758\",\"采购发票文件\":\"<附件><FileID>5fb43cd0f1754961835b4a5300085820</FileID><FileName>18365436_采购发票.pdf</FileName><FileUploadTime>2021-04-21</FileUploadTime></附件>\",\"药品名称\":\"布洛芬注射液(芬立平)\",\"WLH\":\"AD311111\",\"历史发票文件\":\"<附件><FileID>fc56e21860c14c1380157187605433bf</FileID><FileName>18365436_采购发票.pdf</FileName><FileUploadTime>2021-04-14</FileUploadTime></附件>\",\"GSBM\":\"1\",\"客户名称\":\"首都医科大学附属北京儿童医院\",\"ID\":\"c869d71e360b4b5a9a9fc0d5f86936fa\",\"销售订单内码\":\"18365436\"}],\"fpxx\":[{\"发票附件B版\":\"<发票附件B版><FileID>8d5f05185e334064825317eb8c021603</FileID><FileName>5400194130_00546143.jpg</FileName><FileUploadUser></FileUploadUser><FileUploadTime>2021-04-20</FileUploadTime></发票附件B版>\"}]}";
//
//
//        JSONObject jsonObject2 = new JSONObject(a);
//
//        System.out.println(jsonObject2.get("xsxx"));
//
//    String aaa = "<FileID>6305ab22626b49b3a7c24c099467a8ba</FileID>";
//        System.out.println(XmlUtil.parseXml(aaa).getElementsByTagName("FileID"));


//String aaass= "fdsf<FileID>6305ab22626b49b3a7c24c099467a8ba</FileID>";
//   String id = aaass.split("<FileID>")[1].split("</FileID>")[0];
String a = null;
//        System.out.println(id);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0;i<=9;i++) {
            for (int i1 = 0;i1<=9;i1++) {
                for (int i2 = 0;i2<=9;i2++) {
                    for (int i3 = 0;i3<=1;i3++) {
                        a = 167+""+i+""+i1+""+i2+""+i3+""+2888;

                        try {
                            String message = HttpUtil.get("https://www.ip138.com/mobile.asp?mobile="+a+"&action=mobile");

                            Thread.sleep(40);
                            list.add(message);
                        }
                        catch (Exception e) {
                            System.out.println(a);
                        }



                    }
                }
            }
        }
        list.stream().forEach(i -> {
                                    if (!i.contains("未知")) {
                            System.out.println(i);
                        }
        });
        System.out.println(list.size());

    }
}
