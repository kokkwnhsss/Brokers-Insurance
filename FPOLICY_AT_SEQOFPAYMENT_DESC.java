package FIRSTDAO;

public class FPOLICY_AT_SEQOFPAYMENT_DESC {

    private String seqOfPaymentCd;
    private String txt;

    // Constructor
    public FPOLICY_AT_SEQOFPAYMENT_DESC(String seqOfPaymentCd, String txt) {
        this.seqOfPaymentCd = seqOfPaymentCd;
        this.txt = txt;
    }

    // Getters and Setters
    public String getSeqOfPaymentCd() {
        return seqOfPaymentCd;
    }

    public void setSeqOfPaymentCd(String seqOfPaymentCd) {
        this.seqOfPaymentCd = seqOfPaymentCd;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
