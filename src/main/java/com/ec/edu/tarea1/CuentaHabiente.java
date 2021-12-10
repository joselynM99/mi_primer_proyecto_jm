package com.ec.edu.tarea1;

public class CuentaHabiente {
	private String nombre;
	private String apellido;
	private int cedula;
	
	
	//Metodos Set y Get
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
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	
	@Override
	public String toString() {
		return "CuentaHabiente [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + "]";
	}
	
	

}
