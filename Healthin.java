package FIRSTDAO;

public class Healthin {

    private String health_insurance_id;
    private String client_id;
    private String health_status;
    private String medical_conditions;
    private String medications;
    private String ongoing_treatments;
    private String family_medical_history;
    private String preferred_doctors;
    private String healthins_id;

    public Healthin(String health_insurance_id, String client_id, String health_status, 
                     String medications, String ongoing_treatments, String family_medical_history, 
                     String preferred_doctors) 
    
    {
        
        this.health_insurance_id = health_insurance_id;
        this.client_id = client_id;
        this.health_status = health_status;
        this.medical_conditions = medical_conditions;
        this.medications = medications;
        this.ongoing_treatments = ongoing_treatments;
        this.family_medical_history = family_medical_history;
        this.preferred_doctors = preferred_doctors;
        this.healthins_id = healthins_id;
    }

    public String getHealthInsuranceId() {
        return health_insurance_id;
    }

    public void setHealthInsuranceId(String health_insurance_id) {
        this.health_insurance_id = health_insurance_id;
    }

    public String getClientId() {
        return client_id;
    }

    public void setClientId(String client_id) {
        this.client_id = client_id;
    }

    public String getHealthStatus() {
        return health_status;
    }

    public void setHealthStatus(String health_status) {
        this.health_status = health_status;
    }

    public String getMedicalConditions() {
        return medical_conditions;
    }

    public void setMedicalConditions(String medical_conditions) {
        this.medical_conditions = medical_conditions;
    }

    public String getMedications() {
        return medications;
    }

    public void setMedications(String medications) {
        this.medications = medications;
    }

    public String getOngoingTreatments() {
        return ongoing_treatments;
    }

    public void setOngoingTreatments(String ongoing_treatments) {
        this.ongoing_treatments = ongoing_treatments;
    }

    public String getFamilyMedicalHistory() {
        return family_medical_history;
    }

    public void setFamilyMedicalHistory(String family_medical_history) {
        this.family_medical_history = family_medical_history;
    }

    public String getPreferredDoctors() {
        return preferred_doctors;
    }

    public void setPreferredDoctors(String preferred_doctors) {
        this.preferred_doctors = preferred_doctors;
    }

    public String getHealthinsId() {
        return healthins_id;
    }

    public void setHealthinsId(String healthins_id) {
        this.healthins_id = healthins_id;
    }
}
