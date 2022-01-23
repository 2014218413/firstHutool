package dddd;

import cn.hutool.core.date.DateUtil;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;

import java.util.Date;

@Table("B2B_KHYHJH")
public class B2b_khyhjh {
    @Column
    private String ordercode;
    @Name
    private String recordid;
    @Column
    private String order_id;
    @Column
    private String purchase_code;
    @Column
    private String purchase_item_id;
    @Column
    private String buyerorgid;
    @Column
    private String buyername;
    @Column
    private String buyereasy;
    @Column
    private String medicalid;
    @Column
    private String medicalname;
    @Column
    private String productid;
    @Column
    private String productcode;
    @Column
    private String productname;
    @Column
    private String medicalmode;
    @Column
    private String medicalspec;
    @Column
    private String metricname;
    @Column
    private String fatoryid;
    @Column
    private String factoryname;
    @Column
    private Integer requestqty;
    @Column
    private Double price;
    @Column
    private Date createdate;
    @Column
    private Date sync_date;
    @Column
    private String degree;
    @Column
    private String orderremark;
    @Column
    private String remark;
    @Column
    private String warehousename;
    @Column
    private String exp_flag;
    @Column
    private String map_flag;
    @Column
    private String sync_flag;
    @Column
    private String company_id;
    @Column
    private String depart_name;
    @Column
    private String contract_type;
    @Column
    private String finish_flage;
    @Column
    private String buyercode;
    @Column
    private String his_purchase_item_id;
    @Column
    private String buyer_type;
    @Column
    private String part_col;
    @Column
    private Date expdate;

    public B2b_khyhjh() {
    }

    public B2b_khyhjh(T_sjdj_xhddxx xhddxx) {
        this.ordercode = xhddxx.getOrdercode();
        //this.recordid = xhddxx.getPtwybm();
        this.recordid = xhddxx.getRecordid();//20211125修改医迅达要货订单明细编码
        this.order_id = xhddxx.getOrder_id();
        this.purchase_code = xhddxx.getPurchase_code();
        this.purchase_item_id = xhddxx.getPurchase_item_id();
        this.buyerorgid = xhddxx.getBuyerorgid();
        this.buyername = xhddxx.getBuyername();
        this.buyereasy = xhddxx.getBuyereasy();
        this.medicalid = xhddxx.getMedicalid();
        this.medicalname = xhddxx.getMedicalname();
        this.productid = xhddxx.getProductid();
        this.productcode = xhddxx.getProductcode();
        this.productname = xhddxx.getProductname();
        this.medicalmode = xhddxx.getMedicalmode();
        this.medicalspec = xhddxx.getMedicalspec();
        this.metricname = xhddxx.getMetricname();
        this.fatoryid = xhddxx.getFatoryid();
        this.factoryname = xhddxx.getFactoryname();
        this.requestqty = xhddxx.getRequestqty();
        this.price = xhddxx.getPrice();
        this.createdate = DateUtil.date();
        this.sync_date = xhddxx.getSync_date();
        this.degree = xhddxx.getDegree();
        this.orderremark = xhddxx.getOrderremark();
        this.remark = xhddxx.getRemark();
        this.warehousename = xhddxx.getWarehousename();
        this.exp_flag = xhddxx.getExp_flag();
        this.map_flag = xhddxx.getMap_flag();
        this.sync_flag = xhddxx.getSync_flag();
        this.company_id = xhddxx.getCompany_id();
        this.depart_name = xhddxx.getDepart_name();
        // this.contract_type = xhddxx.getcon;
        // this.finish_flage = xhddxx.
        this.buyercode = xhddxx.getBuyercode();
        this.his_purchase_item_id = xhddxx.getHis_purchase_item_id();
        // this.buyer_type = xhddxx.getCompany_id();
        this.part_col = xhddxx.getPart_col();
    }

