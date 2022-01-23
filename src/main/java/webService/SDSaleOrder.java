package webService;

import java.util.Date;

public class SDSaleOrder {
    private String SalesOrderId;
    private String SalesOrderIx;
    private String SalesDate;
    private String ExpectedDate;
    private String PurchaseOrderId;
    private String PurchaseOrderIx;
    private String SourceOrderId;
    private String SourceOrderIx;
    private String PurchaseId;
    private String ReceiverId;
    private String DistributionId;
    private String FlowControlCode;
    private String StorehouseId;
    private String StorehouseAdress;
    private String OrderType;
    private String MaterialType;
    private String MaterialId;
    private String MaterialName;
    private String TradeName;
    private String CommonName;
    private String TypeName;
    private String ClassName;
    private String Specs;
    private String Dosage;
    private String PackQuantity;
    private String ManufacturerCode;
    private String ManufacturerName;
    private String PermitNo;
    private String StorageConditions;
    private Double Amount;
    private String AmountUnit;
    private Double Price;
    private Double TradePrice;
    private Double RetailPrice;
    private String InvoiceNum;
    private String InvoiceDate;
    private String InvoicePrice;
    private String BarcodeCode;
    private String OrderBarcodeCode;
    private String MaterialLot;
    private String ProductionDate;
    private String ValidityDate;
    private String Operator;
    private Date OperateDate;
    private int ItemBackup1;
    private String ItemBackup2;
    private String ItemBackup3;
    private String ItemRemark;
    private String ReMark;
    private String YInvoiceNo;
    private String YInvoiceCode;
    private String YInvoiceLot;
    private Date YInvoiceDate;
    private String YInvoicePrice;
    private String YInvoiceAoumt;
    private String YInvoiceSJF;
    private String YInvoiceKJF;
    private String EInvoiceNo;
    private String EInvoiceCode;
    private String EInvoiceLot;
    private Date EInvoiceDate;
    private String EInvoicePrice;
    private String EInvoiceAoumt;
    private String EInvoiceJSF;
    private String EInvoiceKJF;
    private String SInvoiceNo;
    private String SInvoiceCode;
    private String SInvoiceLot;
    private Date SInvoiceDate;
    private String SInvoicePrice;
    private String SInvoiceAoumt;
    private String SInvoiceJSF;
    private String SInvoiceKJF;

    public SDSaleOrder(String salesOrderId, String salesOrderIx, String salesDate, String expectedDate, String purchaseOrderId, String purchaseOrderIx, String sourceOrderId, String sourceOrderIx, String purchaseId, String receiverId, String distributionId, String flowControlCode, String storehouseId, String storehouseAdress, String orderType, String materialType, String materialId, String materialName, String tradeName, String commonName, String typeName, String className, String specs, String dosage, String packQuantity, String manufacturerCode, String manufacturerName, String permitNo, String storageConditions, Double amount, String amountUnit, Double price, Double tradePrice, Double retailPrice, String invoiceNum, String invoiceDate, String invoicePrice, String barcodeCode, String orderBarcodeCode, String materialLot, String productionDate, String validityDate, String operator, Date operateDate, int itemBackup1, String itemBackup2, String itemBackup3, String itemRemark, String reMark, String YInvoiceNo, String YInvoiceCode, String YInvoiceLot, Date YInvoiceDate, String YInvoicePrice, String YInvoiceAoumt, String YInvoiceSJF, String YInvoiceKJF, String EInvoiceNo, String EInvoiceCode, String EInvoiceLot, Date EInvoiceDate, String EInvoicePrice, String EInvoiceAoumt, String EInvoiceJSF, String EInvoiceKJF, String SInvoiceNo, String SInvoiceCode, String SInvoiceLot, Date SInvoiceDate, String SInvoicePrice, String SInvoiceAoumt, String SInvoiceJSF, String SInvoiceKJF) {
        SalesOrderId = salesOrderId;
        SalesOrderIx = salesOrderIx;
        SalesDate = salesDate;
        ExpectedDate = expectedDate;
        PurchaseOrderId = purchaseOrderId;
        PurchaseOrderIx = purchaseOrderIx;
        SourceOrderId = sourceOrderId;
        SourceOrderIx = sourceOrderIx;
        PurchaseId = purchaseId;
        ReceiverId = receiverId;
        DistributionId = distributionId;
        FlowControlCode = flowControlCode;
        StorehouseId = storehouseId;
        StorehouseAdress = storehouseAdress;
        OrderType = orderType;
        MaterialType = materialType;
        MaterialId = materialId;
        MaterialName = materialName;
        TradeName = tradeName;
        CommonName = commonName;
        TypeName = typeName;
        ClassName = className;
        Specs = specs;
        Dosage = dosage;
        PackQuantity = packQuantity;
        ManufacturerCode = manufacturerCode;
        ManufacturerName = manufacturerName;
        PermitNo = permitNo;
        StorageConditions = storageConditions;
        Amount = amount;
        AmountUnit = amountUnit;
        Price = price;
        TradePrice = tradePrice;
        RetailPrice = retailPrice;
        InvoiceNum = invoiceNum;
        InvoiceDate = invoiceDate;
        InvoicePrice = invoicePrice;
        BarcodeCode = barcodeCode;
        OrderBarcodeCode = orderBarcodeCode;
        MaterialLot = materialLot;
        ProductionDate = productionDate;
        ValidityDate = validityDate;
        Operator = operator;
        OperateDate = operateDate;
        ItemBackup1 = itemBackup1;
        ItemBackup2 = itemBackup2;
        ItemBackup3 = itemBackup3;
        ItemRemark = itemRemark;
        ReMark = reMark;
        this.YInvoiceNo = YInvoiceNo;
        this.YInvoiceCode = YInvoiceCode;
        this.YInvoiceLot = YInvoiceLot;
        this.YInvoiceDate = YInvoiceDate;
        this.YInvoicePrice = YInvoicePrice;
        this.YInvoiceAoumt = YInvoiceAoumt;
        this.YInvoiceSJF = YInvoiceSJF;
        this.YInvoiceKJF = YInvoiceKJF;
        this.EInvoiceNo = EInvoiceNo;
        this.EInvoiceCode = EInvoiceCode;
        this.EInvoiceLot = EInvoiceLot;
        this.EInvoiceDate = EInvoiceDate;
        this.EInvoicePrice = EInvoicePrice;
        this.EInvoiceAoumt = EInvoiceAoumt;
        this.EInvoiceJSF = EInvoiceJSF;
        this.EInvoiceKJF = EInvoiceKJF;
        this.SInvoiceNo = SInvoiceNo;
        this.SInvoiceCode = SInvoiceCode;
        this.SInvoiceLot = SInvoiceLot;
        this.SInvoiceDate = SInvoiceDate;
        this.SInvoicePrice = SInvoicePrice;
        this.SInvoiceAoumt = SInvoiceAoumt;
        this.SInvoiceJSF = SInvoiceJSF;
        this.SInvoiceKJF = SInvoiceKJF;
    }

