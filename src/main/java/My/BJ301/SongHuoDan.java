package My.BJ301;

import java.util.List;

public class SongHuoDan {
    private String Number;
    private String OrderNumber;
    private String SunnyOrderNumber;
    private String DeliveryDate;

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        OrderNumber = orderNumber;
    }

    public String getSunnyOrderNumber() {
        return SunnyOrderNumber;
    }

    public void setSunnyOrderNumber(String sunnyOrderNumber) {
        SunnyOrderNumber = sunnyOrderNumber;
    }

    public String getDeliveryDate() {
        return DeliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        DeliveryDate = deliveryDate;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getDeliveryPerson() {
        return DeliveryPerson;
    }

    public void setDeliveryPerson(String deliveryPerson) {
        DeliveryPerson = deliveryPerson;
    }

    public String getDeliveryPhoneNumber() {
        return DeliveryPhoneNumber;
    }

    public void setDeliveryPhoneNumber(String deliveryPhoneNumber) {
        DeliveryPhoneNumber = deliveryPhoneNumber;
    }

    public String getLicensePlateNumber() {
        return LicensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        LicensePlateNumber = licensePlateNumber;
    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String driver) {
        Driver = driver;
    }

    public String getDriverPhoneNumber() {
        return DriverPhoneNumber;
    }

    public void setDriverPhoneNumber(String driverPhoneNumber) {
        DriverPhoneNumber = driverPhoneNumber;
    }

    public String getReceiver() {
        return Receiver;
    }

    public void setReceiver(String receiver) {
        Receiver = receiver;
    }

    public String getReceivePhoneNumber() {
        return ReceivePhoneNumber;
    }

    public void setReceivePhoneNumber(String receivePhoneNumber) {
        ReceivePhoneNumber = receivePhoneNumber;
    }

    public String getReceiveEmail() {
        return ReceiveEmail;
    }

    public void setReceiveEmail(String receiveEmail) {
        ReceiveEmail = receiveEmail;
    }

    public String getDeliveryAddress() {
        return DeliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        DeliveryAddress = deliveryAddress;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getShippingDescn() {
        return ShippingDescn;
    }

    public void setShippingDescn(String shippingDescn) {
        ShippingDescn = shippingDescn;
    }

    public String getContactDeptErpCode() {
        return ContactDeptErpCode;
    }

    public void setContactDeptErpCode(String contactDeptErpCode) {
        ContactDeptErpCode = contactDeptErpCode;
    }

    public String getPersonName() {
        return PersonName;
    }

    public void setPersonName(String personName) {
        PersonName = personName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public List<SongHuoDanMingXi> getDeliveryOrderDetails() {
        return DeliveryOrderDetails;
    }

    public void setDeliveryOrderDetails(List<SongHuoDanMingXi> deliveryOrderDetails) {
        DeliveryOrderDetails = deliveryOrderDetails;
    }

    private String CompanyName;
    private String DeliveryPerson;
    private String DeliveryPhoneNumber;
    private String LicensePlateNumber;
    private String Driver;
    private String DriverPhoneNumber;
    private String Receiver;
    private String ReceivePhoneNumber;
    private String ReceiveEmail;
    private String DeliveryAddress;
    private String Remark;
    private String ShippingDescn;
    private String ContactDeptErpCode;
    private String PersonName;
    private String PhoneNumber;
    private List<SongHuoDanMingXi> DeliveryOrderDetails;
}
