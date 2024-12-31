package FIRSTDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class HealthinDAO {

	public HealthinDAO() throws SQLException {
		
	
	
	}



   public Healthin HealthByID(int clientid ) throws SQLException {
	   
	// TODO Auto-generated constructor stub
		
	   Healthin Health=null;
			String url = "jdbc:sqlserver://GIVE YOUR DATABASE HERE";
			
			Connection conn = null;
	        conn = DriverManager.getConnection(url);
		
	        Statement stmt = conn.createStatement();
	        
	        
	        String sql = "select * from customer where client_id =" + clientid;
	        
	        ResultSet rs = stmt.executeQuery(sql);
	            
	            // Check if a row is found
	            if (rs.next()) {
	                
	            	
	            	
	            	Health  = new Healthin (
                            
	            			rs.getString("health_insurance_id"), 
	            			
	            			rs.getString("client_id"), 
	            			
	            			rs.getString("medical_conditions"), 
	            			
	            			rs.getString("medications"), 
	            			
	            			rs.getString("ongoing_treatments"), 
	            			
	            			rs.getString("family_medical_history"), 
	            			
	            			rs.getString("preferred_doctors"), 
	            		
	            			
	            			rs.getString("healthins_id")
	            				            				            			
	            			
	            			
	            			
	            			
	            			);
	            
	            
	            
	            
	            
	            
	            } else {
//	                System.out.println("No property found with client_id: " + clientId);
	            }
				return Health;
	        
				
				
			
			
			
			
//	    	Connection conn = null;
//	        
//
//	    	
//	        conn = DriverManager.getConnection(url);
//	        System.out.println("Connection established.");
//
//	     // Create a Statement
//	        Statement stmt = conn.createStatement();
//
////	        String sql = "INSERT INTO PersonalInfo (first_name, last_name, email, phone_number, address, occupation, prior_insurance_history, reason, budget, client_id) " + 
////	                "VALUES ('" + firstName + "', '" + lastName + "', '" + email + "', '" + phoneNumber + "', '" + address + "', '" + occupation + "', '" + priorInsuranceHistory + "', '" + reason + "', " + budget + ", '" + clientId + "')";
////	        
////	        
////	        int rowsInserted = stmt.executeUpdate(sql);
////	        System.out.println(rowsInserted + " row(s) inserted.");
////	    	
//	        stmt.close();
//	        conn.close();
		
	   
	   
	   
   }



   public List<Healthin> HealthALL() throws SQLException {
	   
	  
	      List<Healthin> healthList = new ArrayList<>();
	   
		// TODO Auto-generated constructor stub
			
		   Healthin HealthALL;
				String url = "jdbc:sqlserver://GIVE YOUR DATABASE HERE";
				
				Connection conn = null;
		        conn = DriverManager.getConnection(url);
			
		        Statement stmt = conn.createStatement();
		        
		        
		        String sql = "select * from Healthin =";
		        
		        ResultSet rs = stmt.executeQuery(sql);
		            
		            // Check if a row is found
		            if (rs.next()) {
		                
		            	
		            	
		            	HealthALL = new Healthin (
	                            
		            			rs.getString("health_insurance_id"), 
		            			
		            			rs.getString("client_id"), 
		            			
		            			rs.getString("medical_conditions"), 
		            			
		            			rs.getFloat("medications"), 
		            			
		            			rs.getString("ongoing_treatments"), 
		            			
		            			rs.getString("family_medical_history"), 
		            			
		            			rs.getString("preferred_doctors"), 
		            		
		            			
		            			rs.getString("healthins_id")
		            				            				            			
		            			
		            			
		            			
		            			
		            			);
		            
		            	 healthList.add(HealthALL); // Add each customer to the list
		            }
		            
		                 
		            
		            
   
                        else 
		            
		            
		            {
//		                System.out.println("No property found with client_id: " + clientId);
		            }
					
					return healthList;
   }
   
					  public void DeleteByID(int clientid ) throws SQLException {
						   
							// TODO Auto-generated constructor stub
								
							   Healthin Health=null;
									String url = "jdbc:sqlserver://GIVE YOUR DATABASE HERE";
									
									Connection conn = null;
							        conn = DriverManager.getConnection(url);
								
							        Statement stmt = conn.createStatement();
							        
							        
							        String sql = "DELETE * from health where client_id =" + clientid;
							        
							        ResultSet rs = stmt.executeQuery(sql);
							        
					  }   
					  
						
					  
					  
					  public void updateHealthinById(int clientId, String newhealth_insurance_id, String newhealth_status, String newmedical_conditions, String newmedications, String newongoing_treatments, String newfamily_medical_history, String newpreferred_doctors, String Healthins_id) throws SQLException {
					        String url = "jdbc:sqlserver://GIVE YOUR DATABASE HERE";
					          try (Connection conn = DriverManager.getConnection(url);
					                 Statement stmt = conn.createStatement()) {

					        	  String sql = "UPDATE customer SET " +
				                             "health_insurance_id = '" + newhealth_insurance_id + "', " +
				                             "health_status = '" + newhealth_status + "', " +
				                             "medical_conditions = '" + newmedical_conditions + "', " +
				                             "medications = '" + newmedications + "', " +
				                             "ongoing_treatments = '" + newongoing_treatments + "', " +
				                             "family_medical_history = '" + newfamily_medical_history + "', " +
				                             "preferred_doctors = '" + newpreferred_doctors + "', " +
				                             "healthins_id = '" + newHealthins_id + "', " +
				                             "WHERE client_id = " + newclient_id;

					          

							           




