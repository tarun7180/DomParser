package tarun.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="student_id",nullable=false)
	private Long studentId;
	
	@Column(name="roll_number",nullable=false)
	private Long rollNumber;
	
	@Column(name="student_name",nullable=false)
	private String  studentName;

	public Student() {
		super();
	}

	public Student(Long studentId, Long rollNumber, String studentName) {
		super();
		this.studentId = studentId;
		this.rollNumber = rollNumber;
		this.studentName = studentName;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Long rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
