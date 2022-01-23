package My.BJ301.B68;


import My.BJ301.*;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONUtil;

import java.util.ArrayList;
import java.util.List;

public class TestSend68 {
    public static void main(String[] args) {
        All all = new All();


        Headers headers = new Headers();
        headers.setContractNo(" ");
        headers.setAppID("app21111700000000428CFF79");
        headers.setTranObject("200023");
        headers.setAction("Create");
        headers.setVersion("v1");
        headers.setDocID("3fa85f64-5717-4562-b3fc-2c963f66afa6");
        headers.setCreateOn("2021-11-24 15:36:39");

        all.setHeader(headers);


        S68 s68 = new S68();
        s68.setDeliveryOrderNumber("221718111121");
        s68.setIsOver("false");
        s68.setPointTime("2020-10-29 11:53:08");
        s68.setPointX(116.180034);
        s68.setPointY(40.020533);
        s68.setRowId("EC090444-0C73-4758-BDF7-37BBBCDE8ED3");
        s68.setTemperature(4.02);

        List<S68> list = new ArrayList<>();
        list.add(s68);
        String message = JSONUtil.toJsonStr(list);

        Body body = new Body();
        body.setData(message);
        body.setExtends("");

        all.setBody(body);

        System.out.println(HttpRequest.post("https://api.nuttrack.cn/api/openapi")
                .body(JSONUtil.toJsonStr(all))
//                .body(a)
                .header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IjY2ZDlmYjY1YjI2MzQxM2E4MDA0ODc2NDhiMGEyNWZhIiwidHlwIjoiYXQrand0In0.eyJuYmYiOjE2Mzk2MTkzMTYsImV4cCI6MTYzOTYyNjUxNiwiaXNzIjoiaHR0cDovL250aWRlbnRpdHk6NDAwMCIsImF1ZCI6Ik5UIiwiY2xpZW50X2lkIjoiYXBwMjExMTE3MDAwMDAwMDA0MjhDRkY3OSIsInNjb3BlIjpbIk5UIl19.LmNnRpGR_BsboIP-H2h7-N51V0egnZ3cVjPRDDayQaCUI3hw6uAFx2KuH-r0Zijf6AEvnPxqJLvHjccH8fBJ2sa-FnMwGrCmJy-aIQ6ZoOtSdGCDEptY1F8Uc5bOwu5WRNQfUFK6mRYudGJ5L7alG9ER1vJzPnHKuvcyak9P8MhJGOkz2u1FT2_jQ4bFjQO7v0jG3ovbyE1xOfR3kETNOqBrT2Xfb5zRzPOQSVns9LfDXpjvj1zFLYfBl9lKep3nOW0HXFrfjmaxodpB2-QlLyhYyhshYHWLHZdo9Mo2zU78jTcnZXqB_RX-V4SXyypLpJHnEPoG59kvHLbmZ-VSiQ")
//                .contentType("application/json").execute().body());
                .execute().body());

    }

}
