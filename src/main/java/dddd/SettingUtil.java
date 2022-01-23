package dddd;


import cn.hutool.db.ds.DSFactory;
import cn.hutool.setting.Setting;
import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;

public class SettingUtil {

    private static String configFilePath ="D:/db.setting";

    public static DataSource getDs(String group) {
        Setting setting = new Setting(configFilePath);
        System.out.println(group);
        DruidDataSource dataSource = (DruidDataSource) DSFactory.create(setting).getDataSource(group);
        dataSource.setQueryTimeout(10);
        return (DataSource)dataSource;
    }

    public static void main(String[] args) {
        getDs("sjdj");
    }
}