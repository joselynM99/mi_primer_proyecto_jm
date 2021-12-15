package com.ec.inyeccion.dependencias.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("com/uce/edu/archivo/beans.xml");
		Cuenta miCuenta = (Cuenta) app.getBean("cuenta");
		// app.getBean(Cuenta.class);
		System.out.println(miCuenta.getNumero());
		System.out.println(miCuenta.getSaldo());

		/*
		 * Codigo Acoplado: Cuenta miCuentaP = new Cuenta("131299",100);
		 */

		Cuenta miCuenta1 = (Cuenta) app.getBean("cuenta1");
		System.out.println(miCuenta1.getNumero());
		System.out.println(miCuenta1.getSaldo());
		
		//IoC por Constructor
		Estudiante estu= (Estudiante) app.getBean("estu");
		System.out.println(estu.getNombre()+" "+estu.getApellido()+" "+estu.getEdad());

	}

}
