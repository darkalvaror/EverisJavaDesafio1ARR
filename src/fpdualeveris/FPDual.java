package fpdualeveris;

import variables.Developer;

public class FPDual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variablesChallenge();
	}
	/** Creation of method "variablesChallenge()" */
	private static void variablesChallenge() {
		if (Developer.getEmployeeMaxNum() <= 127) {
		
		/** Creation of 4 new developers */
		Developer developer1 = new Developer("Fernando");
		Developer developer2 = new Developer("Antonio");
		Developer developer3 = new Developer("Manuel");
		Developer developer4 = new Developer("Alejandro");
		
		/** Show all the information about an employee */
		System.out.println(developer1.toString());
		System.out.println(developer4.toString());
		
		/** Show the new days of vacations */
		System.out.println(developer2.newDaysOfVacations(2));
		
		/** Show all the days of vacations */
		System.out.println("The days of vacations of " + developer3.getName() + " is: " + developer3.getVacationsDays());
		
		/** Show the ID */
		System.out.println("The ID of " + developer2.getName() + " is: " + developer2.getEmployeeID());
		
		/** Show the name of the business */
		System.out.println(Developer.getBusiness());
		
		/** If there are more than 127 employee, show this error */
		} else {
			System.out.println("There are more than 127 employee");
		}
		
	}
	
	
}
