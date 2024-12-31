package FIRSTDAO;

import java.sql.SQLException;
import java.util.List;

public class HealthinsService {
	private HealthinDAO healthDAO;

    public HealthinsService() throws SQLException {
        this.healthDAO = new HealthinDAO();
    }
	 
    
    public List<Healthin> HealthALL() throws SQLException {

     return HealthinDAO.HealthALL();
}

	 


public Healthin HealthrByID(int clientid ) throws SQLException {
	Healthin health=null;
	
	
	return health;
	
	}
}