    public String getSalesOrderId() {
        return SalesOrderId;
    }

    public void setSalesOrderId(String salesOrderId) {
        SalesOrderId = salesOrderId;
    }

    public String getSalesOrderIx() {
        return SalesOrderIx;
    }

    public void setSalesOrderIx(String salesOrderIx) {
        SalesOrderIx = salesOrderIx;
    }

    public String getSalesDate() {
        return SalesDate;
    }

    public void setSalesDate(String salesDate) {
        SalesDate = salesDate;
    }

    public String getExpectedDate() {
        return ExpectedDate;
    }

    public void setExpectedDate(String expectedDate) {
        ExpectedDate = expectedDate;
    }

    public String getPurchaseOrderId() {
        return PurchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId) {
        PurchaseOrderId = purchaseOrderId;
    }

    public String getPurchaseOrderIx() {
        return PurchaseOrderIx;
    }

    public void setPurchaseOrderIx(String purchaseOrderIx) {
        PurchaseOrderIx = purchaseOrderIx;
    }

    public String getSourceOrderId() {
        return SourceOrderId;
    }

    public void setSourceOrderId(String sourceOrderId) {
        SourceOrderId = sourceOrderId;
    }

    public String getSourceOrderIx() {
        return SourceOrderIx;
    }

    public void setSourceOrderIx(String sourceOrderIx) {
        SourceOrderIx = sourceOrderIx;
    }

    public String getPurchaseId() {
        return PurchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        PurchaseId = purchaseId;
    }

    public String getReceiverId() {
        return ReceiverId;
    }

    public void setReceiverId(String receiverId) {
        ReceiverId = receiverId;
    }

    public String getDistributionId() {
        return DistributionId;
    }

    public void setDistributionId(String distributionId) {
        DistributionId = distributionId;
    }

    public String getFlowControlCode() {
        return FlowControlCode;
    }

    public void setFlowControlCode(String flowControlCode) {
        FlowControlCode = flowControlCode;
    }

    public String getStorehouseId() {
        return StorehouseId;
    }

    public void setStorehouseId(String storehouseId) {
        StorehouseId = storehouseId;
    }

    public String getStorehouseAdress() {
        return StorehouseAdress;
    }

    public void setStorehouseAdress(String storehouseAdress) {
        StorehouseAdress = storehouseAdress;
    }

    public String getOrderType() {
        return OrderType;
    }

    public void setOrderType(String orderType) {
        OrderType = orderType;
    }

    public String getMaterialType() {
        return MaterialType;
    }

