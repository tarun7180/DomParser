package tarun.dao;

import tarun.model.Student;

public interface StudentDAO {
	
	Student findStudent(long studentRollNum);

	boolean updateStudent(Student student);

	void createStudent(Student student);

}
