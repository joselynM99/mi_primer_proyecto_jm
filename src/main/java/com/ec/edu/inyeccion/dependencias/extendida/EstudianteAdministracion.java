package com.ec.edu.inyeccion.dependencias.extendida;

public class EstudianteAdministracion extends Estudiante {
	private String niffContabilidad;
	
	public void pagarServipagos(String nombre) {
		System.out.println(nombre + " realiza el pago");
		System.out.println(nombre + " presenta el pago");
		System.out.println(nombre + "Transferencia");
	}

	public String getNiffContabilidad() {
		return niffContabilidad;
	}

	public void setNiffContabilidad(String niffContabilidad) {
		this.niffContabilidad = niffContabilidad;
	}
	
	

}
