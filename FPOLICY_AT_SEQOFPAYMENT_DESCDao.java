package FIRSTDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FPOLICY_AT_SEQOFPAYMENT_DESCDao {

    private static final String URL = "jdbc:sqlserver://GIVE YOUR DATABASE HERE";

    // Retrieve a record by SEQOFPAYMENT_CD
    public FPOLICY_AT_SEQOFPAYMENT_DESC getBySeqOfPaymentCd(String seqOfPaymentCd) throws SQLException {
        FPOLICY_AT_SEQOFPAYMENT_DESC record = null;

        String sql = "SELECT * FROM FPOLICY_AT_SEQOFPAYMENT_DESC WHERE SEQOFPAYMENT_CD = ?";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, seqOfPaymentCd);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                record = new FPOLICY_AT_SEQOFPAYMENT_DESC(
                        rs.getString("SEQOFPAYMENT_CD"),
                        rs.getString("TXT")
                );
            }
        }
        return record;
    }

    // Retrieve all records
    public List<FPOLICY_AT_SEQOFPAYMENT_DESC> getAll() throws SQLException {
        List<FPOLICY_AT_SEQOFPAYMENT_DESC> records = new ArrayList<>();

        String sql = "SELECT * FROM FPOLICY_AT_SEQOFPAYMENT_DESC";

        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                FPOLICY_AT_SEQOFPAYMENT_DESC record = new FPOLICY_AT_SEQOFPAYMENT_DESC(
                        rs.getString("SEQOFPAYMENT_CD"),
                        rs.getString("TXT")
                );
                records.add(record);
            }
        }
        return records;
    }

    // Delete a record by SEQOFPAYMENT_CD
    public void deleteBySeqOfPaymentCd(String seqOfPaymentCd) throws SQLException {
        String sql = "DELETE FROM FPOLICY_AT_SEQOFPAYMENT_DESC WHERE SEQOFPAYMENT_CD = ?";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, seqOfPaymentCd);
            pstmt.executeUpdate();
        }
    }

    // Update a record
    public void updateRecord(FPOLICY_AT_SEQOFPAYMENT_DESC record) throws SQLException {
        String sql = "UPDATE FPOLICY_AT_SEQOFPAYMENT_DESC SET TXT = ? WHERE SEQOFPAYMENT_CD = ?";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, record.getTxt());
            pstmt.setString(2, record.getSeqOfPaymentCd());

            pstmt.executeUpdate();
        }
    }
}
