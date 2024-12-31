package FIRSTDAO;

package FIRSTDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FCOVER_ATDAO {

    private String url = "jdbc:sqlserver://GIVE YOUR DATABASE HERE";

    public FCOVER_ATDAO() throws SQLException {
        // Empty constructor
    }

    public FCOVER_AT findByPolNumber(String polNumber) throws SQLException {
    	 FCOVER_AT fcCoverat = null;

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            String sql = "SELECT * FROM FC_COVERAT WHERE POLNUMBER = '" + polNumber + "'";
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                fcCoverat = new  FCOVER_AT(
                        rs.getString("POLNUMBER"),
                        rs.getString("POLVER"),
                        rs.getString("PAY_CD"),
                        rs.getString("INS_CD"),
                        rs.getString("COVCODE"),
                        rs.getString("PAY_CD_VER"),
                        rs.getString("INS_CD_VER"),
                        rs.getString("COVCODE_VER"),
                        rs.getString("TRP_CD"),
                        rs.getInt("COV_AA"),
                        rs.getFloat("COVMF"),
                        rs.getInt("AGECALC"),
                        rs.getInt("YEARSPAID"),
                        rs.getString("DTENDPAYCOV"),
                        rs.getInt("DURATIONCOV"),
                        rs.getInt("AGEEND")
                );
            }
        }
        return fcCoverat;
    }

    public List<FCOVER_AT> findAll() throws SQLException {
        List<FCOVER_AT> fcCoveratList = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            String sql = "SELECT * FROM FC_COVERAT";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                FCOVER_AT fcCoverat = new FCOVER_AT(
                        rs.getString("POLNUMBER"),
                        rs.getString("POLVER"),
                        rs.getString("PAY_CD"),
                        rs.getString("INS_CD"),
                        rs.getString("COVCODE"),
                        rs.getString("PAY_CD_VER"),
                        rs.getString("INS_CD_VER"),
                        rs.getString("COVCODE_VER"),
                        rs.getString("TRP_CD"),
                        rs.getInt("COV_AA"),
                        rs.getFloat("COVMF"),
                        rs.getInt("AGECALC"),
                        rs.getInt("YEARSPAID"),
                        rs.getString("DTENDPAYCOV"),
                        rs.getInt("DURATIONCOV"),
                        rs.getInt("AGEEND")
                );
                fcCoveratList.add(fcCoverat);
            }
        }
        return fcCoveratList;
    }

    public void deleteByPolNumber(String polNumber) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            String sql = "DELETE FROM FC_COVERAT WHERE POLNUMBER = '" + polNumber + "'";
            stmt.executeUpdate(sql);
        }
    }

    public void updateByPolNumber(String polNumber, String newPolVer, String newPayCd, String newInsCd, String newCovCode,
                                  String newPayCdVer, String newInsCdVer, String newCovCodeVer, String newTrpCd,
                                  int newCovAa, float newCovMf, int newAgeCalc, int newYearsPaid, 
                                  String newDtEndPayCov, int newDurationCov, int newAgeEnd) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            String sql = "UPDATE FCOVER_AT SET " +
                         "POLVER = '" + newPolVer + "', " +
                         "PAY_CD = '" + newPayCd + "', " +
                         "INS_CD = '" + newInsCd + "', " +
                         "COVCODE = '" + newCovCode + "', " +
                         "PAY_CD_VER = '" + newPayCdVer + "', " +
                         "INS_CD_VER = '" + newInsCdVer + "', " +
                         "COVCODE_VER = '" + newCovCodeVer + "', " +
                         "TRP_CD = '" + newTrpCd + "', " +
                         "COV_AA = " + newCovAa + ", " +
                         "COVMF = " + newCovMf + ", " +
                         "AGECALC = " + newAgeCalc + ", " +
                         "YEARSPAID = " + newYearsPaid + ", " +
                         "DTENDPAYCOV = '" + newDtEndPayCov + "', " +
                         "DURATIONCOV = " + newDurationCov + ", " +
                         "AGEEND = " + newAgeEnd + " " +
                         "WHERE POLNUMBER = '" + polNumber + "'";
            stmt.executeUpdate(sql);
        }
    }
}

