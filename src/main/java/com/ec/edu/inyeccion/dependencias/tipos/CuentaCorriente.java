package com.ec.edu.inyeccion.dependencias.tipos;

public class CuentaCorriente implements ICuenta {
	private float montoMinimo;

	@Override
	public void calcularDescuento(String numero) {
		System.out.println("Calculando .....");
	}

	@Override
	public void calcularBeneficio() {
		System.out.println("Calculando beneficio corriente");
	}

	// metodos set y get

	public float getMontoMinimo() {
		return montoMinimo;
	}

	public void setMontoMinimo(float montoMinimo) {
		this.montoMinimo = montoMinimo;
	}

}
