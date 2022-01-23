package My.j8;

import java.util.*;

public class UseMyI {
    public void op (MyI myI,String name,String address) {
        System.out.println(myI.op(name,address));


    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
//        list.remove(0);
        list.replaceAll(i ->i);
        list.remove("3");
        list.remove(1);
        System.out.println(list.size());
        System.out.println(list);

        Map map  = new HashMap();
        map.put("1","1");
        map.put("2","2");
        map.remove("1");
        Set<Map.Entry> set = map.entrySet();
        set.forEach(i -> System.out.println(i.getValue()));

//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        System.out.println(map.size());
    }
}
