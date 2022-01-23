package My.BJ301;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

public class TestUser {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        String mess = "addasdasop";
        System.out.println(mess.replaceAll("op","*************"));


        System.out.println(mess.replace("a", "1111").replace("op","22222"));


        System.out.println(mess);


        JSONObject jsonObject = JSONUtil.parseObj("");
        JSONUtil.toJsonStr(jsonObject);

    }
}
