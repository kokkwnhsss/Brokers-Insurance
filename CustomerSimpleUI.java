package FIRSTDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List; 
import java.util.Scanner;







public class CustomerSimpleUI {
	public static CustomerService customerS;
	
	public CustomerSimpleUI() throws SQLException {
		// TODO Auto-generated constructor stub
	
     
} 
	

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		customerS = new CustomerService();
		List<Customer>  list = customerS.CustomerALL(); 
		
		for (Customer x : list) { 
           
			Scanner myObj = new Scanner(System.in);  
			System.out.println("Show all clients? (yes/no)");
			String userResponse = myObj.nextLine();  

			if (userResponse.equalsIgnoreCase("yes")) {
			    for (Customer xx : list) { 
			        System.out.println("ID: " + xx.getclient_id() + " Name: " + xx.getFirstName() + 
			                           " Address: " + xx.getAddress() + " Email: " + xx.getEmail());
			    }
			} else {
			    System.out.println("No clients displayed.");
			}
//			myObj.nextLine();
		} 
		
		
		
		Scanner myObj1 = new Scanner(System.in);  
		//myObj1.nextLine();  
		System.out.println("What Customer_ID you want to check??)");
		
		 int myid =  myObj1.nextInt();
		 System.out.println(myid);
		 
		
		Customer  mycust ;
		mycust = customerS.CustomerByID(myid); 
		 
		 
		 System.out.println("ID: " + mycust.getclient_id() + " Name: " + mycust.getFirstName() + 
                 " Address: " + mycust.getAddress() + " Email: " + mycust.getEmail());
	}

}
