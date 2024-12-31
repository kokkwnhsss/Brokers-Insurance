package FIRSTDAO;

import java.sql.SQLException;
import java.util.List;

public class FCOVER_DESKService {
    private FCOVER_DESKDAO fcoverDeskDAO;

    public FCOVER_DESKService() throws SQLException {
        this.fcoverDeskDAO = new FCOVER_DESKDAO();
    }

    public FCOVER_DESK findByCPRCovcode(String cprCovcode) throws SQLException {
        return fcoverDeskDAO.FCOVER_DESKByID(cprCovcode);
    }

    public List<FCOVER_DESK> findAll() throws SQLException {
        return fcoverDeskDAO.FCOVER_DESKALL();
    }

    public void deleteByCPRCovcode(String cprCovcode) throws SQLException {
        fcoverDeskDAO.deleteByCPR_COVCODE(cprCovcode);
    }

    public void updateByCPRCovcode(String cprCovcode, String newCPR_COVCODE, String newCPR_VER, String newCPR_BRANCH_CD, String newSpecial_Desc,
                                   String newType_1_CD, String newType_2_CD, String newShort_CD, String newPer_Risk,
                                   String newCurrency_CD, String newCountry_CD, String newTexniko_Epitokio, String newPinakas_Thnis_CD,
                                   int newMIN_AGE, int newMAX_AGE, int newMIN_DUR, int newMAX_DUR, String newMIN_CAPITAL,
                                   String newMAX_CAPITAL, String newMAS_WORK_HIS_CD, String newAntasf_Cd, String newAntasf_Ver,
                                   String newType_Calc_CD, String newGrp_EP_Cover_CD, String newBASIKH_H_PROS_CD, String newVER_DATE_BEGIN,
                                   String newVER_TIME_BEGIN, String newVER_DATE_END, String newVER_TIME_END, String newDATE_ADDNEW,
                                   String newTIME_ADDNEW, String newXARTOSHMO_FUND_POSOSTO, String newUser_ADDNEW, String newDATE_UPDATE,
                                   String newTIME_UPDATE, String newUser_UPDATE, String newEXIST_XARTOSHMO_FUND, String newXARTOSHMO_FUND_PER_LAYER,
                                   String newXARTOSHMO_FUND_EFAPAX_LAYER, String newSUB_TYPE_CALC_CD, String newSUB_TYPE_CALC_CD_PIN_THNIS_NAME) throws SQLException {
        fcoverDeskDAO.updateFCOVER_DESKById(cprCovcode, newCPR_COVCODE, newCPR_VER, newCPR_BRANCH_CD, newSpecial_Desc,
                                                     newType_1_CD, newType_2_CD, newShort_CD, newPer_Risk, newCurrency_CD, 
                                                     newCountry_CD, newTexniko_Epitokio, newPinakas_Thnis_CD, newMIN_AGE, 
                                                     newMAX_AGE, newMIN_DUR, newMAX_DUR, newMIN_CAPITAL, newMAX_CAPITAL, 
                                                     newMAS_WORK_HIS_CD, newAntasf_Cd, newAntasf_Ver, newType_Calc_CD, 
                                                     newGrp_EP_Cover_CD, newBASIKH_H_PROS_CD, newVER_DATE_BEGIN, 
                                                     newVER_TIME_BEGIN, newVER_DATE_END, newVER_TIME_END, newDATE_ADDNEW, 
                                                     newTIME_ADDNEW, newXARTOSHMO_FUND_POSOSTO, newUser_ADDNEW, 
                                                     newDATE_UPDATE, newTIME_UPDATE, newUser_UPDATE, newEXIST_XARTOSHMO_FUND, 
                                                     newXARTOSHMO_FUND_PER_LAYER, newXARTOSHMO_FUND_EFAPAX_LAYER, 
                                                     newSUB_TYPE_CALC_CD, newSUB_TYPE_CALC_CD_PIN_THNIS_NAME);
    }
}
