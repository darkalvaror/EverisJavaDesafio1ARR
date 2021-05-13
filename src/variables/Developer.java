package variables;

public class Developer {
	
	//Atributos necesarios
	private String nombre;
	private int diasVacaciones = 21;
	private static byte numEmpleados = 0;
	private static final String EMPRESA = "EVERIS";
	private byte IdEmpleado;
	private static final short NUMMAXEMPLEADOS = 127;
	
	//Método constructor para crear a desarrolladores
	public Developer(String nombre) {
		numEmpleados++;
		this.nombre = nombre;
		IdEmpleado = numEmpleados;
	}
	
	//Getters and setters
	//Obtener el nombre de un empleado
	public String getNombre() {
		return nombre;
	}
	
	//Establecer el nombre de un empleado
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Obtener los dias de vacaciones de un empleado
	public int getDiasVacaciones() {
		return diasVacaciones;
	}
	
	//Obtener el ID de un empleado
	public byte getIdEmpleado() {
		return IdEmpleado;
	}
	
	//Establecer el ID de un empleado
	public void setIdEmpleado(byte idEmpleado) {
		IdEmpleado = idEmpleado;
	}
	
	//Obtener el nombre de la empresa
	public static String getEmpresa() {
		return EMPRESA;
	}
	
	//Obtener el número máximos que puede haber en la empresa
	public static short getNummaxempleados() {
		return NUMMAXEMPLEADOS;
	}
	
	//Establecer dias de vacaciones 
	public void setDiasVacaciones(int diasVacaciones) {
		this.diasVacaciones = diasVacaciones;
	}
	
	//Métodos
	//Método para restar días a un desarrollador
	public String restarDias(int dias) {
		int resultado = 0;
		if (this.getDiasVacaciones() >= dias && dias > 0) {
		 resultado = this.getDiasVacaciones() - dias;
		 this.setDiasVacaciones(resultado);
		}
		return "Le ha restado a " + this.getNombre() + " " + dias + " dias, y ahora tiene un total de " + resultado + " dias.";
	}
	
	//Generación de un toString() para mostrarlo en la main
	@Override
	public String toString() {
		return "Developer [Nombre=" + nombre + ", Numero de empleados totales=" + numEmpleados + ", ID de empleado=" + IdEmpleado + 
				", Dias de vacaciones disponibles=" + diasVacaciones + "]";
	}

}