    public String getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode;
    }

    public String getRecordid() {
        return recordid;
    }

    public void setRecordid(String recordid) {
        this.recordid = recordid;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getPurchase_code() {
        return purchase_code;
    }

    public void setPurchase_code(String purchase_code) {
        this.purchase_code = purchase_code;
    }

    public String getPurchase_item_id() {
        return purchase_item_id;
    }

    public void setPurchase_item_id(String purchase_item_id) {
        this.purchase_item_id = purchase_item_id;
    }

    public String getBuyerorgid() {
        return buyerorgid;
    }

    public void setBuyerorgid(String buyerorgid) {
        this.buyerorgid = buyerorgid;
    }

    public String getBuyername() {
        return buyername;
    }

    public void setBuyername(String buyername) {
        this.buyername = buyername;
    }

    public String getBuyereasy() {
        return buyereasy;
    }

    public void setBuyereasy(String buyereasy) {
        this.buyereasy = buyereasy;
    }

    public String getMedicalid() {
        return medicalid;
    }

    public void setMedicalid(String medicalid) {
        this.medicalid = medicalid;
    }

    public String getMedicalname() {
        return medicalname;
    }

    public void setMedicalname(String medicalname) {
        this.medicalname = medicalname;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getMedicalmode() {
        return medicalmode;
    }

    public void setMedicalmode(String medicalmode) {
        this.medicalmode = medicalmode;
    }

    public String getMedicalspec() {
        return medicalspec;
    }

    public void setMedicalspec(String medicalspec) {
        this.medicalspec = medicalspec;
    }

    public String getMetricname() {
        return metricname;
    }

    public void setMetricname(String metricname) {
        this.metricname = metricname;
    }

    public String getFatoryid() {
        return fatoryid;
    }

    public void setFatoryid(String fatoryid) {
        this.fatoryid = fatoryid;
    }

    public String getFactoryname() {
        return factoryname;
    }

    public void setFactoryname(String factoryname) {
        this.factoryname = factoryname;
    }

    public Integer getRequestqty() {
        return requestqty;
    }

    public void setRequestqty(Integer requestqty) {
        this.requestqty = requestqty;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getSync_date() {
        return sync_date;
    }

    public void setSync_date(Date sync_date) {
        this.sync_date = sync_date;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getOrderremark() {
        return orderremark;
    }

    public void setOrderremark(String orderremark) {
        this.orderremark = orderremark;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getWarehousename() {
        return warehousename;
    }

    public void setWarehousename(String warehousename) {
        this.warehousename = warehousename;
    }

    public String getExp_flag() {
        return exp_flag;
    }

    public void setExp_flag(String exp_flag) {
        this.exp_flag = exp_flag;
    }

    public String getMap_flag() {
        return map_flag;
    }

    public void setMap_flag(String map_flag) {
        this.map_flag = map_flag;
    }

    public String getSync_flag() {
        return sync_flag;
    }

    public void setSync_flag(String sync_flag) {
        this.sync_flag = sync_flag;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getDepart_name() {
        return depart_name;
    }

    public void setDepart_name(String depart_name) {
        this.depart_name = depart_name;
    }

    public String getContract_type() {
        return contract_type;
    }

    public void setContract_type(String contract_type) {
        this.contract_type = contract_type;
    }

    public String getFinish_flage() {
        return finish_flage;
    }

    public void setFinish_flage(String finish_flage) {
        this.finish_flage = finish_flage;
    }

    public String getBuyercode() {
        return buyercode;
    }

    public void setBuyercode(String buyercode) {
        this.buyercode = buyercode;
    }

    public String getHis_purchase_item_id() {
        return his_purchase_item_id;
    }

    public void setHis_purchase_item_id(String his_purchase_item_id) {
        this.his_purchase_item_id = his_purchase_item_id;
    }

    public String getBuyer_type() {
        return buyer_type;
    }

    public void setBuyer_type(String buyer_type) {
        this.buyer_type = buyer_type;
    }

    public String getPart_col() {
        return part_col;
    }

    public void setPart_col(String part_col) {
        this.part_col = part_col;
    }

    public Date getExpdate() {
        return expdate;
    }

    public void setExpdate(Date expdate) {
        this.expdate = expdate;
    }

    @Override
    public String toString() {
        return "B2b_khyhjh{" + "ordercode='" + ordercode + '\'' + ", recordid='" + recordid + '\'' + ", order_id='"
                + order_id + '\'' + ", purchase_code='" + purchase_code + '\'' + ", purchase_item_id='"
                + purchase_item_id + '\'' + ", buyerorgid='" + buyerorgid + '\'' + ", buyername='" + buyername + '\''
                + ", buyereasy='" + buyereasy + '\'' + ", medicalid='" + medicalid + '\'' + ", medicalname='"
                + medicalname + '\'' + ", productid='" + productid + '\'' + ", productcode='" + productcode + '\''
                + ", productname='" + productname + '\'' + ", medicalmode='" + medicalmode + '\'' + ", medicalspec='"
                + medicalspec + '\'' + ", metricname='" + metricname + '\'' + ", fatoryid='" + fatoryid + '\''
                + ", factoryname='" + factoryname + '\'' + ", requestqty=" + requestqty + ", price=" + price
                + ", createdate=" + createdate + ", sync_date=" + sync_date + ", degree='" + degree + '\''
                + ", orderremark='" + orderremark + '\'' + ", remark='" + remark + '\'' + ", warehousename='"
                + warehousename + '\'' + ", exp_flag='" + exp_flag + '\'' + ", map_flag='" + map_flag + '\''
                + ", sync_flag='" + sync_flag + '\'' + ", company_id='" + company_id + '\'' + ", depart_name='"
                + depart_name + '\'' + ", contract_type='" + contract_type + '\'' + ", finish_flage='" + finish_flage
                + '\'' + ", buyercode='" + buyercode + '\'' + ", his_purchase_item_id='" + his_purchase_item_id + '\''
                + ", buyer_type='" + buyer_type + '\'' + ", part_col='" + part_col + '\'' + ", expdate=" + expdate
                + '}';
    }
}