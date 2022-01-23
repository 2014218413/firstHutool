package dddd;

import org.nutz.dao.Dao;
import org.nutz.dao.impl.NutDao;

public class DaoUtil {
    public static Dao sjdj;
    static {
        try {
            sjdj = new NutDao(SettingUtil.getDs("sjdj"));

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
