package tarun.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import tarun.dao.EmployeeDao;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@PersistenceContext(unitName = "testPU")
	  private EntityManager entityManager;
	
	public List<?> getEmployeeList() {
		String queryStr = "select new tarun.dto.EmployeeDto(emp.empId,emp.empName,emp.empAge,emp.phoneNumber) from Employee emp";
		Query queryObj = entityManager.createQuery(queryStr);
	    List<?> dataList = queryObj.getResultList();
	    return dataList;
	}

}
