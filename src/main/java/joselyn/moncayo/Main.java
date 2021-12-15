package joselyn.moncayo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("com/uce/edu/archivo/beans.xml");
		Profesor profesor = (Profesor) app.getBean("profesor");
		
		System.out.println("profesor "+profesor.getNombre()+" "+profesor.getApellido()+" "+profesor.getProfesion()+" "+profesor.getUniversidad());

		Paciente pc= (Paciente) app.getBean("paciente");
		System.out.println("paciente "+pc.getNombre()+" "+pc.getApellido()+" "+pc.getEdad());

	}

}
