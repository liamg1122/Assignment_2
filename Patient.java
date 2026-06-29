/*
 * Class: CMSC203 40539
 * Instructor:Professor Grinberg
 * Due: 6/29/2026
 * Platform/compiler:ECLIPSE
 * Description: Class represents a patient, with relevant variables for patient data 
 * and methods for getting and setting values, as well as string builders.
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Liam Ghershony
 */

package application;

/**
 * Class is representing a medical patient and their contact information.
 */
public class Patient {
	
 
    private String firstName;
    private String middleName;
    private String lastName;
    

    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    
   
    private String emergencyName;
    private String emergencyPhone;
    
    /**
     * Default constructor initializing empty strings.
     */
    public Patient() {
    	this.firstName = "";
        this.middleName = "";
        this.lastName = "";
        this.streetAddress = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
        this.phoneNumber = "";
        this.emergencyName = "";
        this.emergencyPhone = "";
    }
    
    /**
     * Initializes patient name, partial constructor.
     */
    public Patient(String firstName, String middleName, String lastName) {
    	this();
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.middleName = middleName;
    }
    
    /**
     * Initializes all patient attributes, full constructor.
     */
    public Patient(String firstName, String middleName, String lastName, 
            String streetAddress, String city, String state, String zipCode, 
            String phoneNumber, String emergencyName, String emergencyPhone) {
    	this.firstName = firstName;
    	this.middleName = middleName;
    	this.lastName = lastName;
    	this.streetAddress = streetAddress;
    	this.city = city;
    	this.state = state;
    	this.zipCode = zipCode;
    	this.phoneNumber = phoneNumber;
    	this.emergencyName = emergencyName;
    	this.emergencyPhone = emergencyPhone;
    }

    /**
     * Initializes everything excluding the patient's phone number, then calls the full constructor.
     */
    public Patient(String firstName, String middleName, String lastName, 
            String streetAddress, String city, String state, String zipCode, 
            String emergencyName, String emergencyPhone) {
 
		this(firstName, middleName, lastName, streetAddress, city, state, zipCode, "", emergencyName, emergencyPhone);
    }

    // Accessors and Mutators
    
    /** @return The first name */
    public String getFirstName() { return firstName; }
    /** @return The middle name */
    public String getMiddleName() { return middleName; }
    /** @return The last name */
    public String getLastName() { return lastName; }
    /** @return The street address */
    public String getStreetAddress() { return streetAddress; }
    /** @return The city */
    public String getCity() { return city; }
    /** @return The state */
    public String getState() { return state; }
    /** @return The ZIP code */
    public String getZipCode() { return zipCode; }
    /** @return The phone number */
    public String getPhoneNumber() { return phoneNumber; }
    /** @return The emergency contact name */
    public String getEmergencyName() { return emergencyName; }
    /** @return The emergency contact phone */
    public String getEmergencyPhone() { return emergencyPhone; }

    /** @param firstName The first name to set */
    public void setFirstName(String firstName) { this.firstName = firstName; }
    /** @param middleName The middle name to set */
    public void setMiddleName(String middleName) { this.middleName = middleName; }
    /** @param lastName The last name to set */
    public void setLastName(String lastName) { this.lastName = lastName; }
    /** @param streetAddress The street address to set */
    public void setStreetAddress(String streetAddress) { this.streetAddress = streetAddress; }
    /** @param city The city to set */
    public void setCity(String city) { this.city = city; }
    /** @param state The state to set */
    public void setState(String state) { this.state = state; }
    /** @param zipCode The ZIP code to set */
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }
    /** @param phoneNumber The phone number to set */
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    /** @param emergencyName The emergency name to set */
    public void setEmergencyName(String emergencyName) { this.emergencyName = emergencyName; }
    /** @param emergencyPhone The emergency phone to set */
    public void setEmergencyPhone(String emergencyPhone) { this.emergencyPhone = emergencyPhone; }

    /**
     * Concatenates first, middle, and last name.
     * @return full name string.
     */
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    /**
     * Builds string of full address for patient.
     * @return address string.
     */
    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zipCode;
    }

    /**
     * Build string of emergency contact info.
     * @return emergency contact string.
     */
    public String buildEmergencyContact() {
        return emergencyName + " " + emergencyPhone;
    }

    /**
     * Returns a string summary of the patient.
     */
    @Override
    public String toString() {
        return "  Patient info:\n" +
               "   Name: " + buildFullName() + "\n" +
               "   Address: " + buildAddress() + "\n" +
               "   Phone: " + phoneNumber + "\n" +
               "   Emergency Contact: " + buildEmergencyContact();
    }
}