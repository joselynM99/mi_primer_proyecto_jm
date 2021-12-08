package com.ec.edu.inyeccion.dependencias.extendida;

public class Estudiante {
	protected String nombre;
	protected String apellido;
	protected Direccion direccion;
	
	
	
	public void pagarServipagos(String nombre) {
		
			System.out.println(nombre + " realiza el pago con tarjeta");
			System.out.println(nombre + " presenta el pago");
		
		}

	// Metodos Set y Get
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + "]";
	}
}