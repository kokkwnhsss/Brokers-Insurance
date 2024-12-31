package FIRSTDAO;

import java.sql.SQLException;
import java.util.List;

public class FRECEIPT_AT_HService {

    private FRECEIPT_AT_HDao dao;

    public FRECEIPT_AT_HService() throws SQLException {
        this.dao = new FRECEIPT_AT_HDao();
    }

    // Retrieve all records
    public List<FRECEIPT_AT_H> getAllRecords() throws SQLException {
        return dao.getAll();
    }

    // Retrieve a record by POLNUMBER
    public FRECEIPT_AT_H getRecordByPolNumber(String polNumber) throws SQLException {
        return dao.getByPolNumber(polNumber);
    }

    // Delete a record by POLNUMBER
    public void deleteRecordByPolNumber(String polNumber) throws SQLException {
        dao.deleteByPolNumber(polNumber);
    }

    // Update a record
    public void updateRecord(FRECEIPT_AT_H record) throws SQLException {
        dao.updateRecord(record);
    }
}
