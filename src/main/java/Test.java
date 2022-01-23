import cn.hutool.db.ds.DSFactory;
import cn.hutool.setting.Setting;
import com.alibaba.druid.pool.DruidAbstractDataSource;
import com.alibaba.druid.pool.DruidDataSource;
import org.nutz.dao.Dao;
import org.nutz.dao.impl.NutDao;

import javax.sql.DataSource;
import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        /**
         * 人品
         * 绩效
         * A  B  C
         * A 3
         * B 5
         * C 5
         * */

        Ren A = new Ren("A",1,2);
        Ren B = new Ren("A",1,2);
        System.out.println("********************************************");
        String nnn = "A";
        System.out.println(A.getName()==nnn);
        System.out.println("********************************************");

        Ren C = new Ren("C",1,4);

        ArrayList<Ren> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);

        list.stream().sorted(new Comparator<Ren>() {
            @Override
            public int compare(Ren o1, Ren o2) {
               return (int) ((o1.getD1()+o1.getD2())-(o2.getD1()+o2.getD2()));
            }
        }).forEach(i -> {
            System.out.println(i.getName());
        });

//        int a = 0;
//        Integer integer = null;
//        System.out.println(integer);
//        System.out.println(a);

        int a = 5;
        int b = 5;
        System.out.println(a==b);
        double aa = 5.4;
        double bb = 5.4;
        System.out.println(aa==bb);
        Integer integer = new Integer(6);
        Integer integer2 = new Integer(6);
        Integer integer3 = 8;
        Integer integer4 = 8;
        System.out.println(integer.equals(integer2));
        System.out.println(integer==integer2);

        System.out.println(integer3==integer4);
        System.out.println(integer3.equals(integer4));

        int abb = 11;
        ArrayList arrayList = new ArrayList();
        arrayList.add(abb);
       arrayList.stream().forEach(i -> {
            System.out.println(i);
        });
    }
}
