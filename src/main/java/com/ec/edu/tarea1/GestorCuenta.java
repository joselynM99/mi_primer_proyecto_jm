package com.ec.edu.tarea1;

public class GestorCuenta {

	private CuentaBancaria cuenta;
	private CuentaHabiente cliente;

	public GestorCuenta(CuentaHabiente cliente, CuentaBancaria cuenta) {
		this.cliente = cliente;
		this.cuenta = cuenta;
	}

	public String aperturarCuenta(String nombre, String apellido, int cedula, int numCuenta) {

		this.cliente.setNombre(nombre);
		this.cliente.setApellido(apellido);
		this.cliente.setCedula(cedula);
			
		this.cuenta.setCuentaHab(cliente);
		this.cuenta.setNumCuenta(numCuenta);
		this.cuenta.setSaldo(100);
		
		this.cuenta.calcularvalorInteres();
		
		System.out.println(this.cuenta);

		return "Cuenta aperturada";

	}

	// metodos get y set
	public CuentaBancaria getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaBancaria cuenta) {
		this.cuenta = cuenta;
	}

	public CuentaHabiente getCliente() {
		return cliente;
	}

	public void setCliente(CuentaHabiente cliente) {
		this.cliente = cliente;
	}

}
