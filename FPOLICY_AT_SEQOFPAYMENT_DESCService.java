package FIRSTDAO;

import java.sql.SQLException;
import java.util.List;

public class FPOLICY_AT_SEQOFPAYMENT_DESCService {

    private FPOLICY_AT_SEQOFPAYMENT_DESCDao dao;

    public FPOLICY_AT_SEQOFPAYMENT_DESCService() throws SQLException {
        this.dao = new FPOLICY_AT_SEQOFPAYMENT_DESCDao();
    }

    // Retrieve all records
    public List<FPOLICY_AT_SEQOFPAYMENT_DESC> getAllRecords() throws SQLException {
        return dao.getAll();
    }

    // Retrieve a record by SEQOFPAYMENT_CD
    public FPOLICY_AT_SEQOFPAYMENT_DESC getRecordBySeqOfPaymentCd(String seqOfPaymentCd) throws SQLException {
        return dao.getBySeqOfPaymentCd(seqOfPaymentCd);
    }

    // Delete a record by SEQOFPAYMENT_CD
    public void deleteRecordBySeqOfPaymentCd(String seqOfPaymentCd) throws SQLException {
        dao.deleteBySeqOfPaymentCd(seqOfPaymentCd);
    }

    // Update a record
    public void updateRecord(FPOLICY_AT_SEQOFPAYMENT_DESC record) throws SQLException {
        dao.updateRecord(record);
    }
}
