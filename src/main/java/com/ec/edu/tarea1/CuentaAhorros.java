package com.ec.edu.tarea1;

public class CuentaAhorros extends CuentaBancaria {
	private double porcentajeDescuento;
	
	public void calcularvalorInteres() {
		this.valInteres = this.saldo *10/100;
		System.out.println("Interes calculado: " + valInteres);
	}

	// metodos get y set
	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

}
