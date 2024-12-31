package FIRSTDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BRANCH_DESKDAO {

    private String url = "jdbc:sqlserver://GIVE YOUR DATABASE HERE";

    public  BRANCH_DESKDAO() throws SQLException {
        // Empty constructor
    }

    public  BRANCH_DESKDAO branchById(String branchCd) throws SQLException {
    	 BRANCH_DESKDAO branch = null;

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            String sql = "SELECT * FROM branch WHERE branch_cd = '" + branchCd + "'";
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                branch = new  BRANCH_DESKDAO(
                        rs.getString("branch_cd"),
                        rs.getString("txt"),
                        rs.getString("gen_txt"),
                        rs.getString("lg_cd")
                );
            }
        }
        return branch;
    }

    public List< BRANCH_DESKDAO> branchAll() throws SQLException {
        List< BRANCH_DESKDAO> branchList = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            String sql = "SELECT * FROM branch";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
            	 BRANCH_DESKDAO branch = new  BRANCH_DESKDAO(
                        rs.getString("branch_cd"),
                        rs.getString("txt"),
                        rs.getString("gen_txt"),
                        rs.getString("lg_cd")
                );
                branchList.add(branch);
            }
        }
        return branchList;
    }

    public void deleteById(String branchCd) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            String sql = "DELETE FROM branch WHERE branch_cd = '" + branchCd + "'";
            stmt.executeUpdate(sql);
        }
    }

    public void updateBranchById(String branchCd, String newTxt, String newGenTxt, String newLgCd) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            String sql = "UPDATE branch SET " +
                         "txt = '" + newTxt + "', " +
                         "gen_txt = '" + newGenTxt + "', " +
                         "lg_cd = '" + newLgCd + "' " +
                         "WHERE branch_cd = '" + branchCd + "'";
            stmt.executeUpdate(sql);
        }
    }
}
