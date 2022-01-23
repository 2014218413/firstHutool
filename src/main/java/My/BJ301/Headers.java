package My.BJ301;

public class Headers {
    private String ContractNo;
    private String AppID;
    private String TranObject;
    private String Action;

    public String getContractNo() {
        return ContractNo;
    }

    public void setContractNo(String contractNo) {
        ContractNo = contractNo;
    }

    public String getAppID() {
        return AppID;
    }

    public void setAppID(String appID) {
        AppID = appID;
    }

    public String getTranObject() {
        return TranObject;
    }

    public void setTranObject(String tranObject) {
        TranObject = tranObject;
    }

    public String getAction() {
        return Action;
    }

    public void setAction(String action) {
        Action = action;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public String getDocID() {
        return DocID;
    }

    public void setDocID(String docID) {
        DocID = docID;
    }

    public String getCreateOn() {
        return CreateOn;
    }

    public void setCreateOn(String createOn) {
        CreateOn = createOn;
    }

    private String Version;
    private String DocID;
    private String CreateOn;
}
