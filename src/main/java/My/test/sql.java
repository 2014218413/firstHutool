package My.test;

import My.test.test3;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sql {



    public static final List<String> uesrname = Stream.of(
            "chao-gao",
            "chen-chen",
            "chen-jin",
            "fangxin-hou",
            "feng-zhang",
            "fu-chen",
            "gao-yi",
            "geidco",
            "han-jiang",
            "hanbing-xu",
            "hong-shen",
            "jian-wang",
            "jing-meng",
            "pengcheng-zhao",
            "rong-li",
            "shan-xu",
            "shengxiang-zhang",
            "shining-zhang",
            "su-bai",
            "teng-zhao",
            "wei-sun",
            "wei-wang1",
            "wei-wu",
            "wenhao-wang",
            "xiaotong-chen",
            "xiaoxiao-yu",
            "xin-tan",
            "xing-chen",
            "xinzhi-xu",
            "xiupeng-guan",
            "xuran-wang",
            "ya-wen",
            "yanfen-guo",
            "yang-zhao",
            "yangzi-wang",
            "yao-liu",
            "zhanghan",
            "zhangyu",
            "zhe-liu",
            "zhengxi-chen"
    ).collect(Collectors.toList());
    public static final List<String> name = Stream.of(
            "高超",
            "陈晨",
            "金晨",
            "侯芳鑫",
            "张峰",
            "陈孚",
            "高艺",
            "GEIDCO",
            "江涵",
            "徐韩冰",
            "申洪",
            "王健",
            "孟婧",
            "赵鹏程",
            "李蓉",
            "徐珊",
            "张胜祥",
            "张士宁",
            "白苏",
            "赵腾",
            "孙蔚",
            "王维",
            "邬炜",
            "王闻昊",
            "陈小彤",
            "余潇潇",
            "谭新",
            "陈星",
            "徐新智",
            "管秀鹏",
            "王旭冉",
            "文亚",
            "郭艳芬",
            "赵杨",
            "汪洋子",
            "刘耀",
            "张瀚",
            "张裕",
            "刘哲",
            "陈正曦"

    ).collect(Collectors.toList());

    public static void main(String[] args) {
        for (int i = 0; i <name.size() ; i++) {

            for (int j = 0; j < test3.list202007.size() ; j++) {
                String uuid = UUID.randomUUID().toString().replaceAll("-","");
                String Name=name.get(i);
                String username=uesrname.get(i);
                String time=test3.getTime(test3.list202007.get(j));

            }
            for (int j = 0; j <test3.list202008.size() ; j++) {

                String uuid = UUID.randomUUID().toString().replaceAll("-","");
                String Name=name.get(i);
                String username=uesrname.get(i);
                String time=test3.getTime(test3.list202008.get(j));

            }
            for (int j = 0; j <test3.list202009.size() ; j++) {

                String uuid = UUID.randomUUID().toString().replaceAll("-","");
                String Name=name.get(i);
                String username=uesrname.get(i);
                String time=test3.getTime(test3.list202009.get(j));

            }
            for (int j = 0; j <test3.list202010.size() ; j++) {

                String uuid = UUID.randomUUID().toString().replaceAll("-","");
                String Name=name.get(i);
                String username=uesrname.get(i);
                String time=test3.getTime(test3.list202010.get(j));

            }
            for (int j = 0; j <test3.list202011.size() ; j++) {

                String uuid = UUID.randomUUID().toString().replaceAll("-","");
                String Name=name.get(i);
                String username=uesrname.get(i);
                String time=test3.getTime(test3.list202011.get(j));

            }
            for (int j = 0; j <test3.list202012.size() ; j++) {

                String uuid = UUID.randomUUID().toString().replaceAll("-","");
                String Name=name.get(i);
                String username=uesrname.get(i);
                String time=test3.getTime(test3.list202012.get(j));

            }
            for (int j = 0; j <test3.list202101.size() ; j++) {

                String uuid = UUID.randomUUID().toString().replaceAll("-","");
                String Name=name.get(i);
                String username=uesrname.get(i);
                String time=test3.getTime(test3.list202101.get(j));

            }
            for (int j = 0; j <test3.list202102.size() ; j++) {

                String uuid = UUID.randomUUID().toString().replaceAll("-","");
                String Name=name.get(i);
                String username=uesrname.get(i);
                String time=test3.getTime(test3.list202102.get(j));

            }
            for (int j = 0; j <test3.list202103.size() ; j++) {

                String uuid = UUID.randomUUID().toString().replaceAll("-","");
                String Name=name.get(i);
                String username=uesrname.get(i);
                String time=test3.getTime(test3.list202103.get(j));

            }
            for (int j = 0; j <test3.list202104.size() ; j++) {

                String uuid = UUID.randomUUID().toString().replaceAll("-","");
                String Name=name.get(i);
                String username=uesrname.get(i);
                String time=test3.getTime(test3.list202104.get(j));

            }
            for (int j = 0; j <test3.list202105.size() ; j++) {

                String uuid = UUID.randomUUID().toString().replaceAll("-","");
                String Name=name.get(i);
                String username=uesrname.get(i);
                String time=test3.getTime(test3.list202105.get(j));

            }
            for (int j = 0; j <test3.list202106.size() ; j++) {
                String uuid = UUID.randomUUID().toString().replaceAll("-","");
                String Name=name.get(i);
                String username=uesrname.get(i);
                String time=test3.getTime(test3.list202106.get(j));

            }
            for (int j = 0; j <test3.list202107.size(); j++) {
                String uuid = UUID.randomUUID().toString().replaceAll("-","");
                String Name=name.get(i);
                String username=uesrname.get(i);
                String time=test3.getTime(test3.list202107.get(j));

            }
            for (int j = 0; j <test3.list202108.size(); j++) {
                String uuid = UUID.randomUUID().toString().replaceAll("-","");
                String Name=name.get(i);
                String username=uesrname.get(i);
                String time=test3.getTime(test3.list202108.get(j));

            }
            for (int j = 0; j <test3.list202109.size(); j++) {
                String uuid = UUID.randomUUID().toString().replaceAll("-","");
                String Name=name.get(i);
                String username=uesrname.get(i);
                String time=test3.getTime(test3.list202109.get(j));

            }

            for (int j = 0; j <test3.list202110.size(); j++) {
                String uuid = UUID.randomUUID().toString().replaceAll("-","");
                String Name=name.get(i);
                String username=uesrname.get(i);
                String time=test3.getTime(test3.list202110.get(j));

            }




        }
    }
}
