package My.BJ301;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import java.util.ArrayList;
import java.util.List;

public class TestSend {
    public static void main(String[] args) {
        All all = new All();


        Headers headers = new Headers();
        headers.setContractNo(" ");
        headers.setAppID("app21111700000000428CFF79");
        headers.setTranObject("200022");
        headers.setAction("Create");
        headers.setVersion("v1");
        headers.setDocID("3fa85f64-5717-4562-b3fc-2c963f66afa6");
        headers.setCreateOn("2021-11-24 15:36:39");

        all.setHeader(headers);



        SongHuoDanMingXi songHuoDanMingXi = new SongHuoDanMingXi();
        songHuoDanMingXi.setRowId("80ba25fa0abb48b9918268cd3cfb3365");
        songHuoDanMingXi.setProductErpCode("A001");
        songHuoDanMingXi.setQuantity(100);/**24*/
        songHuoDanMingXi.setUnitName("");
        songHuoDanMingXi.setPrice(15.9);/**15.9*/
        songHuoDanMingXi.setProductionBatch("20200801003");
        songHuoDanMingXi.setInvoiceNumber("");
        songHuoDanMingXi.setProductionDate("2021-1-1 10:10:10");
        songHuoDanMingXi.setExpirationDate("2021-1-1 10:10:10");
        songHuoDanMingXi.setTraceCodes("");
        songHuoDanMingXi.setPrepareQuantity(0);
        List<SongHuoDanMingXi> DeliveryOrderDetails = new ArrayList<>();
        DeliveryOrderDetails.add(songHuoDanMingXi);


        SongHuoDan songHuoDan = new SongHuoDan();
        songHuoDan.setNumber("ZDAT00000000000143515923111asdda1ds");
        songHuoDan.setOrderNumber("");
        songHuoDan.setSunnyOrderNumber("ZDAT00000000000143515888");
        songHuoDan.setDeliveryDate("");
        songHuoDan.setCompanyName("国控北京");
        songHuoDan.setDeliveryPerson("王晓二");
        songHuoDan.setDeliveryPhoneNumber("13114115111");
        songHuoDan.setLicensePlateNumber("京N78678");
        songHuoDan.setDriver("赵谦");
        songHuoDan.setDriverPhoneNumber("13114115111");
        songHuoDan.setReceiver("收货人");
        songHuoDan.setReceivePhoneNumber("13114115111");
        songHuoDan.setReceiveEmail("");
        songHuoDan.setDeliveryAddress("收货地址");
        songHuoDan.setRemark("");
        songHuoDan.setShippingDescn("");
        songHuoDan.setContactDeptErpCode("A001");
//        songHuoDan.setPersonName("王磊");
//        songHuoDan.setPhoneNumber("13114115111");
        songHuoDan.setDeliveryOrderDetails(DeliveryOrderDetails);
        List<SongHuoDan> list = new ArrayList<>();
        list.add(songHuoDan);
        String message  = JSONUtil.toJsonStr(list);
        System.out.println(list.get(0).toString());
        System.out.println(message);
        System.out.println("===============================================");
//        System.out.println(message);
//        User user  = new User();
//        user.setBb(message);
//        System.out.println(JSONUtil.toJsonStr(user));
//        User2 user2 = new User2();
//        user2.setDddd(JSONUtil.toJsonStr(user));
//        System.out.println(JSONUtil.toJsonStr(user2));

        Body body = new Body();
        body.setData(message);
        body.setExtends("");

        all.setBody(body);


//String a = "{\"Header\":{\"CreateOn\":\"2021-11-24 16:12:08\",\"DocID\":\"3fa85f64-5717-4562-b3fc-2c963f66afa6\",\"Action\":\"Create\",\"AppID\":\"app21111700000000428CFF79\",\"Version\":\"v1\",\"ContractNo\":\" \",\"TranObject\":\"200022\"},\"Body\":{\"Data\":[{\"SunnyOrderNumber\":\"ZDAT00000000000143515888\",\"ReceiveEmail\":\"\",\"DriverPhoneNumber\":\"13114115111\",\"DeliveryAddress\":\"收货地址\",\"Receiver\":\"收货人\",\"Driver\":\"赵谦\",\"OrderNumber\":\"\",\"DeliveryDate\":\"\",\"DeliveryPhoneNumber\":\"13114115111\",\"ReceivePhoneNumber\":\"13114115111\",\"LicensePlateNumber\":\"京N78678\",\"Remark\":\"\",\"ShippingDescn\":\"\",\"CompanyName\":\"国控北京\",\"Number\":\"ZDAT00000000000143515923\",\"DeliveryOrderDetails\":[{\"Quantity\":100,\"TraceCodes\":\"\",\"UnitName\":\"\",\"ProductionBatch\":\"202011190S\",\"ExpirationDate\":\"2022-11-16 13:45:53\",\"ProductErpCode\":\"A001\",\"Price\":15.9,\"InvoiceNumber\":\"\",\"ProductionDate\":\"2020-11-26 13:45:53\",\"RowId\":\"xxssdd\"}],\"DeliveryPerson\":\"赵谦\",\"ContactDeptErpCode\":\"A001\"}],\"Extends\":\"\"}}";

System.out.println(HttpRequest.post("https://api.nuttrack.cn/api/openapi")
                .body(JSONUtil.toJsonStr(all))
//                .body(a)
                .header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IjY2ZDlmYjY1YjI2MzQxM2E4MDA0ODc2NDhiMGEyNWZhIiwidHlwIjoiYXQrand0In0.eyJuYmYiOjE2Mzc4MTg5MTQsImV4cCI6MTYzNzgyNjExNCwiaXNzIjoiaHR0cDovL250aWRlbnRpdHk6NDAwMCIsImF1ZCI6Ik5UIiwiY2xpZW50X2lkIjoiYXBwMjExMTE3MDAwMDAwMDA0MjhDRkY3OSIsInNjb3BlIjpbIk5UIl19.tCm04AaN4dhgAQr_-Tv_s1KRX4tkk3vIvi9fSEGCGqhw7dZ7GPBJi1Te0shBpK4wlJOsnS0PwCckNYsAGhGrKrXRVlhvy1nKqmhHPAftQfR9I2wTANqvOuZq-nDNmcF7Ub5WRg7B0HYULA15IPQRMbIbHfvfqETty6IoZ75Hsec9VzNvK2CihFq5poEaYGTQ3IFT9iksN5n_KI-7aWaDP6YsyzRnzIjE8fZVVRcxx3Te8bOmuhkxO2Eu2zZwT6tba9mRR07ua-k-Dqgbd3LtmOwejn-hBEE6cRQONfD3RNx8eXwkLHK4gd2axcoQNwGUOJq5VwFQNVy0LoDlLItvgg")
//                .contentType("application/json").execute().body());
                .execute().body());

    }
}
