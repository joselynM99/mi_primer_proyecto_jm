package com.ec.edu.tarea1;

public class CuentaPoliza extends CuentaBancaria {

	private String fechaVigencia;
	
	public void calcularvalorInteres() {
		this.valInteres = this.saldo *15/100;
		System.out.println("Interes calculado: " + valInteres);
	}

	// metodos get y set
	public String getFechaVigencia() {
		return fechaVigencia;
	}

	public void setFechaVigencia(String fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}

}
