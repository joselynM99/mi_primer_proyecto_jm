package joselyn.moncayo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("com/uce/edu/archivo/beans.xml");
		Profesor profesor = (Profesor) app.getBean("profesor");
		
		System.out.println(profesor.getNombre()+" "+profesor.getApellido()+" "+profesor.getProfesion()+" "+profesor.getUniversidad());

		Estudiante estu= (Estudiante) app.getBean("estudiante");
		System.out.println(estu.getNombre()+" "+estu.getApellido()+" "+estu.getEdad());

	}

}
