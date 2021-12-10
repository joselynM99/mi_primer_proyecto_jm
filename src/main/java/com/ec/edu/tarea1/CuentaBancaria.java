package com.ec.edu.tarea1;

public class CuentaBancaria {
	protected int numCuenta;
	protected double saldo;
	protected double valInteres;
	protected CuentaHabiente cuentaHab;

	public void calcularvalorInteres() {
		this.valInteres = this.saldo *0/100;
		System.out.println("Interes calculado: " + valInteres);
	}

	// Métodos Set y Get
	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getValInteres() {
		return valInteres;
	}

	public void setValInteres(double valInteres) {
		this.valInteres = valInteres;
	}

	public CuentaHabiente getCuentaHab() {
		return cuentaHab;
	}

	public void setCuentaHab(CuentaHabiente cuentaHab) {
		this.cuentaHab = cuentaHab;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [numCuenta=" + numCuenta + ", saldo=" + saldo + ", valInteres=" + valInteres
				+ ", cuentaHab=" + cuentaHab + "]";
	}

}
