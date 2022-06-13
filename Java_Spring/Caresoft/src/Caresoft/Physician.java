package Caresoft;

import java.util.ArrayList;

public class Physician  extends User implements HIPAACompliantUser    {

	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		if(pin<1000||pin>9999 )return false;
				this.pin=pin;
		return true;
	}

	@Override
	public Integer accessAuthorized(Integer confirmedAuthID) {
		return confirmedAuthID=pin;
	}
	
//... imports class definition...
    
    // Inside class:    
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
    public Physician(int id){
    	this.ID=ID;
    }
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.ID);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
	
   
    
};
