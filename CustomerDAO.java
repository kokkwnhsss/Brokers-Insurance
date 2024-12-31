package FIRSTDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class CustomerDAO {

	public CustomerDAO() throws SQLException {
		
	
	
	}



   public Customer CustomerByID(int clientid ) throws SQLException {
	   
	// TODO Auto-generated constructor stub
	   System.out.println("mphkaarxh"); 
	   Customer Cus = null;
			
	        String url = "jdbc:sqlserver://GIVE YOUR DATABASE HERE";
			
			Connection conn = null;
	        conn = DriverManager.getConnection(url);
		
	        Statement stmt = conn.createStatement();
	        
	        
	        String sql = "select * from customer where client_id = " + clientid ;
	        
	        ResultSet rs = stmt.executeQuery(sql);
	            
	            // Check if a row is found
	            if (rs.next()) {
	            	System.out.println("mphka");    
	            	
	            	
	            	Cus = new Customer(
                            
	            			rs.getString("firstName"), 
	            			
	            			rs.getString("lastName"), 
	            			
	            			rs.getString("email"), 
	            			
	            			rs.getFloat("phoneNumber"), 
	            			
	            			rs.getString("address"), 
	            			
	            			rs.getString("occupation"), 
	            			
	            			rs.getString("priorInsuranceHistory"), 
	            		
	            			
	            			rs.getString("reason"),
	            				            				            			
	            			rs.getFloat("budget"),
	            				            				            		     
	            			rs.getString("client_id")
	            			
	            			
	            			
	            			);
	            
	            
	            
	            
	            
	            
	            } else {
//	                System.out.println("No property found with client_id: " + clientId);
	            }
				return Cus;
	        
				
				
			
			
			
			
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



   public List<Customer> CustomerALL() throws SQLException {
	   
	  
	      List<Customer> customerList = new ArrayList<>();
	   
		// TODO Auto-generated constructor stub
			
		   Customer CusALL;
				String url = "jdbc:sqlserver://GIVE YOUR DATABASE HERE";
				
				Connection conn = null;
		        conn = DriverManager.getConnection(url);
			
		        Statement stmt = conn.createStatement();
		        
		        
		        String sql = "select * from customer ";
		        
		        ResultSet rs = stmt.executeQuery(sql);
		            
		            // Check if a row is found
		            while (rs.next()) {
		                
		            	
		            	
		            	CusALL = new Customer(
		            			
		            			rs.getString("firstName"), 
		            			
		            			rs.getString("lastName"), 
		            			
		            			rs.getString("email"), 
		            			
		            			rs.getFloat("phoneNumber"), 
		            			
		            			rs.getString("address"), 
		            			
		            			rs.getString("occupation"), 
		            			
		            			rs.getString("priorInsuranceHistory"), 
		            		
		            			
		            			rs.getString("reason"),
		            			
		            			
		            			
		            			rs.getFloat("budget"),
		            			
		            			
		            		     
		            			rs.getString("client_id")
		            			
		            			);
		            
		            	 customerList.add(CusALL); // Add each customer to the list
		            }
		            
		                 
		            
		            
//   
//                        else 
//		            
//		            
//		            {
////		                System.out.println("No property found with client_id: " + clientId);
//		            }
					
					return customerList;

   }
					  public void DeleteByID(int clientid ) throws SQLException {
						   
							// TODO Auto-generated constructor stub
								
							   Customer Cus=null;
									String url = "jdbc:sqlserver://GIVE YOUR DATABASE HERE";
									
									Connection conn = null;
							        conn = DriverManager.getConnection(url);
								
							        Statement stmt = conn.createStatement();
							        
							        
							        String sql = "DELETE * from customer where client_id =" + clientid;
							        
							        ResultSet rs = stmt.executeQuery(sql);
							        
					  }        
						
					  
					  
					  public void updateCustomerById(int clientId, String newFirstName, String newLastName, String newEmail, float newPhoneNumber, String newAddress, String newOccupation, String newPriorInsuranceHistory, String newReason, float newBudget) throws SQLException {
							            String url = "jdbc:sqlserver://GIVE YOUR DATABASE HERE";

							            // Using try-with-resources to handle resource closing
							            try (Connection conn = DriverManager.getConnection(url);
							                 Statement stmt = conn.createStatement()) {

							                // SQL update query with dynamic data
							                String sql = "UPDATE customer SET " +
							                             "firstName = '" + newFirstName + "', " +
							                             "lastName = '" + newLastName + "', " +
							                             "email = '" + newEmail + "', " +
							                             "phoneNumber = " + newPhoneNumber + ", " +
							                             "address = '" + newAddress + "', " +
							                             "occupation = '" + newOccupation + "', " +
							                             "priorInsuranceHistory = '" + newPriorInsuranceHistory + "', " +
							                             "reason = '" + newReason + "', " +
							                             "budget = " + newBudget +
							                             " WHERE client_id = " + clientId;











   
   
   





}
   
}
}