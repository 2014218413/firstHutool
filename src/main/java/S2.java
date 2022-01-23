import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import java.util.HashMap;
import java.util.Map;

public class S2 {
    public static void main(String[] args) {
        S2 s2 = new S2();
        s2.sendQYMessage("wx942bdf13059d55d2","16LEJ2RkiszAeM6SFsVebJKja7L670OneadRchbY2UU",1000007,"chengai");
    }

    public void sendQYMessage (String corPid,String corpSecret,int ageNTid,String toUser) {
        /**
         * corpid:企业ID
         * corpsecret:应用的凭证密钥
         * agentid:企业应用的id，整型
         * touser:指定接收消息的成员，成员ID列表（多个接收者用‘|’分隔，最多支持1000个）。特殊情况：指定为”@all”，则向该企业应用的全部成员发送
         * access_token:请求后返回的Token
         * */
        String corpid = corPid;
        String corpsecret = corpSecret;
        int agentid = ageNTid;
        String touser = toUser;
        String response = HttpRequest.get("https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=" + corpid + "&corpsecret=" + corpsecret + "").execute().body();

        JSONObject hJsonObject = JSONUtil.parseObj(response);
        String access_token = (String) hJsonObject.get("access_token");
        System.out.println("企业微信数据推送所需Token--------------------------"+access_token);

        JSONObject zzfJsonObject = new JSONObject();
        zzfJsonObject.put("content","你的快递已到，请携带工卡前往邮件中心领取。\n出发前可查看<a href=\"http://work.weixin.qq.com\">邮件中心视频实况</a>，聪明避开排队。");
        /**
         * 组织接口数据
         * */
        Map<String,Object> zzfMap = new HashMap();
        zzfMap.put("touser",touser);
        zzfMap.put("toparty","");
        zzfMap.put("totag","");
        zzfMap.put("msgtype","text");
        zzfMap.put("agentid",agentid);
        zzfMap.put("text",zzfJsonObject);
        zzfMap.put("safe",0);
        zzfMap.put("enable_id_trans",0);
        zzfMap.put("enable_duplicate_check",0);
        zzfMap.put("duplicate_check_interval",1800);
        JSONObject fJsonObject = JSONUtil.parseObj(zzfMap);
        System.out.println(fJsonObject);
        String message = HttpRequest.post("https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token="+access_token)
                .body(String.valueOf(fJsonObject)).execute().body();

        System.out.println("企业微信数据推送返回信息-----------------------------------"+message);

    }
}
