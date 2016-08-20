package tarun.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id", nullable = false)
    private Long empId;
	
	@Column(name = "emp_name", nullable = false)
    private String empName;

	@Column(name = "age", nullable = false)
    private int empAge;
	
	@Column(name = "gender", nullable = false)
    private String empGender;
	
	@Column(name = "phone_number", nullable = false)
    private String phoneNumber;
	
	@Column(name = "address", nullable = false)
    private String empAddress;

	public Employee() {
		super();
	}

	public Employee(Long empId, String empName, int empAge, String empGender,
			String phoneNumber, String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empGender = empGender;
		this.phoneNumber = phoneNumber;
		this.empAddress = empAddress;
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

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

}
