package tarun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import tarun.dao.EmployeeDao;
import tarun.service.EmployeeManager;

@Service
public class EmployeeManagerImpl implements EmployeeManager{

	@Autowired
	EmployeeDao employeeDao;
	
	//@Override
	public String getEmployeeList() {
		Gson gsonObj = new Gson();
		List<? extends Object> employeeList = employeeDao.getEmployeeList();
		return gsonObj.toJson(employeeList);
	}

}
