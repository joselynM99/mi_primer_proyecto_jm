package com.edu.ec.dependencias;

import java.util.Scanner;

public class MainUce {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner scannerInt = new Scanner(System.in);
		System.out.println("Ingrese nombre");
		String nombre = scanner.nextLine();

		System.out.println("Ingrese apellido");
		String apellido = scanner.nextLine();

		System.out.println("Ingrese calle");
		String calle = scanner.nextLine();

		System.out.println("Ingrese numeracion");
		String numeracion = scanner.nextLine();
		
		System.out.println("Ingrese tipo");
		int tipo = scannerInt.nextInt();

		Matricula matricula = new Matricula();
		matricula.setAnio(2015);

		matricula.setSemestre("Sexto");

		String mensaje = matricula.matricular(nombre, apellido, calle, numeracion, tipo);
		System.out.println(mensaje);

	}

}
