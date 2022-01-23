//package My.z;
//
//import cn.hutool.json.JSONObject;
//import cn.hutool.json.JSONUtil;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Teeee {
//
//    public static void main(String[] args) {
//        List list = new ArrayList();
//        Details details = new Details();
//        details.setDddf("dassa");
//        details.setSssss("dasdas");
//        list.add(details);
//
//        List list1 = new ArrayList();
//        Data data = new Data();
//        data.setSss("asfsfsa");
//        data.setList(list);
//        list1.add(data);
//
//        Body body = new Body();
//        body.setList(list1);
//
//        Header header = new Header();
//        header.setA("a");
//        header.setB("b");
//
//
//        All all = new All();
//        all.setBody(body);
//        all.setHeader(header);
//
//        String a = JSONUtil.toJsonStr(all);
//        System.out.println(a);
//
//        JSONObject jsonObject = JSONUtil.parseObj(a);
//        String b = JSONUtil.toJsonStr(JSONUtil.parseObj(jsonObject.get("body")).get("list"));
//
//        JSONObject jsonObject1 = JSONUtil.parseObj(jsonObject.get("body")).set("list",b);
//
//
//        jsonObject.set("body",jsonObject1);
//        String e = JSONUtil.toJsonStr(jsonObject);
//        System.out.println(e);
//
//        System.out.println("==================================================================");
//        String [] s = {"zxg","zzh","wm","ltx","qz","slk","dx","j","zd"};
//        int [] sp = {5,3,1,2,2,1,2,5,1};
//
////        Arrays.asList(s).stream().forEach(i -> {
////            System.out.println(i);
////        });
//
//        System.out.println(Arrays.stream(sp).sum());
//
//    }
//}
