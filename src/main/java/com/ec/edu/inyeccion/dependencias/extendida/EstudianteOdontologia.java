package com.ec.edu.inyeccion.dependencias.extendida;

public class EstudianteOdontologia extends Estudiante{
	
	private String ciudadRural;

	public void pagarServipagos(String nombre) {
		System.out.println(nombre + " realiza el pago");
		System.out.println(nombre + " presenta el pago");
		System.out.println(nombre +" Efecivo");
	}

	// Metodos Set y Get

	

	public String getCiudadRural() {
		return ciudadRural;
	}

	public void setCiudadRural(String ciudadRural) {
		this.ciudadRural = ciudadRural;
	}

}