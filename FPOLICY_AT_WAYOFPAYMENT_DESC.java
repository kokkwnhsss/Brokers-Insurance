package FIRSTDAO;

public class FPOLICY_AT_WAYOFPAYMENT_DESC {

    private String wayOfPaymentCd;
    private String txt;

    // Constructor
    public FPOLICY_AT_WAYOFPAYMENT_DESC(String wayOfPaymentCd, String txt) {
        this.wayOfPaymentCd = wayOfPaymentCd;
        this.txt = txt;
    }

    // Getters and Setters
    public String getWayOfPaymentCd() {
        return wayOfPaymentCd;
    }

    public void setWayOfPaymentCd(String wayOfPaymentCd) {
        this.wayOfPaymentCd = wayOfPaymentCd;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
