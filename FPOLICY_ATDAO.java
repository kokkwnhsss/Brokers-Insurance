package FIRSTDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FPOLICY_ATDAO {

    private static final String URL = "jdbc:sqlserver://GIVE YOUR DATABASE HERE";

    public FPOLICY_ATDAO() throws SQLException {
    }

    // Get FPOLICY_AT by POLNUMBER
    public FPOLICY_AT getPolicyByNumber(String polNumber) throws SQLException {
        FPOLICY_AT policy = null;

        String sql = "SELECT * FROM FPOLICY_AT WHERE POLNUMBER = ?";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, polNumber);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                policy = new FPOLICY_AT(
                        rs.getString("POLNUMBER"),
                        rs.getString("POLVER"),
                        rs.getString("PAY_CD"),
                        rs.getString("PAY_CD_VER"),
                        rs.getString("TYPE_CD"),
                        rs.getString("SEQOFPAYMENT_CD"),
                        rs.getString("WAYOFPAYMENT_CD"),
                        rs.getString("DTSTARTINS"),
                        rs.getString("DTLASTPAY"),
                        rs.getString("DTNEXTPAY"),
                        rs.getString("STATUS_CD"),
                        rs.getString("Status_Kin_CD"),
                        rs.getFloat("PREMIUM"),
                        rs.getFloat("EPCOVAMOUNT"),
                        rs.getFloat("EPAMOUNT"),
                        rs.getFloat("TOTALAMOUNT"),
                        rs.getString("PRODUCT_CD"),
                        rs.getString("PRODUCTVER"),
                        rs.getInt("DURATION"),
                        rs.getString("PP_CD"),
                        rs.getString("PP_NUMBER"),
                        rs.getString("Date_PP"),
                        rs.getString("POLDTBEGIN"),
                        rs.getString("BRANCH_CD"),
                        rs.getString("VER_AIT"),
                        rs.getString("MAS_WORK_HIS_CD"),
                        rs.getString("DIKAIOMA"),
                        rs.getString("CUSADDRTYPE_CD"),
                        rs.getString("VER_DATE_BEGIN"),
                        rs.getString("VER_TIME_BEGIN"),
                        rs.getString("Hmer_Eisodoy"),
                        rs.getString("DTENDPAY"),
                        rs.getString("VER_STATUS_CD"),
                        rs.getString("VER_DATE_END"),
                        rs.getString("VER_TIME_END"),
                        rs.getString("DATE_END_PAY"),
                        rs.getString("DATE_ADDNEW"),
                        rs.getString("TIME_ADDNEW"),
                        rs.getString("User_ADDNEW"),
                        rs.getString("DATE_UPDATE"),
                        rs.getString("TIME_UPDATE"),
                        rs.getString("User_UPDATE"),
                        rs.getString("PACKAGE_CD"),
                        rs.getString("PACKAGE_VER"),
                        rs.getString("RECEIPT_CD"),
                        rs.getString("licenseplate")
                );
            }
        }
        return policy;
    }

    // Get all FPOLICY_AT records
    public List<FPOLICY_AT> getAllPolicies() throws SQLException {
        List<FPOLICY_AT> policyList = new ArrayList<>();

        String sql = "SELECT * FROM FPOLICY_AT";

        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                FPOLICY_AT policy = new FPOLICY_AT(
                        rs.getString("POLNUMBER"),
                        rs.getString("POLVER"),
                        rs.getString("PAY_CD"),
                        rs.getString("PAY_CD_VER"),
                        rs.getString("TYPE_CD"),
                        rs.getString("SEQOFPAYMENT_CD"),
                        rs.getString("WAYOFPAYMENT_CD"),
                        rs.getString("DTSTARTINS"),
                        rs.getString("DTLASTPAY"),
                        rs.getString("DTNEXTPAY"),
                        rs.getString("STATUS_CD"),
                        rs.getString("Status_Kin_CD"),
                        rs.getFloat("PREMIUM"),
                        rs.getFloat("EPCOVAMOUNT"),
                        rs.getFloat("EPAMOUNT"),
                        rs.getFloat("TOTALAMOUNT"),
                        rs.getString("PRODUCT_CD"),
                        rs.getString("PRODUCTVER"),
                        rs.getInt("DURATION"),
                        rs.getString("PP_CD"),
                        rs.getString("PP_NUMBER"),
                        rs.getString("Date_PP"),
                        rs.getString("POLDTBEGIN"),
                        rs.getString("BRANCH_CD"),
                        rs.getString("VER_AIT"),
                        rs.getString("MAS_WORK_HIS_CD"),
                        rs.getString("DIKAIOMA"),
                        rs.getString("CUSADDRTYPE_CD"),
                        rs.getString("VER_DATE_BEGIN"),
                        rs.getString("VER_TIME_BEGIN"),
                        rs.getString("Hmer_Eisodoy"),
                        rs.getString("DTENDPAY"),
                        rs.getString("VER_STATUS_CD"),
                        rs.getString("VER_DATE_END"),
                        rs.getString("VER_TIME_END"),
                        rs.getString("DATE_END_PAY"),
                        rs.getString("DATE_ADDNEW"),
                        rs.getString("TIME_ADDNEW"),
                        rs.getString("User_ADDNEW"),
                        rs.getString("DATE_UPDATE"),
                        rs.getString("TIME_UPDATE"),
                        rs.getString("User_UPDATE"),
                        rs.getString("PACKAGE_CD"),
                        rs.getString("PACKAGE_VER"),
                        rs.getString("RECEIPT_CD"),
                        rs.getString("licenseplate")
                );
                policyList.add(policy);
            }
        }
        return policyList;
    }

    // Delete FPOLICY_AT by POLNUMBER
    public void deleteByPolNumber(String polNumber) throws SQLException {
        String sql = "DELETE FROM FPOLICY_AT WHERE POLNUMBER = ?";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, polNumber);
            pstmt.executeUpdate();
        }
    }

    // Update FPOLICY_AT by POLNUMBER
    public void updatePolicy(FPOLICY_AT policy) throws SQLException {
        String sql = "UPDATE FPOLICY_AT SET " +
                "POLVER = ?, PAY_CD = ?, PAY_CD_VER = ?, TYPE_CD = ?, " +
                "SEQOFPAYMENT_CD = ?, WAYOFPAYMENT_CD = ?, DTSTARTINS = ?, " +
                "DTLASTPAY = ?, DTNEXTPAY = ?, STATUS_CD = ?, Status_Kin_CD = ?, " +
                "PREMIUM = ?, EPCOVAMOUNT = ?, EPAMOUNT = ?, TOTALAMOUNT = ?, " +
                "PRODUCT_CD = ?, PRODUCTVER = ?, DURATION = ?, PP_CD = ?, " +
                "PP_NUMBER = ?, Date_PP = ?, POLDTBEGIN = ?, BRANCH_CD = ?, " +
                "VER_AIT = ?, MAS_WORK_HIS_CD = ?, DIKAIOMA = ?, CUSADDRTYPE_CD = ?, " +
                "VER_DATE_BEGIN = ?, VER_TIME_BEGIN = ?, Hmer_Eisodoy = ?, DTENDPAY = ?, " +
                "VER_STATUS_CD = ?, VER_DATE_END = ?, VER_TIME_END = ?, DATE_END_PAY = ?, " +
                "DATE_ADDNEW = ?, TIME_ADDNEW = ?, User_ADDNEW = ?, DATE_UPDATE = ?, " +
                "TIME_UPDATE = ?, User_UPDATE = ?, PACKAGE_CD = ?, PACKAGE_VER = ?, " +
                "RECEIPT_CD = ?, licenseplate = ? " +
                "WHERE POLNUMBER = ?";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, policy.getPolVer());
            pstmt.setString(2, policy.getPayCd());
            // Set other fields...
            pstmt.setString(42, policy.getPolNumber());

            pstmt.executeUpdate();
        }
    }
}
