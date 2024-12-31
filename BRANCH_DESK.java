package FIRSTDAO;



public class BRANCH_DESK {
   
    private String branchCd;
    private String txt;
    private String genTxt;
    private String lgCd;

    public BRANCH_DESK(String branchCd, String txt, String genTxt, String lgCd) {
        this.branchCd = branchCd;
        this.txt = txt;
        this.genTxt = genTxt;
        this.lgCd = lgCd;
    }

    public String getBranchCd() {
        return branchCd;
    }

    public void setBranchCd(String branchCd) {
        this.branchCd = branchCd;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getGenTxt() {
        return genTxt;
    }

    public void setGenTxt(String genTxt) {
        this.genTxt = genTxt;
    }

    public String getLgCd() {
        return lgCd;
    }

    public void setLgCd(String lgCd) {
        this.lgCd = lgCd;
    }
}
