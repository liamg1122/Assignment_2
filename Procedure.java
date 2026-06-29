/*
 * Class: CMSC203 40539
 * Instructor:Professor Grinberg
 * Due: 6/29/2026
 * Platform/compiler:ECLIPSE
 * Description: Class represents a medical procedure, with relevant variables for procedure data 
 * and methods for getting and setting values, as well as string builders.
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Liam Ghershony
 */

package application;

/**
 * Class represents a medical procedure: its schedule, provider, and cost.
 */

public class Procedure {

	private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double charge;
    /**
     * Default constructor. No-arg.
     */
    
    public Procedure() {
        this.procedureName = "";
        this.procedureDate = "";
        this.practitionerName = "";
        this.charge = 0.0;
    }
    
    /**
     * Initializes procedure name and date only.
     */
    
    public Procedure(String procedureName, String procedureDate) {
        this();
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }
    
    /**
     * Initializes all attributes of the procedure.
     */
    public Procedure(String procedureName, String procedureDate, String practitionerName, double charge) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.charge = charge;
    }
    
    // Accessors and Mutators
    
    /** @return The procedure name */
    public String getProcedureName() { return procedureName; }
    /** @return The date of the procedure */
    public String getProcedureDate() { return procedureDate; }
    /** @return The practitioner name */
    public String getPractitionerName() { return practitionerName; }
    /** @return The charge */
    public double getCharge() { return charge; }
    
    /** @param procedureName The procedure name to set */
    public void setProcedureName(String procedureName) { this.procedureName = procedureName; }
    /** @param procedureDate The procedure date to set */
    public void setProcedureDate(String procedureDate) { this.procedureDate = procedureDate; }
    /** @param practitionerName The practitioner name to set */
    public void setPractitionerName(String practitionerName) { this.practitionerName = practitionerName; }
    /** @param charge The charge to set */
    public void setCharge(double charge) { this.charge = charge; }
    
    /**
     * Returns a string summary of the procedure information.
     */
    @Override
    public String toString() {
        return "\tProcedure: " + procedureName + "\n" +
               "\tProcedure Date: " + procedureDate + "\n" +
               "\tPractitioner: " + practitionerName + "\n" +
               String.format("\tCharge: $%,.2f", charge);
    }
}
