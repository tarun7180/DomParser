package tarun.dto;

import java.io.Serializable;

public class EmployeeDto implements Serializable{

	private static final long serialVersionUID = -760805066769173656L;

    private Long empId;
	
    private String empName;

    private int empAge;
	
    private String phoneNumber;

	public EmployeeDto() {
		super();
	}

	public EmployeeDto(Long empId, String empName, int empAge,
			String phoneNumber) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.phoneNumber = phoneNumber;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
