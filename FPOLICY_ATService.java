package FIRSTDAO;

import java.sql.SQLException;
import java.util.List;

public class FPOLICY_ATService {
    private FPOLICY_ATDAO policyDAO;

    public FPOLICY_ATService() throws SQLException {
        this.policyDAO = new FPOLICY_ATDAO();
    }

    // Retrieve all policies
    public List<FPOLICY_AT> getAllPolicies() throws SQLException {
        return policyDAO.getAllPolicies();
    }

    // Retrieve a policy by POLNUMBER
    public FPOLICY_AT getPolicyByNumber(String polNumber) throws SQLException {
        return policyDAO.getPolicyByNumber(polNumber);
    }

    // Delete a policy by POLNUMBER
    public void deletePolicyByNumber(String polNumber) throws SQLException {
        policyDAO.deleteByPolNumber(polNumber);
    }

    // Update a policy
    public void updatePolicy(FPOLICY_AT policy) throws SQLException {
        policyDAO.updatePolicy(policy);
    }
}
