package My.json;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.*;

public class TestJSon {
    public static void main(String[] args) {
        List list = Arrays.asList("dasd","dasdsa","a");
        list.stream().forEach(i -> {
            new Thread(""+i) {
                @Override
                public void run() {

                    System.out.println(i+"**********"+Thread.currentThread().getName());
//                    try {
////                        Thread.sleep(1000_000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                }
            }.start();
        });

        String [] strings = {"a","b","c","d"};


        System.out.println(JSON.toJSONString(strings));


        List list1 = new ArrayList();
        Map map = new HashMap();
        map.put("dd","ff");
        list1.add(map);
        Caaa caaa = new Caaa();
        caaa.setName("vv");
        caaa.setAge(100);
        list1.add(caaa);
        String aaa = JSON.toJSONString(list1);
        System.out.println(aaa);
        System.out.println(map);

    }
}
