package com.ec.edu.tarea1;

import java.util.Scanner;

public class MainFramework {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner scannerInt = new Scanner(System.in);
		System.out.println("Ingrese nombre");
		String nombre = scanner.nextLine();

		System.out.println("Ingrese apellido");
		String apellido = scanner.nextLine();

		System.out.println("Ingrese cedula");
		int cedula = scannerInt.nextInt();

		System.out.println("Ingrese número de cuenta");
		int numCuenta = scannerInt.nextInt();

		System.out.println("Ingrese tipo de cuenta");
		int tipo = scannerInt.nextInt();

		CuentaBancaria cuenta;

		if (tipo == 1) {
			cuenta = new CuentaBancaria();
		} else if (tipo == 2) {
			cuenta = new CuentaAhorros();
		} else if (tipo == 3) {
			cuenta = new CuentaCorriente();
		} else {
			cuenta = new CuentaPoliza();
		}

		GestorCuenta gestorcuenta = new GestorCuenta(new CuentaHabiente(), cuenta);

		String mensaje = gestorcuenta.aperturarCuenta(nombre, apellido, cedula, numCuenta);
		System.out.println(mensaje);

	}

}
