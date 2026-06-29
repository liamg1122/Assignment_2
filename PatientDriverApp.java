/*
 * Class: CMSC203 40539
 * Instructor:Professor Grinberg
 * Due: 6/29/2026
 * Platform/compiler:ECLIPSE
 * Description: Driver for patient and procedure classes. Creates one instance of the patient class
 * and subsequently 3 instances of procedure for that patient. Handles certain incorrect inputs or negative
 * numeric inputs. Computes total charges and finally displays all of the patient and procedure information.
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Liam Ghershony
 */


package application;

import java.util.Scanner;

public class PatientDriverApp {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        // 1. Initialize class of Patient using the no-arg constructor
        Patient patient = new Patient();

        // 2. reading all inputs from the user for patient text fields
        System.out.println("--- Enter Patient User Interface Fields ---");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine().trim();
        System.out.print("Middle Name: ");
        String middleName = scanner.nextLine().trim();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine().trim();
        System.out.print("Street Address: ");
        String streetAddress = scanner.nextLine().trim();
        System.out.print("City: ");
        String city = scanner.nextLine().trim();
        System.out.print("State: ");
        String state = scanner.nextLine().trim();
        System.out.print("ZIP code: ");
        String zipCode = scanner.nextLine().trim();
        System.out.print("Phone number (e.g. 301-123-4567): ");
        String phoneNumber = scanner.nextLine().trim();
        System.out.print("Emergency Contact Name: ");
        String emergencyName = scanner.nextLine().trim();
        System.out.print("Emergency Contact Phone: ");
        String emergencyPhone = scanner.nextLine().trim();

        // 3. Conditional validation: if the user input a field, then set that field to input value
        if (!firstName.isEmpty()) patient.setFirstName(firstName);
        if (!middleName.isEmpty()) patient.setMiddleName(middleName);
        if (!lastName.isEmpty()) patient.setLastName(lastName);
        if (!streetAddress.isEmpty()) patient.setStreetAddress(streetAddress);
        if (!city.isEmpty()) patient.setCity(city);
        if (!state.isEmpty()) patient.setState(state);
        if (!zipCode.isEmpty()) patient.setZipCode(zipCode);
        if (!phoneNumber.isEmpty()) patient.setPhoneNumber(phoneNumber);
        if (!emergencyName.isEmpty()) patient.setEmergencyName(emergencyName);
        if (!emergencyPhone.isEmpty()) patient.setEmergencyPhone(emergencyPhone);

        // 4. for each procedure from 1 to 3
        Procedure[] procedures = new Procedure[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Enter Interface Fields for Procedure " + (i + 1) + " ---");
            
            // Initialize using the no-arg constructor
            procedures[i] = new Procedure();

            System.out.print("Procedure Name: ");
            String procName = scanner.nextLine().trim();
            System.out.print("Procedure Date (MM/DD/YYYY): ");
            String procDate = scanner.nextLine().trim();
            System.out.print("Practitioner Name: ");
            String pracName = scanner.nextLine().trim();
            System.out.print("Charges: ");
            String chargesText = scanner.nextLine().trim();

            if (!procName.isEmpty()) procedures[i].setProcedureName(procName);
            if (!procDate.isEmpty()) procedures[i].setProcedureDate(procDate);
            if (!pracName.isEmpty()) procedures[i].setPractitionerName(pracName);
            
            // parsing to handle inputs with "$" or other typos
            if (!chargesText.isEmpty()) {
                try {
                    String correctCharges = chargesText.replace("$", "").trim();
                    double numericCharge = Double.parseDouble(correctCharges);
                    
                    if (numericCharge < 0) {
                        procedures[i].setCharge(0.0); // Handling negative charge values
                    } else {
                        procedures[i].setCharge(numericCharge);
                    }
                } catch (NumberFormatException e) {
                    procedures[i].setCharge(0.0); 
                }
            } else {
                procedures[i].setCharge(0.0);
            }
        }

        // 5. Use ToString on the patient instance
        System.out.println("\n==================================================");
        System.out.println(patient.toString());

        // 6. for each procedure from 1 to 3 display heading
        for (int i = 0; i < 3; i++) {
            System.out.println("\n Procedure " + (i + 1) + ":");
            System.out.println(procedures[i].toString());
        }

        // 7. get charges for each procedure and add them to compute the total
        double totalCosts = procedures[0].getCharge() + procedures[1].getCharge() + procedures[2].getCharge();

        System.out.println("\n--------------------------------------------------");
        System.out.printf("Total Charges: $%,.2f\n", totalCosts);
        System.out.println("----------------------------------------------------");

        System.out.println("\nThe program was developed by a Student: Liam Ghershony 06/29/2026");

        scanner.close();
    }
}