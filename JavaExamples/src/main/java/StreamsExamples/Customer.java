package StreamsExamples;

public class Customer {
	
	private String name;
	
	private int age;
	
	private int vehicleNumber;

	public Customer(String name, int age, int vehicleNumber) {
		super();
		this.name = name;
		this.age = age;
		this.vehicleNumber = vehicleNumber;
	}

	public Customer() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	
	

}
