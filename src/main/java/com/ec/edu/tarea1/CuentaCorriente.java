package com.ec.edu.tarea1;

public class CuentaCorriente extends CuentaBancaria {
	private double montoMinimo;
	
	public void calcularvalorInteres() {
		this.valInteres = this.saldo *8/100;
		System.out.println("Interes calculado: " + valInteres);
	}
	

	// metodos get y set
	public double getMontoMinimo() {
		return montoMinimo;
	}

	public void setMontoMinimo(double montoMinimo) {
		this.montoMinimo = montoMinimo;
	}

}
