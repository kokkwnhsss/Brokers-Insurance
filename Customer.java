package FIRSTDAO;

public class Customer {
	   
    private String firstName;
    private String lastName;
    private String email;
    private float phonenumber;
    private String address;
    private String occupation;
    private String priorInsuranceHistory;
    private String reason;
    private float budget;
    
    private String client_id;

    
    public Customer(String firstName, String lastName, String email, float phonenumber, String address, 
                    String occupation, String priorInsuranceHistory, String reason, float budget, String client_id) {
	        
    	
    	    this.firstName = firstName;
	        this.lastName = lastName;
	        this.email = email;
	        this.phonenumber = phonenumber;
	        this.address = address;
	        this.occupation = occupation;
	        this.priorInsuranceHistory = priorInsuranceHistory;
	        this.reason = reason;
	        this.budget = budget;
	        this.client_id = client_id;
    
            }
    
		    public String getFirstName() {
		        return firstName;
		    }
		
		    public void setFirstName(String firstName) {
		        this.firstName = firstName;
		    }
		
		    public String getLastName() {
		        return lastName;
		    }
		
		    public void setLastName(String lastName) {
		        this.lastName = lastName;
		    }
		
		    public String getEmail() {
		        return email;
		    }
		
		    public void setEmail(String email) {
		        this.email = email;
		    }
		
		    public float getphonenumber() {
		        return phonenumber;
		    }
		
		    public void setphonenumber(float phonenumber) {
		        this.phonenumber = phonenumber;
		    }
		
		    public String getAddress() {
		        return address;
		    }
		
		    public void setAddress(String address) {
		        this.address = address;
		    }
		
		    public String getOccupation() {
		        return occupation;
		    }
		
		    public void setOccupation(String occupation) {
		        this.occupation = occupation;
		    }
		
		    public String getPriorInsuranceHistory() {
		        return priorInsuranceHistory;
		    }
		
		    public void setPriorInsuranceHistory(String priorInsuranceHistory) {
		        this.priorInsuranceHistory = priorInsuranceHistory;
		    }
		
		    public String getReason() {
		        return reason;
		    }
		
		    public void setReason(String reason) {
		        this.reason = reason;
		    }
		
		    public float getBudget() {
		        return budget;
		    }
		
		    public void setBudget(float budget) {
		        this.budget = budget;
		    }
		
		    public String getclient_id() {
		        return client_id;
		    }
		
		    public void setclient_id(String client_id) {
		        this.client_id = client_id;
		    }
		    
    }
    