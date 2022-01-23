package dddd;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import org.nutz.dao.entity.annotation.*;

import java.util.Date;

@Table("T_SJDJ_XHDDXX")
public class T_sjdj_xhddxx {
    @Column
    private String creat_id;
    @Column
    private Date creattime;
    // @Column
    private String task_id;
    @Column
    @Default("0")
    private Integer updateflag;
    @Column
    private Date updatetime;
    @Column
    @Default("1")
    private Integer enable;
    @Column
    @Name
    @Prev(els = { @EL("uuid()") })
    private String id;
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
    private String company_id;
    @Column
    private String depart_name;
    @Column
    private String part_col;
    @Column
    private Double price;
    @Column
    private String ptwybm;
    @Column
    private String buyercode;
    @Column
    private String his_purchase_item_id;




    public T_sjdj_xhddxx() {

    }

    public T_sjdj_xhddxx(YPEDT_ORDER_ITEM order) {
        this.creattime = DateUtil.date();
        this.enable = 1;
        this.id = IdUtil.simpleUUID();
        this.recordid = order.getRecordid();
        this.order_id = order.getOrder_id();
        this.ordercode = order.getOrdercode();
        this.purchase_id = order.getPurchase_id();
        this.purchase_code = order.getPurchase_code();
        this.purchase_item_id = order.getPurchase_item_id();
        this.buyerorgid = order.getBuyerorgid();
        this.buyername = order.getBuyername();
        this.buyereasy = order.getBuyereasy();
        this.productid = order.getProductid();
        this.productcode = order.getProductcode();
        this.productname = order.getProductname();
        this.medicalmode = order.getMedicalmode();
        this.medicalspec = order.getMedicalspec();
        this.metricname = order.getMetricname();
        this.medicalid = order.getMedicalid();
        this.medicalname = order.getMedicalname();
        this.fatoryid = order.getFatoryid();
        this.factoryname = order.getFactoryname();
        this.requestqty = order.getRequestqty();
        this.createdate = DateUtil.date();
        this.orderremark = order.getOrderremark();
        this.remark = order.getRemark() + ";" + order.getWarehousename();
        this.warehousename = order.getWarehousename();
        this.degree = order.getDegree();
        this.sync_date = order.getSync_date();
        this.exp_flag = order.getExp_flag();
        this.map_flag = order.getMap_flag();
        this.sync_flag = order.getSync_flag();
        this.company_id = order.getCompany_id();
        this.depart_name = order.getDepart_name();
        this.part_col = order.getPart_col();
        this.price = order.getPrice();
        this.ptwybm = "dsadasdsadsa";
        this.buyercode = order.getBuyercode();
        /**2021-11-29新增获取这个字段*/
        this.his_purchase_item_id = order.getHis_purchase_item_id();
    }



    public String getHis_purchase_item_id() {
        return his_purchase_item_id;
    }

    public void setHis_purchase_item_id(String his_purchase_item_id) {
        this.his_purchase_item_id = his_purchase_item_id;
    }

    public String getCreat_id() {
        return creat_id;
    }

    public void setCreat_id(String creat_id) {
        this.creat_id = creat_id;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }

    public String getBuyercode() {
        return buyercode;
    }

    public void setBuyercode(String buyercode) {
        this.buyercode = buyercode;
    }

    public Integer getUpdateflag() {
        return updateflag;
    }

    public void setUpdateflag(Integer updateflag) {
        this.updateflag = updateflag;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode;
    }

    public String getPurchase_id() {
        return purchase_id;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPtwybm() {
        return ptwybm;
    }

    public void setPtwybm(String ptwybm) {
        this.ptwybm = ptwybm;
    }

    @Override
    public String toString() {
        return "T_sjdj_xhddxx [creat_id=" + creat_id + ", creattime=" + creattime + ", task_id=" + task_id
                + ", updateflag=" + updateflag + ", updatetime=" + updatetime + ", enable=" + enable + ", id=" + id
                + ", recordid=" + recordid + ", order_id=" + order_id + ", ordercode=" + ordercode + ", purchase_id="
                + purchase_id + ", purchase_code=" + purchase_code + ", purchase_item_id=" + purchase_item_id
                + ", buyerorgid=" + buyerorgid + ", buyername=" + buyername + ", buyereasy=" + buyereasy
                + ", productid=" + productid + ", productcode=" + productcode + ", productname=" + productname
                + ", medicalmode=" + medicalmode + ", medicalspec=" + medicalspec + ", metricname=" + metricname
                + ", medicalid=" + medicalid + ", medicalname=" + medicalname + ", fatoryid=" + fatoryid
                + ", factoryname=" + factoryname + ", requestqty=" + requestqty + ", createdate=" + createdate
                + ", orderremark=" + orderremark + ", remark=" + remark + ", warehousename=" + warehousename
                + ", degree=" + degree + ", sync_date=" + sync_date + ", exp_flag=" + exp_flag + ", map_flag="
                + map_flag + ", sync_flag=" + sync_flag + ", company_id=" + company_id + ", depart_name=" + depart_name
                + ", part_col=" + part_col + ", price=" + price + ", ptwybm=" + ptwybm + ", buyercode=" + buyercode
                + ", his_purchase_item_id=" + his_purchase_item_id + "]";
    }
}