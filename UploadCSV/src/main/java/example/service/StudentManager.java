package example.service;

import example.model.Student;

public interface StudentManager {

	Student findStudent(long studentRollNum);

	void updateStudent(Student student);
}
