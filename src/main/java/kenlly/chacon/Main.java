package kenlly.chacon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("com/uce/edu/archivo/beans.xml");//Ruta de nuestro archivo beans
		
		Paciente pacien =(Paciente) app.getBean("paci");
		System.out.println(pacien.getNombre() + " " + pacien.getApellido() + " " +pacien.getEdad());
		
		Profesor profe =(Profesor) app.getBean("pro");
		System.out.println(profe.getNombre() + " " + profe.getApellido() + " " + profe.getProfesion() + " " + profe.getUniversidad());
		
	}

}
