package example.dao;

import example.model.Student;

public interface StudentDAO {
	
	Student findStudent(long studentRollNum);

	boolean updateStudent(Student student);

}
