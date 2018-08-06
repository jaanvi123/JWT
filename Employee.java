
public abstract class Employee {

	private long employeeId, employeephone;
	private String employeeName, employeeAddress;
	protected double basicSalary;
	private double specialAllowance, hra;
	
	public Employee()
	{
		specialAllowance = 250.80;
		hra = 1000.50;
	}
	
	
	
	public Employee(long employeeId, long employeephone, String employeeName, String employeeAddress) {
		this();
		this.employeeId = employeeId;
		this.employeephone = employeephone;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}

	public double calculateSalary()
	{
		double salary = basicSalary + (basicSalary * (specialAllowance / 100)) + (basicSalary * (hra / 100));
		return salary;
	}


	long getemployeeId() {
		return employeeId;
	}
	
	public abstract double transportAllowance();
	
}
