package FIRSTDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FRECEIPT_AT_HDao {

    private static final String URL = "jdbc:sqlserver://GIVE YOUR DATABASE HERE";

    // Retrieve a record by POLNUMBER
    public FRECEIPT_AT_H getByPolNumber(String polNumber) throws SQLException {
        FRECEIPT_AT_H record = null;
        String sql = "SELECT * FROM FRECEIPT_AT_H WHERE POLNUMBER = ?";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, polNumber);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                record = extractRecord(rs);
            }
        }
        return record;
    }

    // Retrieve all records
    public List<FRECEIPT_AT_H> getAll() throws SQLException {
        List<FRECEIPT_AT_H> records = new ArrayList<>();
        String sql = "SELECT * FROM FRECEIPT_AT_H";

        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                records.add(extractRecord(rs));
            }
        }
        return records;
    }

    // Delete a record by POLNUMBER
    public void deleteByPolNumber(String polNumber) throws SQLException {
        String sql = "DELETE FROM FRECEIPT_AT_H WHERE POLNUMBER = ?";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, polNumber);
            pstmt.executeUpdate();
        }
    }

    // Update a record
    public void updateRecord(FRECEIPT_AT_H record) throws SQLException {
        String sql = "UPDATE FRECEIPT_AT_H SET STATUS_CD = ?, TOTALAMOUNT = ? WHERE POLNUMBER = ?";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, record.getStatusCd());
            pstmt.setString(2, record.getTotalAmount());
            pstmt.setString(3, record.getPolNumber());

            pstmt.executeUpdate();
        }
    }

    // Extract record helper method
    private FRECEIPT_AT_H extractRecord(ResultSet rs) throws SQLException {
        FRECEIPT_AT_H record = new FRECEIPT_AT_H();

        record.setPolNumber(rs.getString("POLNUMBER"));
        record.setPolVer(rs.getString("POLVER"));
        record.setPayCd(rs.getString("PAY_CD"));
        record.setNumberPp(rs.getString("NUMBER_PP"));
        record.setNumber(rs.getInt("NUMBER"));
        record.setPayCdVer(rs.getString("PAY_CD_VER"));
        record.setDateFrom(rs.getString("DATE_FROM"));
        record.setDateTo(rs.getString("DATE_TO"));
        record.setDatePrt(rs.getString("DATE_PRT"));
        record.setPremium(rs.getString("PREMIUM"));
        record.setEpCovAmount(rs.getString("EPCOVAMOUNT"));
        record.setEpAmount(rs.getString("EPAMOUNT"));
        record.setTotalAmount(rs.getString("TOTALAMOUNT"));
        record.setDebit(rs.getString("DEBIT"));
        record.setProKat(rs.getString("PROKAT"));
        record.setCredit(rs.getString("CREDIT"));
        record.setFinalAmount(rs.getString("FINAL_AMOUNT"));
        record.setTrpCd(rs.getString("TRP_CD"));
        record.setTrpeispCd(rs.getString("TRPEISP_CD"));
        record.setStatusCd(rs.getString("STATUS_CD"));
        record.setStatusCd2(rs.getString("STATUS_CD2"));
        record.setDtStatus(rs.getString("DTSTATUS"));
        record.setKladosCd(rs.getString("KLADOS_CD"));
        record.setPolYear(rs.getString("POL_YEAR"));
        record.setAaNum(rs.getInt("AA_NUM"));
        record.setPpCd(rs.getInt("PP_CD"));
        record.setReceiptCd(rs.getString("RECEIPT_CD"));
        record.setKinCd(rs.getString("Kin_Cd"));

        return record;
    }
}
