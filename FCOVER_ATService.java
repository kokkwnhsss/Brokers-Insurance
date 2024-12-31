package FIRSTDAO;

package FIRSTDAO;

import java.sql.SQLException;
import java.util.List;

public class FCOVER_ATService {
    private FCOVER_ATDAO fcoverAtDAO;

    public FCOVER_ATService() throws SQLException {
        this.fcoverAtDAO = new FCOVER_ATDAO();
    }

    public FCOVER_AT findByPolNumber(String polNumber) throws SQLException {
        return fcoverAtDAO.findByPolNumber(polNumber);
    }

    public List<FCOVER_AT> findAll() throws SQLException {
        return fcoverAtDAO.findAll();
    }

    public void deleteByPolNumber(String polNumber) throws SQLException {
        fcoverAtDAO.deleteByPolNumber(polNumber);
    }

    public void updateByPolNumber(String polNumber, String newPolVer, String newPayCd, String newInsCd, String newCovCode,
                                  String newPayCdVer, String newInsCdVer, String newCovCodeVer, String newTrpCd,
                                  int newCovAa, float newCovMf, int newAgeCalc, int newYearsPaid, 
                                  String newDtEndPayCov, int newDurationCov, int newAgeEnd) throws SQLException {
        fcoverAtDAO.updateByPolNumber(polNumber, newPolVer, newPayCd, newInsCd, newCovCode,
                                      newPayCdVer, newInsCdVer, newCovCodeVer, newTrpCd,
                                      newCovAa, newCovMf, newAgeCalc, newYearsPaid, 
                                      newDtEndPayCov, newDurationCov, newAgeEnd);
    }
}
