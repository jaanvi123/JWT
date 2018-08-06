
public class Trainee extends Employee{

	public Trainee()
	{
		super();
	}

	public Trainee(long employeeId, long employeephone, String employeeName, String employeeAddress, double salary) {
		super(employeeId, employeephone, employeeName, employeeAddress);
		
		super.basicSalary = salary;
		
	}
	
	@Override
	public double transportAllowance() {
		return super.basicSalary*0.1;
	}
	
	
}
