package FIRSTDAO;

public class POLICY_AT_GEN_TERMS {

    private String polNumber;
    private String polVer;
    private String genOrId;
    private String genOrIdVer;
    private String path;
    private String docExer;
    private String dateAddNew;
    private String timeAddNew;
    private String userAddNew;
    private String dateUpdate;
    private String timeUpdate;
    private String userUpdate;

    // Constructor
    public POLICY_AT_GEN_TERMS(String polNumber, String polVer, String genOrId, String genOrIdVer, String path, String docExer,
                               String dateAddNew, String timeAddNew, String userAddNew, String dateUpdate, String timeUpdate, String userUpdate) {
        this.polNumber = polNumber;
        this.polVer = polVer;
        this.genOrId = genOrId;
        this.genOrIdVer = genOrIdVer;
        this.path = path;
        this.docExer = docExer;
        this.dateAddNew = dateAddNew;
        this.timeAddNew = timeAddNew;
        this.userAddNew = userAddNew;
        this.dateUpdate = dateUpdate;
        this.timeUpdate = timeUpdate;
        this.userUpdate = userUpdate;
    }

    // Getters and Setters
    public String getPolNumber() {
        return polNumber;
    }

    public void setPolNumber(String polNumber) {
        this.polNumber = polNumber;
    }

    public String getPolVer() {
        return polVer;
    }

    public void setPolVer(String polVer) {
        this.polVer = polVer;
    }

    public String getGenOrId() {
        return genOrId;
    }

    public void setGenOrId(String genOrId) {
        this.genOrId = genOrId;
    }

    public String getGenOrIdVer() {
        return genOrIdVer;
    }

    public void setGenOrIdVer(String genOrIdVer) {
        this.genOrIdVer = genOrIdVer;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDocExer() {
        return docExer;
    }

    public void setDocExer(String docExer) {
        this.docExer = docExer;
    }

    public String getDateAddNew() {
        return dateAddNew;
    }

    public void setDateAddNew(String dateAddNew) {
        this.dateAddNew = dateAddNew;
    }

    public String getTimeAddNew() {
        return timeAddNew;
    }

    public void setTimeAddNew(String timeAddNew) {
        this.timeAddNew = timeAddNew;
    }

    public String getUserAddNew() {
        return userAddNew;
    }

    public void setUserAddNew(String userAddNew) {
        this.userAddNew = userAddNew;
    }

    public String getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(String dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public String getTimeUpdate() {
        return timeUpdate;
    }

    public void setTimeUpdate(String timeUpdate) {
        this.timeUpdate = timeUpdate;
    }

    public String getUserUpdate() {
        return userUpdate;
    }

    public void setUserUpdate(String userUpdate) {
        this.userUpdate = userUpdate;
    }
}
