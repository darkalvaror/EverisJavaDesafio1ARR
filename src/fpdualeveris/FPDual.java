package fpdualeveris;

import variables.Developer;

public class FPDual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variablesChallenge();
	}
	private static void variablesChallenge() {
		if (Developer.getNummaxempleados() <= 127) {
		
		//Creación de 4 nuevos empleados
		Developer developer1 = new Developer("Fernando");
		Developer developer2 = new Developer("Antonio");
		Developer developer3 = new Developer("Manuel");
		Developer developer4 = new Developer("Alejandro");
		
		//Mostrar total empleados en la empresa
		System.out.println(developer1.toString());
		System.out.println(developer4.toString());
		
		//Restar dias al segundo desarrollador
		System.out.println(developer2.restarDias(2));
		
		//Mostrar los dias de vacaciones de un desarrollador
		System.out.println("El total de dias del empleado " + developer3.getNombre() + " es: " + developer3.getDiasVacaciones());
		
		//Mostrar ID de un empleado
		System.out.println("El ID del empleado " + developer2.getNombre() + " es: " + developer2.getIdEmpleado());
		
		//Mostrar nombre de la empresa
		System.out.println(Developer.getEmpresa());
		
		//Si hay más de 127 empleados mostrará este error
		} else {
			System.out.println("Hay más de 127 empleados");
		}
		
	}
	
	
}
