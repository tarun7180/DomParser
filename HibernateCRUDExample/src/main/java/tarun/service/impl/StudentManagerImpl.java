package tarun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tarun.dao.StudentDAO;
import tarun.model.Student;
import tarun.service.StudentManager;

@Service
public class StudentManagerImpl implements  StudentManager{

	@Autowired
	StudentDAO studentDAO;
	
	@Override
	public void findStudent(){
		Student studentObj = studentDAO.findStudent(1L);
		System.out.println("Found student name: "+studentObj.getStudentName());
	}
	
	@Override
	public void updateStudent(){
		Student existingStudent = studentDAO.findStudent(1L);
		if(existingStudent != null){
			existingStudent.setStudentName("student2");
			studentDAO.updateStudent(existingStudent);
		}
	}
	
	@Override
	@Transactional
	public void createStudent() { 
		
		Student studentObj = new Student();
		studentObj.setRollNumber(1L);
		studentObj.setStudentName("student1");
		studentDAO.createStudent(studentObj);
	}
}
