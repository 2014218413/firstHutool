package My.BJ301;

public class SongHuoDanMingXi {
    private String RowId;
    private String ProductErpCode;
    private int Quantity;
    private String UnitName;
    private double Price;
    private String ProductionBatch;
    private String InvoiceNumber;
    private String ProductionDate;
    private String ExpirationDate;
    private String TraceCodes;
    private int PrepareQuantity;

    public int getPrepareQuantity() {
        return PrepareQuantity;
    }

    public void setPrepareQuantity(int prepareQuantity) {
        PrepareQuantity = prepareQuantity;
    }

    public String getRowId() {
        return RowId;
    }

    public void setRowId(String rowId) {
        RowId = rowId;
    }

    public String getProductErpCode() {
        return ProductErpCode;
    }

    public void setProductErpCode(String productErpCode) {
        ProductErpCode = productErpCode;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String getUnitName() {
        return UnitName;
    }

    public void setUnitName(String unitName) {
        UnitName = unitName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getProductionBatch() {
        return ProductionBatch;
    }

    public void setProductionBatch(String productionBatch) {
        ProductionBatch = productionBatch;
    }

    public String getInvoiceNumber() {
        return InvoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        InvoiceNumber = invoiceNumber;
    }

    public String getProductionDate() {
        return ProductionDate;
    }

    public void setProductionDate(String productionDate) {
        ProductionDate = productionDate;
    }

    public String getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        ExpirationDate = expirationDate;
    }

    public String getTraceCodes() {
        return TraceCodes;
    }

    public void setTraceCodes(String traceCodes) {
        TraceCodes = traceCodes;
    }
}
