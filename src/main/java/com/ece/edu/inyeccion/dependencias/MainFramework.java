package com.ece.edu.inyeccion.dependencias;

import java.util.Scanner;


public class MainFramework {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese nombre");
		String nombre = scanner.nextLine();

		System.out.println("Ingrese apellido");
		String apellido = scanner.nextLine();

		System.out.println("Ingrese calle");
		String calle = scanner.nextLine();

		System.out.println("Ingrese numeracion");
		String numeracion = scanner.nextLine();

		Matricula matricula = new Matricula(new Estudiante(), new Direccion());
		matricula.setAnio(2015);

		matricula.setSemestre("Sexto");

		String mensaje = matricula.matricular(nombre, apellido, calle, numeracion);
		System.out.println(mensaje);

	}

}
