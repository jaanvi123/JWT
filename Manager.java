
public class Manager extends Employee{

	public Manager() {
		super();
		}

	public Manager(long employeeId, long employeephone, String employeeName, String employeeAddress, double salary) {
		super(employeeId, employeephone, employeeName, employeeAddress);
		
		super.basicSalary = salary;
		
	}
@Override
public double transportAllowance() {
	return super.basicSalary*0.15;
}
	
}
