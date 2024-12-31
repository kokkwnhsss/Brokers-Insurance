package FIRSTDAO;

import java.sql.SQLException;
import java.util.List;

public class BRANCH_DESKSERVISE {
    private BRANCH_DESKDAO branchDAO;

    public BRANCH_DESKSERVISE() throws SQLException {
        this.branchDAO = new  BRANCH_DESKDAO();
    }
    
    public List<BRANCH_DESKDAO> branchAll() throws SQLException {
        return branchDAO.branchAll();
    }

    public  BRANCH_DESKDAO branchById(String branchCd) throws SQLException {
        return branchDAO.branchById(branchCd);
    }
}
