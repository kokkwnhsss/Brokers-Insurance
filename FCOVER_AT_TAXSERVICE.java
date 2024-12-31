package FIRSTDAO;

import java.sql.SQLException;
import java.util.List;

public class FCOVER_AT_TAXSERVICE {
    private FCOVER_AT_TAXDAO fcoverAtTaxDao;

    public FCOVER_AT_TAXSERVICE() throws SQLException {
        this.fcoverAtTaxDao = new FCOVER_AT_TAXDAO();
    }
    
    public List<FCOVER_AT_TAX> getAllFCOVER_AT_TAX() throws SQLException {
        return fcoverAtTaxDao. FCOVER_AT_TAX_ALL();
    }

    public FCOVER_AT_TAX getFCOVER_AT_TAXById(int POLVER) throws SQLException {
        return fcoverAtTaxDao.FCOVER_AT_TAX_ByID(POLVER);
    }

    public void deleteFCOVER_AT_TAXById(int POLVER) throws SQLException {
        fcoverAtTaxDao.deleteByID(POLVER);
    }

    public void updateFCOVER_AT_TAXById(int POLVER, String newPolNumber, String newPolVer, String newPayCd, String newInsCd, String newCovCode, String newEpCd, String newPayCdVer, String newInsCdVer, String newCovCodeVer, String newEpCdVer, String newEpYear, String newEpDos, String newDateAddNew, String newTimeAddNew, String newUserAddNew, String newDateUpdate, String newTimeUpdate, String newUserUpdate) throws SQLException {
        fcoverAtTaxDao.updateFCOVER_AT_TAXById(POLVER, newPolNumber, newPolVer, newPayCd, newInsCd, newCovCode, newEpCd, newPayCdVer, newInsCdVer, newCovCodeVer, newEpCdVer, newEpYear, newEpDos, newDateAddNew, newTimeAddNew, newUserAddNew, newDateUpdate, newTimeUpdate, newUserUpdate);
    }
}
