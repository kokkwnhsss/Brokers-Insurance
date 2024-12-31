package FIRSTDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FCOVER_DESKDAO {

    public FCOVER_DESKDAO() throws SQLException {
    }

    public FCOVER_DESK FCOVER_DESKByID(int CPR_COVCODE) throws SQLException {
        System.out.println("Entering FCOVER_DESKByID"); 
        FCOVER_DESK coverDesk = null;

        String url = "jdbc:sqlserver://GIVE YOUR DATABASE HERE";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            String sql = "SELECT * FROM fcover_desk WHERE CPR_COVCODE = " + CPR_COVCODE;
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                System.out.println("Record found");
                
                coverDesk = new FCOVER_DESK(
                    rs.getString("CPR_COVCODE"),
                    rs.getString("CPR_VER"),
                    rs.getString("CPR_BRANCH_CD"),
                    rs.getString("Special_Desc"),
                    rs.getString("Type_1_CD"),
                    rs.getString("Type_2_CD"),
                    rs.getString("Short_CD"),
                    rs.getString("Per_Risk"),
                    rs.getString("Currency_CD"),
                    rs.getString("Country_CD"),
                    rs.getString("Texniko_Epitokio"),
                    rs.getString("Pinakas_Thnis_CD"),
                    rs.getInt("MIN_AGE"),
                    rs.getInt("MAX_AGE"),
                    rs.getInt("MIN_DUR"),
                    rs.getInt("MAX_DUR"),
                    rs.getString("MIN_CAPITAL"),
                    rs.getString("MAX_CAPITAL"),
                    rs.getString("MAS_WORK_HIS_CD"),
                    rs.getString("Antasf_Cd"),
                    rs.getString("Antasf_Ver"),
                    rs.getString("Type_Calc_CD"),
                    rs.getString("Grp_EP_Cover_CD"),
                    rs.getString("BASIKH_H_PROS_CD"),
                    rs.getString("VER_DATE_BEGIN"),
                    rs.getString("VER_TIME_BEGIN"),
                    rs.getString("VER_DATE_END"),
                    rs.getString("VER_TIME_END"),
                    rs.getString("DATE_ADDNEW"),
                    rs.getString("TIME_ADDNEW"),
                    rs.getString("XARTOSHMO_FUND_POSOSTO"),
                    rs.getString("User_ADDNEW"),
                    rs.getString("DATE_UPDATE"),
                    rs.getString("TIME_UPDATE"),
                    rs.getString("User_UPDATE"),
                    rs.getString("EXIST_XARTOSHMO_FUND"),
                    rs.getString("XARTOSHMO_FUND_PER_LAYER"),
                    rs.getString("XARTOSHMO_FUND_EFAPAX_LAYER"),
                    rs.getString("SUB_TYPE_CALC_CD"),
                    rs.getString("SUB_TYPE_CALC_CD_PIN_THNIS_NAME")
                );
            }
        }
        return coverDesk;
    }

    public List<FCOVER_DESK> FCOVER_DESKALL() throws SQLException {
        List<FCOVER_DESK> coverDeskList = new ArrayList<>();

        String url = "jdbc:sqlserver://GIVE YOUR DATABASE HERE";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            String sql = "SELECT * FROM fcover_desk";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                FCOVER_DESK coverDesk = new FCOVER_DESK(
                    rs.getString("CPR_COVCODE"),
                    rs.getString("CPR_VER"),
                    rs.getString("CPR_BRANCH_CD"),
                    rs.getString("Special_Desc"),
                    rs.getString("Type_1_CD"),
                    rs.getString("Type_2_CD"),
                    rs.getString("Short_CD"),
                    rs.getString("Per_Risk"),
                    rs.getString("Currency_CD"),
                    rs.getString("Country_CD"),
                    rs.getString("Texniko_Epitokio"),
                    rs.getString("Pinakas_Thnis_CD"),
                    rs.getInt("MIN_AGE"),
                    rs.getInt("MAX_AGE"),
                    rs.getInt("MIN_DUR"),
                    rs.getInt("MAX_DUR"),
                    rs.getString("MIN_CAPITAL"),
                    rs.getString("MAX_CAPITAL"),
                    rs.getString("MAS_WORK_HIS_CD"),
                    rs.getString("Antasf_Cd"),
                    rs.getString("Antasf_Ver"),
                    rs.getString("Type_Calc_CD"),
                    rs.getString("Grp_EP_Cover_CD"),
                    rs.getString("BASIKH_H_PROS_CD"),
                    rs.getString("VER_DATE_BEGIN"),
                    rs.getString("VER_TIME_BEGIN"),
                    rs.getString("VER_DATE_END"),
                    rs.getString("VER_TIME_END"),
                    rs.getString("DATE_ADDNEW"),
                    rs.getString("TIME_ADDNEW"),
                    rs.getString("XARTOSHMO_FUND_POSOSTO"),
                    rs.getString("User_ADDNEW"),
                    rs.getString("DATE_UPDATE"),
                    rs.getString("TIME_UPDATE"),
                    rs.getString("User_UPDATE"),
                    rs.getString("EXIST_XARTOSHMO_FUND"),
                    rs.getString("XARTOSHMO_FUND_PER_LAYER"),
                    rs.getString("XARTOSHMO_FUND_EFAPAX_LAYER"),
                    rs.getString("SUB_TYPE_CALC_CD"),
                    rs.getString("SUB_TYPE_CALC_CD_PIN_THNIS_NAME")
                );

                coverDeskList.add(coverDesk);
            }
        }
        return coverDeskList;
    }

    public void deleteByID(int clientId) throws SQLException {
        String url = "jdbc:sqlserver://GIVE YOUR DATABASE HERE";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            String sql = "DELETE FROM fcover_desk WHERE CPR_COVCODE = " + CPR_COVCODE;
            stmt.executeUpdate(sql);
        }
    }

    public void updateFCOVER_DESKById( String newCPR_COVCODE, String newCPR_VER, String newCPR_BRANCH_CD, String newSpecial_Desc, String newType_1_CD, String newType_2_CD, String newShort_CD, String newPer_Risk, String newCurrency_CD, String newCountry_CD, String newTexniko_Epitokio, String newPinakas_Thnis_CD, int newMIN_AGE, int newMAX_AGE, int newMIN_DUR, int newMAX_DUR, String newMIN_CAPITAL, String newMAX_CAPITAL, String newMAS_WORK_HIS_CD, String newAntasf_Cd, String newAntasf_Ver, String newType_Calc_CD, String newGrp_EP_Cover_CD, String newBASIKH_H_PROS_CD, String newVER_DATE_BEGIN, String newVER_TIME_BEGIN, String newVER_DATE_END, String newVER_TIME_END, String newDATE_ADDNEW, String newTIME_ADDNEW, String newXARTOSHMO_FUND_POSOSTO, String newUser_ADDNEW, String newDATE_UPDATE, String newTIME_UPDATE, String newUser_UPDATE, String newEXIST_XARTOSHMO_FUND, String newXARTOSHMO_FUND_PER_LAYER, String newXARTOSHMO_FUND_EFAPAX_LAYER, String newSUB_TYPE_CALC_CD, String newSUB_TYPE_CALC_CD_PIN_THNIS_NAME) throws SQLException {
        String url = "jdbc:sqlserver://GIVE YOUR DATABASE HERE";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            String sql = "UPDATE fcover_desk SET " +
                "CPR_COVCODE = '" + newCPR_COVCODE + "', " +
                "CPR_VER = '" + newCPR_VER + "', " +
                "CPR_BRANCH_CD = '" + newCPR_BRANCH_CD + "', " +
                "Special_Desc = '" + newSpecial_Desc + "', " +
                "Type_1_CD = '" + newType_1_CD + "', " +
                "Type_2_CD = '" + newType_2_CD + "', " +
                "Short_CD = '" + newShort_CD + "', " +
                "Per_Risk = '" + newPer_Risk + "', " +
                "Currency_CD = '" + newCurrency_CD + "', " +
                "Country_CD = '" + newCountry_CD + "', " +
                "Texniko_Epitokio = '" + newTexniko_Epitokio + "', " +
                "Pinakas_Thnis_CD = '" + newPinakas_Thnis_CD + "', " +
                "MIN_AGE = " + newMIN_AGE + ", " +
                "MAX_AGE = " + newMAX_AGE + ", " +
                "MIN_DUR = " + newMIN_DUR + ", " +
                "MAX_DUR = " + newMAX_DUR + ", " +
                "MIN_CAPITAL = '" + newMIN_CAPITAL + "', " +
                "MAX_CAPITAL = '" + newMAX_CAPITAL + "', " +
                "MAS_WORK_HIS_CD = '" + newMAS_WORK_HIS_CD + "', " +
                "Antasf_Cd = '" + newAntasf_Cd + "', " +
                "Antasf_Ver = '" + newAntasf_Ver + "', " +
                "Type_Calc_CD = '" + newType_Calc_CD + "', " +
                "Grp_EP_Cover_CD = '" + newGrp_EP_Cover_CD + "', " +
                "BASIKH_H_PROS_CD = '" + newBASIKH_H_PROS_CD + "', " +
                "VER_DATE_BEGIN = '" + newVER_DATE_BEGIN + "', " +
                "VER_TIME_BEGIN = '" + newVER_TIME_BEGIN + "', " +
                "VER_DATE_END = '" + newVER_DATE_END + "', " +
                "VER_TIME_END = '" + newVER_TIME_END + "', " +
                "DATE_ADDNEW = '" + newDATE_ADDNEW + "', " +
                "TIME_ADDNEW = '" + newTIME_ADDNEW + "', " +
                "XARTOSHMO_FUND_POSOSTO = '" + newXARTOSHMO_FUND_POSOSTO + "', " +
                "User_ADDNEW = '" + newUser_ADDNEW + "', " +
                "DATE_UPDATE = '" + newDATE_UPDATE + "', " +
                "TIME_UPDATE = '" + newTIME_UPDATE + "', " +
                "User_UPDATE = '" + newUser_UPDATE + "', " +
                "EXIST_XARTOSHMO_FUND = '" + newEXIST_XARTOSHMO_FUND + "', " +
                "XARTOSHMO_FUND_PER_LAYER = '" + newXARTOSHMO_FUND_PER_LAYER + "', " +
                "XARTOSHMO_FUND_EFAPAX_LAYER = '" + newXARTOSHMO_FUND_EFAPAX_LAYER + "', " +
                "SUB_TYPE_CALC_CD = '" + newSUB_TYPE_CALC_CD + "', " +
                "SUB_TYPE_CALC_CD_PIN_THNIS_NAME = '" + newSUB_TYPE_CALC_CD_PIN_THNIS_NAME + "' " +
                "WHERE CPR_COVCODE = " + CPR_COVCODE;

            stmt.executeUpdate(sql);
        }
    }

	public void deleteByCPR_COVCODE(String cprCovcode) {
		// TODO Auto-generated method stub
		
	}
}
