package tarun.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tarun.service.EmployeeManager;

public class EmployeeExample {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"spring.xml");
		EmployeeManager emManager = (EmployeeManager) appContext.getBean("employeeManagerImpl");
		System.out.println(emManager.getEmployeeList());
	}

}
