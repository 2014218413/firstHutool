package dddd;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

import java.util.Date;

@Table("YPEDT_ORDER_ITEM")
public class YPEDT_ORDER_ITEM {
    @Column
    private String recordid;
    @Column
    private String order_id;
    @Column
    private String ordercode;
    @Column
    private String purchase_id;
    @Column
    private String purchase_code;
    @Column
    private String purchase_item_id;
    @Column
    private String buyerorgid;
    @Column
    private String buyername;
    @Column
    private String buyercode;
    @Column
    private String buyereasy;
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
    private String medicalid;
    @Column
    private String medicalname;
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
    private String orderremark;
    @Column
    private String remark;
    @Column
    private String warehousename;
    @Column
    private String degree;
    @Column
    private Date sync_date;
    @Column
    private String exp_flag;
    @Column
    private String map_flag;
    @Column
    private String sync_flag;
    @Column
    private String down_flag;
    @Column
    private String company_id;
    @Column
    private String depart_name;
    @Column
    private String part_col;
    /**2021-11-29增加这个字段*/
    @Column
    private String his_purchase_item_id;

    public String getHis_purchase_item_id() {
        return his_purchase_item_id;
    }

    public void setHis_purchase_item_id(String his_purchase_item_id) {
        this.his_purchase_item_id = his_purchase_item_id;
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

    public String getOrdercode() {
        return ordercode;
    }

    public String getDown_flag() {
        return down_flag;
    }

    public void setDown_flag(String down_flag) {
        this.down_flag = down_flag;
    }

    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode;
    }

    public String getPurchase_id() {
        return purchase_id;
    }

    public String getBuyercode() {
        return buyercode;
    }

    public void setBuyercode(String buyercode) {
        this.buyercode = buyercode;
    }

    public void setPurchase_id(String purchase_id) {
        this.purchase_id = purchase_id;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
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

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Date getSync_date() {
        return sync_date;
    }

    public void setSync_date(Date sync_date) {
        this.sync_date = sync_date;
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

    public String getPart_col() {
        return part_col;
    }

    public void setPart_col(String part_col) {
        this.part_col = part_col;
    }

    @Override
    public String toString() {
        return "Dpt_order_item{" + "recordid='" + recordid + '\'' + ", order_id='" + order_id + '\'' + ", ordercode='"
                + ordercode + '\'' + ", purchase_id='" + purchase_id + '\'' + ", purchase_code='" + purchase_code + '\''
                + ", purchase_item_id='" + purchase_item_id + '\'' + ", buyerorgid='" + buyerorgid + '\''
                + ", buyername='" + buyername + '\'' + ", buyereasy='" + buyereasy + '\'' + ", productid='" + productid
                + '\'' + ", productcode='" + productcode + '\'' + ", productname='" + productname + '\''
                + ", medicalmode='" + medicalmode + '\'' + ", medicalspec='" + medicalspec + '\'' + ", metricname='"
                + metricname + '\'' + ", medicalid='" + medicalid + '\'' + ", medicalname='" + medicalname + '\''
                + ", fatoryid='" + fatoryid + '\'' + ", factoryname='" + factoryname + '\'' + ", requestqty="
                + requestqty + ", price=" + price + ", createdate=" + createdate + ", orderremark='" + orderremark
                + '\'' + ", remark='" + remark + '\'' + ", warehousename='" + warehousename + '\'' + ", degree='"
                + degree + '\'' + ", sync_date=" + sync_date + ", exp_flag='" + exp_flag + '\'' + ", map_flag='"
                + map_flag + '\'' + ", sync_flag='" + sync_flag + '\'' + ", company_id='" + company_id + '\''
                + ", depart_name='" + depart_name + '\'' + ", part_col='" + part_col + '\'' + '}';
    }
}