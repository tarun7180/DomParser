package example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import example.dao.StudentDAO;
import example.model.Student;
import example.service.StudentManager;

@Service
public class StudentManagerImpl implements  StudentManager{

	@Autowired
	StudentDAO studentDAO;
	
	@Override
	public Student findStudent(long studentRollNum){
		return studentDAO.findStudent(studentRollNum);
	}
	
	@Override
	public void updateStudent(Student student){
		Student existingStudent = studentDAO.findStudent(student.getRollNumber());
		if(existingStudent != null){
			existingStudent.setStudentName(student.getStudentName());
			studentDAO.updateStudent(existingStudent);
		}else{
			studentDAO.updateStudent(student);
		}
		
	}
	
}
