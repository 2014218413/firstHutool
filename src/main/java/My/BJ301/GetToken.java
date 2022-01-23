package My.BJ301;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.XmlUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import cn.hutool.setting.Setting;
import com.alibaba.fastjson.JSONPObject;
import org.w3c.dom.Document;

import javax.xml.xpath.XPathConstants;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GetToken {
    public static void main(String[] args) {

        /**获取配置文件参数*/
        String path = System.getProperty("user.dir")+"/CONFIG/ZHPT/ZHPT_CONFIG.xml";
        Document document = XmlUtil.readXML(path);
        String client_id = (String) XmlUtil.getByXPath("//Token_301/client_id",document, XPathConstants.STRING);
        String client_secret = (String) XmlUtil.getByXPath("//Token_301/client_secret",document, XPathConstants.STRING);

//        Setting setting = new Setting("D:/getToken.setting", CharsetUtil.CHARSET_UTF_8, true);

        Map map = new HashMap();
        map.put("client_id",client_id);
        map.put("client_secret",client_secret);
        map.put("grant_type","client_credentials");
        map.put("scope","NT");

        String message = HttpRequest.post("https://api.nuttrack.cn/connect/token")
                .form(map)
                .contentType("application/x-www-form-urlencoded").execute().body();

        JSONObject jsonObject = JSONUtil.parseObj(message);

        if (jsonObject.get("access_token") != null) {
            String token_type = jsonObject.getStr("token_type");
            String access_token = jsonObject.getStr("access_token");
            String scope = jsonObject.getStr("scope");
            Integer expires_in = jsonObject.getInt("expires_in");

            System.out.println(access_token);
            System.out.println(expires_in);
        }
        else {
            String error = jsonObject.getStr("error");

            System.out.println(error);
    }

    }
}
