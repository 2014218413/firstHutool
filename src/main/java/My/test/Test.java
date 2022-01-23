package My.test;

import cn.hutool.core.io.FileTypeUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.watch.WatchMonitor;
import cn.hutool.core.io.watch.Watcher;
import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import cn.hutool.setting.Setting;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.nio.file.WatchService;
import java.sql.SQLException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws SQLException {
        Setting setting = new Setting("db.setting");

        Db.use().insert(Entity.create("m1").set("id","1111").set("name","22222"));

        Db.use().execute("insert into m1 values(?,?)","测试Hutool","测试Hutool");

        System.out.println(setting.get("m1","name"));
        List<Entity> l = Db.use().query("select * from m1");
       l.stream().forEach(i -> {
           System.out.println(i.get("id"));
       });


        FileUtil.copy("D:\\WinRar","D:\\WinRar2",true);

        File file  = FileUtil.file("D:\\壁纸\\4a39d10f0c6f0394cb86d349b6d6f65.png");
        String type = FileTypeUtil.getType(file);
        System.out.println(type);

        File file1 = FileUtil.file("D:\\123.txt");

        WatchMonitor watchMonitor = WatchMonitor.create(file1,WatchMonitor.ENTRY_MODIFY);
        watchMonitor.setWatcher(new Watcher() {
            @Override
            public void onCreate(WatchEvent<?> watchEvent, Path path) {

            }

            @Override
            public void onModify(WatchEvent<?> watchEvent, Path path) {
                System.out.println("修改了-----------------------");
            }

            @Override
            public void onDelete(WatchEvent<?> watchEvent, Path path) {

            }

            @Override
            public void onOverflow(WatchEvent<?> watchEvent, Path path) {

            }
        });
        watchMonitor.setMaxDepth(3);
        watchMonitor.start();


    }

}
