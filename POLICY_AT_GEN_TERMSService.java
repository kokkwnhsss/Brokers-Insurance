package FIRSTDAO;

import java.sql.SQLException;
import java.util.List;

public class POLICY_AT_GEN_TERMSService {
    private POLICY_AT_GEN_TERMSDAO policyDAO;

    public POLICY_AT_GEN_TERMSService() throws SQLException {
        this.policyDAO = new POLICY_AT_GEN_TERMSDAO();
    }

    // Retrieve all policies
    public List<POLICY_AT_GEN_TERMS> getAllPolicies() throws SQLException {
        return policyDAO.getAll();
    }

    // Retrieve a policy by POLNUMBER
    public POLICY_AT_GEN_TERMS getPolicyByNumber(String polNumber) throws SQLException {
        return policyDAO.getByPolNumber(polNumber);
    }

    // Delete a policy by POLNUMBER
    public void deletePolicyByNumber(String polNumber) throws SQLException {
        policyDAO.deleteByPolNumber(polNumber);
    }

    // Update a policy
    public void updatePolicy(POLICY_AT_GEN_TERMS policy) throws SQLException {
        policyDAO.updatePolicy(policy);
    }
}
