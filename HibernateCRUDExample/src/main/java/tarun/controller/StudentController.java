package tarun.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import tarun.service.StudentManager;

@Transactional
public class StudentController {

	public static void main(String[] args) { 
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"spring.xml");
		
		StudentManager stManager = (StudentManager) appContext.getBean("studentManagerImpl");
		
		stManager.createStudent();
		
		System.out.println("Student data is entered in DB");
		
		stManager.findStudent();
		
		System.out.println("Found Student data in DB");
		
		stManager.updateStudent();
		
		System.out.println("Updted student data in DB");
	}
}
