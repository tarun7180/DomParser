package example.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import example.dao.StudentDAO;
import example.model.Student;

@Repository
public class StudentDAOImpl implements  StudentDAO{

	@PersistenceContext(unitName="testPU")
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public Student findStudent(long studentRollNum){
		String queryStr = "select st from Student st where st.rollNumber=:rollNum";
		Query queryObj = entityManager.createQuery(queryStr).setParameter("rollNum", Long.valueOf(studentRollNum));
		@SuppressWarnings("unchecked")
		List<Student> studentList = queryObj.getResultList();
		if(studentList.size()>0){
			return studentList.get(0);
		}else{
			return null;
		}
	}
	
	@Override
	@Transactional
	public boolean updateStudent(Student student){
		entityManager.merge(student);
		return true;
	}
}
