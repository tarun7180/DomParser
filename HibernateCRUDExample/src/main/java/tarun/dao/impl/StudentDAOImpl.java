package tarun.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tarun.dao.StudentDAO;
import tarun.model.Student;


@Repository
public class StudentDAOImpl implements StudentDAO{

	@PersistenceContext(unitName="testPU")
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public Student findStudent(long studentId){
		Student studentObj = entityManager.find(Student.class, studentId);
		return studentObj;
	}
	
	@Override
	@Transactional
	public boolean updateStudent(Student student){
		entityManager.merge(student);
		return true;
	}
	
	@Override
	@Transactional
	public void createStudent(Student student) {
		entityManager.persist(student);
	}
}
