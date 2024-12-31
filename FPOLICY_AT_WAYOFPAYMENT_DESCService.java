package FIRSTDAO;

import java.sql.SQLException;
import java.util.List;

public class FPOLICY_AT_WAYOFPAYMENT_DESCService {

    private FPOLICY_AT_WAYOFPAYMENT_DESCDao dao;

    public FPOLICY_AT_WAYOFPAYMENT_DESCService() throws SQLException {
        this.dao = new FPOLICY_AT_WAYOFPAYMENT_DESCDao();
    }

    // Retrieve all records
    public List<FPOLICY_AT_WAYOFPAYMENT_DESC> getAllRecords() throws SQLException {
        return dao.getAll();
    }

    // Retrieve a record by WAYOFPAYMENT_CD
    public FPOLICY_AT_WAYOFPAYMENT_DESC getRecordByWayOfPaymentCd(String wayOfPaymentCd) throws SQLException {
        return dao.getByWayOfPaymentCd(wayOfPaymentCd);
    }

    // Delete a record by WAYOFPAYMENT_CD
    public void deleteRecordByWayOfPaymentCd(String wayOfPaymentCd) throws SQLException {
        dao.deleteByWayOfPaymentCd(wayOfPaymentCd);
    }

    // Update a record
    public void updateRecord(FPOLICY_AT_WAYOFPAYMENT_DESC record) throws SQLException {
        dao.updateRecord(record);
    }
}
