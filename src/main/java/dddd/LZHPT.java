package dddd;

import org.nutz.dao.Chain;
import org.nutz.dao.Cnd;
import org.nutz.dao.Dao;

import java.util.List;

public class LZHPT {
    /**
     *
     */

    private static Dao sjdj = DaoUtil.sjdj;

    public void pullDdxx () {
        // 查询易迅达YPEDT_ORDER_ITEM中down_flag标识为null的数据
        System.out.println(sjdj);
        List<YPEDT_ORDER_ITEM> list = sjdj.query(YPEDT_ORDER_ITEM.class, Cnd.where("down_flag", "is", null));
        for (YPEDT_ORDER_ITEM ypedtOrderItem : list) {
            // 将易迅达要货数据转换为平台要货并写入平台
            T_sjdj_xhddxx xhddxx = sjdj.insert(new T_sjdj_xhddxx(ypedtOrderItem));
            // 将平台要货转换为CMS要货并写入CMS
            sjdj.insert(new B2b_khyhjh(xhddxx));
            // 将易迅达对应数据的down_flag标识更新为1
            sjdj.update(YPEDT_ORDER_ITEM.class, Chain.make("down_flag", 1),
                    Cnd.where("recordid", "=", ypedtOrderItem.getRecordid()));
        }
    }
}
