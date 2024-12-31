package FIRSTDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FCOVER_AT_TAXDAO {

    public FCOVER_AT_TAXDAO() throws SQLException {
    }

    public FCOVER_AT_TAX FCOVER_AT_TAX_ByID(int POLVER) throws SQLException {
        FCOVER_AT_TAX coverAtTax = null;
        String url = "jdbc:sqlserver://GIVE YOUR DATABASE HERE";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            String sql = "SELECT * FROM customer WHERE POLVER = " + POLVER;
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                coverAtTax = new FCOVER_AT_TAX(
                    rs.getString("POLNUMBER"),
                    rs.getString("POLVER"),
                    rs.getString("PAY_CD"),
                    rs.getString("INS_CD"),
                    rs.getString("COVCODE"),
                    rs.getString("EP_CD"),
                    rs.getString("PAY_CD_VER"),
                    rs.getString("INS_CD_VER"),
                    rs.getString("COVCODE_VER"),
                    rs.getString("EP_CD_VER"),
                    rs.getString("EP_YEAR"),
                    rs.getString("EP_DOS"),
                    rs.getString("DATE_ADDNEW"),
                    rs.getString("TIME_ADDNEW"),
                    rs.getString("USER_ADDNEW"),
                    rs.getString("DATE_UPDATE"),
                    rs.getString("TIME_UPDATE"),
                    rs.getString("USER_UPDATE")
                );
            }
        }
        return coverAtTax;
    }

    public List<FCOVER_AT_TAX> FCOVER_AT_TAX_ALL() throws SQLException {
        List<FCOVER_AT_TAX> coverAtTaxList = new ArrayList<>();
        String url = "jdbc:sqlserver://GIVE YOUR DATABASE HERE";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            String sql = "SELECT * FROM customer";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                FCOVER_AT_TAX coverAtTax = new FCOVER_AT_TAX(
                    rs.getString("POLNUMBER"),
                    rs.getString("POLVER"),
                    rs.getString("PAY_CD"),
                    rs.getString("INS_CD"),
                    rs.getString("COVCODE"),
                    rs.getString("EP_CD"),
                    rs.getString("PAY_CD_VER"),
                    rs.getString("INS_CD_VER"),
                    rs.getString("COVCODE_VER"),
                    rs.getString("EP_CD_VER"),
                    rs.getString("EP_YEAR"),
                    rs.getString("EP_DOS"),
                    rs.getString("DATE_ADDNEW"),
                    rs.getString("TIME_ADDNEW"),
                    rs.getString("USER_ADDNEW"),
                    rs.getString("DATE_UPDATE"),
                    rs.getString("TIME_UPDATE"),
                    rs.getString("USER_UPDATE")
                );
                coverAtTaxList.add(coverAtTax);
            }
        }
        return coverAtTaxList;
    }

    public void deleteByID(int POLVER) throws SQLException {
        String url = "jdbc:sqlserver://GIVE YOUR DATABASE HERE";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            String sql = "DELETE FROM customer WHERE POLVER = " + POLVER;
            stmt.executeUpdate(sql);
        }
    }

    public void updateFCOVER_AT_TAXById(int POLVER, String newPolNumber, String newPolVer, String newPayCd, String newInsCd, String newCovCode, String newEpCd, String newPayCdVer, String newInsCdVer, String newCovCodeVer, String newEpCdVer, String newEpYear, String newEpDos, String newDateAddNew, String newTimeAddNew, String newUserAddNew, String newDateUpdate, String newTimeUpdate, String newUserUpdate) throws SQLException {
        String url = "jdbc:sqlserver://GIVE YOUR DATABASE HERE";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            String sql = "UPDATE customer SET " +
                "POLNUMBER = '" + newPolNumber + "', " +
                "POLVER = '" + newPolVer + "', " +
                "PAY_CD = '" + newPayCd + "', " +
                "INS_CD = '" + newInsCd + "', " +
                "COVCODE = '" + newCovCode + "', " +
                "EP_CD = '" + newEpCd + "', " +
                "PAY_CD_VER = '" + newPayCdVer + "', " +
                "INS_CD_VER = '" + newInsCdVer + "', " +
                "COVCODE_VER = '" + newCovCodeVer + "', " +
                "EP_CD_VER = '" + newEpCdVer + "', " +
                "EP_YEAR = '" + newEpYear + "', " +
                "EP_DOS = '" + newEpDos + "', " +
                "DATE_ADDNEW = '" + newDateAddNew + "', " +
                "TIME_ADDNEW = '" + newTimeAddNew + "', " +
                "USER_ADDNEW = '" + newUserAddNew + "', " +
                "DATE_UPDATE = '" + newDateUpdate + "', " +
                "TIME_UPDATE = '" + newTimeUpdate + "', " +
                "USER_UPDATE = '" + newUserUpdate + "'" +
                " WHERE POLVER = " + POLVER;

            stmt.executeUpdate(sql);
        }
    }
}
