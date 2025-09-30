/*
 * Class: CMSC203 
 * Instructor: Prof. Eivazi
 * Description: (Give a brief description for each Class) - Patient class creates patient objects with personal
 *  info and contact info, procedure class creates procedure objects that manages aspects of different procedure,
 * and the driver class that runs  
 * Due:09/29/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Bhavya Aji
*/

import java.util.Scanner;

public class PatientDriverApp {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Patient info: ");
		System.out.print("Enter First Name: \n");
		String fName = input.nextLine();
		System.out.print("Enter Middle Name: \n");
		String mName = input.nextLine();
		System.out.print("Enter Last Name: \n");
		String lName = input.nextLine();

		System.out.print("Enter Street: ");
		String street = input.nextLine();

		System.out.print("Enter City: ");
		String city = input.nextLine();

		System.out.print("Enter State: ");
		String state = input.nextLine();

		System.out.print("Enter ZIP: ");
		int zip = Integer.parseInt(input.nextLine());

		System.out.print("Enter Phone Number: ");
		String phone = input.nextLine();

		System.out.print("Enter Emergency Contact Name: ");
		String contactName = input.nextLine();

		System.out.print("Enter Emergency Contact Number: ");
		String contactNum = input.nextLine();
		System.out.println();
		System.out.println();
		Patient patient = new Patient(fName, mName, lName, street, city, state, zip, phone, contactName, contactNum);

		System.out.println("\nProcedure:");
		System.out.print("Name: ");
		String proc1Name = input.nextLine();
		System.out.print("Date (MM/DD/YYYY): ");
		String proc1Date = input.nextLine();
		System.out.print("Practitioner: ");
		String proc1Practitioner = input.nextLine();
		System.out.print("Charges: ");
		double proc1Charges = Double.parseDouble(input.nextLine());
		Procedure p1 = new Procedure();
		p1.setName(proc1Name);
		p1.setDate(proc1Date);
		p1.setPractitioner(proc1Practitioner);
		p1.setCharges(proc1Charges);

		System.out.println("\nEnter Procedure 2 details:");
		System.out.print("Name: ");
		String proc2Name = input.nextLine();
		System.out.print("Date (MM/DD/YYYY): ");
		String proc2Date = input.nextLine();
		System.out.print("Practitioner: ");
		String proc2Practitioner = input.nextLine();
		System.out.print("Charges: ");
		double proc2Charges = Double.parseDouble(input.nextLine());
		Procedure p2 = new Procedure(proc2Name, proc2Date);
		p2.setPractitioner(proc2Practitioner);
		p2.setCharges(proc2Charges);

		System.out.println("\nEnter Procedure 3 details:");
		System.out.print("Name: ");
		String proc3Name = input.nextLine();
		System.out.print("Date (MM/DD/YYYY): ");
		String proc3Date = input.nextLine();
		System.out.print("Practitioner: ");
		String proc3Practitioner = input.nextLine();
		System.out.print("Charges: ");
		double proc3Charges = Double.parseDouble(input.nextLine());
		Procedure p3 = new Procedure(proc3Name, proc3Date, proc3Practitioner, proc3Charges);
		System.out.println();
		displayPatient(patient);
		System.out.println();

		displayProcedure(p1);
		System.out.println();

		displayProcedure(p2);
		System.out.println();

		displayProcedure(p3);

		double total = calculateTotalCharges(p1, p2, p3);
		System.out.printf("%nTotal Charges: $%,.2f%n", total);

		input.close();

		System.out.println("\nStudent Name : Bhavya Aji\nMC# M21191702\n09/29/2025");
	}

//calls tostring of patient class
	public static void displayPatient(Patient patient) {
		System.out.println("Patient info:\n" + patient);
	}

//calls tstring of procedure class
	public static void displayProcedure(Procedure procedure) {
		System.out.println(procedure);
	}

//calculates the total change by adding together using get
	public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
		return p1.getCharges() + p2.getCharges() + p3.getCharges();
	}
}
