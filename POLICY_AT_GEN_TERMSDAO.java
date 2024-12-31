package FIRSTDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class POLICY_AT_GEN_TERMSDAO {

    private static final String URL = "jdbc:sqlserver://GIVE YOUR DATABASE HERE";

    // Retrieve a record by POLNUMBER
    public POLICY_AT_GEN_TERMS getByPolNumber(String polNumber) throws SQLException {
        POLICY_AT_GEN_TERMS policy = null;

        String sql = "SELECT * FROM POLICY_AT_GEN_TERMS WHERE POLNUMBER = ?";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, polNumber);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                policy = new POLICY_AT_GEN_TERMS(
                        rs.getString("POLNUMBER"),
                        rs.getString("POLVER"),
                        rs.getString("Gen_Or_ID"),
                        rs.getString("Gen_Or_ID_vER"),
                        rs.getString("Path"),
                        rs.getString("Doc_Exer"),
                        rs.getString("DATE_ADDNEW"),
                        rs.getString("TIME_ADDNEW"),
                        rs.getString("User_ADDNEW"),
                        rs.getString("DATE_UPDATE"),
                        rs.getString("TIME_UPDATE"),
                        rs.getString("User_UPDATE")
                );
            }
        }
        return policy;
    }

    // Retrieve all records
    public List<POLICY_AT_GEN_TERMS> getAll() throws SQLException {
        List<POLICY_AT_GEN_TERMS> policies = new ArrayList<>();

        String sql = "SELECT * FROM POLICY_AT_GEN_TERMS";

        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                POLICY_AT_GEN_TERMS policy = new POLICY_AT_GEN_TERMS(
                        rs.getString("POLNUMBER"),
                        rs.getString("POLVER"),
                        rs.getString("Gen_Or_ID"),
                        rs.getString("Gen_Or_ID_vER"),
                        rs.getString("Path"),
                        rs.getString("Doc_Exer"),
                        rs.getString("DATE_ADDNEW"),
                        rs.getString("TIME_ADDNEW"),
                        rs.getString("User_ADDNEW"),
                        rs.getString("DATE_UPDATE"),
                        rs.getString("TIME_UPDATE"),
                        rs.getString("User_UPDATE")
                );
                policies.add(policy);
            }
        }
        return policies;
    }

    // Delete a record by POLNUMBER
    public void deleteByPolNumber(String polNumber) throws SQLException {
        String sql = "DELETE FROM POLICY_AT_GEN_TERMS WHERE POLNUMBER = ?";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, polNumber);
            pstmt.executeUpdate();
        }
    }

    // Update a record
    public void updatePolicy(POLICY_AT_GEN_TERMS policy) throws SQLException {
        String sql = "UPDATE POLICY_AT_GEN_TERMS SET " +
                "POLVER = ?, Gen_Or_ID = ?, Gen_Or_ID_vER = ?, Path = ?, Doc_Exer = ?, " +
                "DATE_ADDNEW = ?, TIME_ADDNEW = ?, User_ADDNEW = ?, DATE_UPDATE = ?, TIME_UPDATE = ?, User_UPDATE = ? " +
                "WHERE POLNUMBER = ?";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, policy.getPolVer());
            pstmt.setString(2, policy.getGenOrId());
            pstmt.setString(3, policy.getGenOrIdVer());
            pstmt.setString(4, policy.getPath());
            pstmt.setString(5, policy.getDocExer());
            pstmt.setString(6, policy.getDateAddNew());
            pstmt.setString(7, policy.getTimeAddNew());
            pstmt.setString(8, policy.getUserAddNew());
            pstmt.setString(9, policy.getDateUpdate());
            pstmt.setString(10, policy.getTimeUpdate());
            pstmt.setString(11, policy.getUserUpdate());
            pstmt.setString(12, policy.getPolNumber());

            pstmt.executeUpdate();
        }
    }
}
