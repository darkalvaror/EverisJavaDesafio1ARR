package variables;

/**
 * Desafio Everis
 * 
 * @author alvaro
 *
 */
public class Developer {

	/** Methods */
	private String name;
	private int vactionsDays = 21;
	private static byte employeeNum = 0;
	private static final String BUSINESS = "EVERIS";
	private byte employeeID;
	private static final short EMPLOYEEMAXNUM = 127;

	/** Attribute for developers */
	public Developer(String name) {

		employeeNum++;
		this.name = name;
		employeeID = employeeNum;
	}

	/**
	 *  Getters and setters
	 * 
	 * Get the name
	*/
	public String getName() {
		return name;
	}

	/** Set the name */
	public void setName(String name) {
		this.name = name;
	}

	/** Get the vacations */
	public int getVacationsDays() {
		return vactionsDays;
	}

	/** Get the employee ID */
	public byte getEmployeeID() {
		return employeeID;
	}

	/** Set the employee ID */
	public void setEmployeeID(byte idEmpleado) {
		employeeID = idEmpleado;
	}

	/** Get the name of the business */
	public static String getBusiness() {
		return BUSINESS;
	}

	/** Get the limit of employee in the business */
	public static short getEmployeeMaxNum() {
		return EMPLOYEEMAXNUM;
	}

	/** Set the vacations days for an employee */
	public void setVacationsDays(int diasVacaciones) {
		this.vactionsDays = diasVacaciones;
	}

	/** Establish the new days of vacations */
	public String newDaysOfVacations(int dias) {
		int resultado = 0;
		if (this.getVacationsDays() >= dias && dias > 0) {
			resultado = this.getVacationsDays() - dias;
			this.setVacationsDays(resultado);
		}
		return this.getName() + " now has " + resultado
				+ " days of vacations";
	}

	/** Generation of "toString()" to show the results */
	@Override
	public String toString() {
		return "Developer [Name=" + name + ", Total employees=" + employeeNum + ", Employee ID="
				+ employeeID + ", Days of vacations=" + vactionsDays + "]";
	}

}