    public void setMaterialType(String materialType) {
        MaterialType = materialType;
    }

    public String getMaterialId() {
        return MaterialId;
    }

    public void setMaterialId(String materialId) {
        MaterialId = materialId;
    }

    public String getMaterialName() {
        return MaterialName;
    }

    public void setMaterialName(String materialName) {
        MaterialName = materialName;
    }

    public String getTradeName() {
        return TradeName;
    }

    public void setTradeName(String tradeName) {
        TradeName = tradeName;
    }

    public String getCommonName() {
        return CommonName;
    }

    public void setCommonName(String commonName) {
        CommonName = commonName;
    }

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String typeName) {
        TypeName = typeName;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getSpecs() {
        return Specs;
    }

    public void setSpecs(String specs) {
        Specs = specs;
    }

    public String getDosage() {
        return Dosage;
    }

    public void setDosage(String dosage) {
        Dosage = dosage;
    }

    public String getPackQuantity() {
        return PackQuantity;
    }

    public void setPackQuantity(String packQuantity) {
        PackQuantity = packQuantity;
    }

    public String getManufacturerCode() {
        return ManufacturerCode;
    }

    public void setManufacturerCode(String manufacturerCode) {
        ManufacturerCode = manufacturerCode;
    }

    public String getManufacturerName() {
        return ManufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        ManufacturerName = manufacturerName;
    }

    public String getPermitNo() {
        return PermitNo;
    }

    public void setPermitNo(String permitNo) {
        PermitNo = permitNo;
    }

    public String getStorageConditions() {
        return StorageConditions;
    }

    public void setStorageConditions(String storageConditions) {
        StorageConditions = storageConditions;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public String getAmountUnit() {
        return AmountUnit;
    }

    public void setAmountUnit(String amountUnit) {
        AmountUnit = amountUnit;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Double getTradePrice() {
        return TradePrice;
    }

    public void setTradePrice(Double tradePrice) {
        TradePrice = tradePrice;
    }

    public Double getRetailPrice() {
        return RetailPrice;
    }

    public void setRetailPrice(Double retailPrice) {
        RetailPrice = retailPrice;
    }

    public String getInvoiceNum() {
        return InvoiceNum;
    }

    public void setInvoiceNum(String invoiceNum) {
        InvoiceNum = invoiceNum;
    }

    public String getInvoiceDate() {
        return InvoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        InvoiceDate = invoiceDate;
    }

    public String getInvoicePrice() {
        return InvoicePrice;
    }

    public void setInvoicePrice(String invoicePrice) {
        InvoicePrice = invoicePrice;
    }

    public String getBarcodeCode() {
        return BarcodeCode;
    }

    public void setBarcodeCode(String barcodeCode) {
        BarcodeCode = barcodeCode;
    }

    public String getOrderBarcodeCode() {
        return OrderBarcodeCode;
    }

    public void setOrderBarcodeCode(String orderBarcodeCode) {
        OrderBarcodeCode = orderBarcodeCode;
    }

    public String getMaterialLot() {
        return MaterialLot;
    }

    public void setMaterialLot(String materialLot) {
        MaterialLot = materialLot;
    }

    public String getProductionDate() {
        return ProductionDate;
    }

    public void setProductionDate(String productionDate) {
        ProductionDate = productionDate;
    }

    public String getValidityDate() {
        return ValidityDate;
    }

    public void setValidityDate(String validityDate) {
        ValidityDate = validityDate;
    }

    public String getOperator() {
        return Operator;
    }

    public void setOperator(String operator) {
        Operator = operator;
    }

    public Date getOperateDate() {
        return OperateDate;
    }

    public void setOperateDate(Date operateDate) {
        OperateDate = operateDate;
    }

    public int getItemBackup1() {
        return ItemBackup1;
    }

    public void setItemBackup1(int itemBackup1) {
        ItemBackup1 = itemBackup1;
    }

    public String getItemBackup2() {
        return ItemBackup2;
    }

    public void setItemBackup2(String itemBackup2) {
        ItemBackup2 = itemBackup2;
    }

    public String getItemBackup3() {
        return ItemBackup3;
    }

    public void setItemBackup3(String itemBackup3) {
        ItemBackup3 = itemBackup3;
    }

    public String getItemRemark() {
        return ItemRemark;
    }

    public void setItemRemark(String itemRemark) {
        ItemRemark = itemRemark;
    }

    public String getReMark() {
        return ReMark;
    }

    public void setReMark(String reMark) {
        ReMark = reMark;
    }

    public String getYInvoiceNo() {
        return YInvoiceNo;
    }

    public void setYInvoiceNo(String YInvoiceNo) {
        this.YInvoiceNo = YInvoiceNo;
    }

    public String getYInvoiceCode() {
        return YInvoiceCode;
    }

    public void setYInvoiceCode(String YInvoiceCode) {
        this.YInvoiceCode = YInvoiceCode;
    }

    public String getYInvoiceLot() {
        return YInvoiceLot;
    }

    public void setYInvoiceLot(String YInvoiceLot) {
        this.YInvoiceLot = YInvoiceLot;
    }

    public Date getYInvoiceDate() {
        return YInvoiceDate;
    }

    public void setYInvoiceDate(Date YInvoiceDate) {
        this.YInvoiceDate = YInvoiceDate;
    }

    public String getYInvoicePrice() {
        return YInvoicePrice;
    }

    public void setYInvoicePrice(String YInvoicePrice) {
        this.YInvoicePrice = YInvoicePrice;
    }

    public String getYInvoiceAoumt() {
        return YInvoiceAoumt;
    }

    public void setYInvoiceAoumt(String YInvoiceAoumt) {
        this.YInvoiceAoumt = YInvoiceAoumt;
    }

    public String getYInvoiceSJF() {
        return YInvoiceSJF;
    }

    public void setYInvoiceSJF(String YInvoiceSJF) {
        this.YInvoiceSJF = YInvoiceSJF;
    }

    public String getYInvoiceKJF() {
        return YInvoiceKJF;
    }

    public void setYInvoiceKJF(String YInvoiceKJF) {
        this.YInvoiceKJF = YInvoiceKJF;
    }

    public String getEInvoiceNo() {
        return EInvoiceNo;
    }

    public void setEInvoiceNo(String EInvoiceNo) {
        this.EInvoiceNo = EInvoiceNo;
    }

    public String getEInvoiceCode() {
        return EInvoiceCode;
    }

    public void setEInvoiceCode(String EInvoiceCode) {
        this.EInvoiceCode = EInvoiceCode;
    }

    public String getEInvoiceLot() {
        return EInvoiceLot;
    }

    public void setEInvoiceLot(String EInvoiceLot) {
        this.EInvoiceLot = EInvoiceLot;
    }

    public Date getEInvoiceDate() {
        return EInvoiceDate;
    }

    public void setEInvoiceDate(Date EInvoiceDate) {
        this.EInvoiceDate = EInvoiceDate;
    }

    public String getEInvoicePrice() {
        return EInvoicePrice;
    }

    public void setEInvoicePrice(String EInvoicePrice) {
        this.EInvoicePrice = EInvoicePrice;
    }

    public String getEInvoiceAoumt() {
        return EInvoiceAoumt;
    }

    public void setEInvoiceAoumt(String EInvoiceAoumt) {
        this.EInvoiceAoumt = EInvoiceAoumt;
    }

    public String getEInvoiceJSF() {
        return EInvoiceJSF;
    }

    public void setEInvoiceJSF(String EInvoiceJSF) {
        this.EInvoiceJSF = EInvoiceJSF;
    }

    public String getEInvoiceKJF() {
        return EInvoiceKJF;
    }

    public void setEInvoiceKJF(String EInvoiceKJF) {
        this.EInvoiceKJF = EInvoiceKJF;
    }

    public String getSInvoiceNo() {
        return SInvoiceNo;
    }

    public void setSInvoiceNo(String SInvoiceNo) {
        this.SInvoiceNo = SInvoiceNo;
    }

    public String getSInvoiceCode() {
        return SInvoiceCode;
    }

    public void setSInvoiceCode(String SInvoiceCode) {
        this.SInvoiceCode = SInvoiceCode;
    }

    public String getSInvoiceLot() {
        return SInvoiceLot;
    }

    public void setSInvoiceLot(String SInvoiceLot) {
        this.SInvoiceLot = SInvoiceLot;
    }

    public Date getSInvoiceDate() {
        return SInvoiceDate;
    }

    public void setSInvoiceDate(Date SInvoiceDate) {
        this.SInvoiceDate = SInvoiceDate;
    }

    public String getSInvoicePrice() {
        return SInvoicePrice;
    }

    public void setSInvoicePrice(String SInvoicePrice) {
        this.SInvoicePrice = SInvoicePrice;
    }

    public String getSInvoiceAoumt() {
        return SInvoiceAoumt;
    }

    public void setSInvoiceAoumt(String SInvoiceAoumt) {
        this.SInvoiceAoumt = SInvoiceAoumt;
    }

    public String getSInvoiceJSF() {
        return SInvoiceJSF;
    }

    public void setSInvoiceJSF(String SInvoiceJSF) {
        this.SInvoiceJSF = SInvoiceJSF;
    }

    public String getSInvoiceKJF() {
        return SInvoiceKJF;
    }

    public void setSInvoiceKJF(String SInvoiceKJF) {
        this.SInvoiceKJF = SInvoiceKJF;
    }
}
