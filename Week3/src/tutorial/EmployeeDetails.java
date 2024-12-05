package tutorial;

abstract class Employee{
	abstract void calculateSalary();
	
	void getDetails() {
		
	}
}

class FullTimeEmployee extends Employee{
	
	double monthlySalary;
	int month;
	
	FullTimeEmployee(int month, double monthlySalary){
		this.month = month;
		this.monthlySalary = monthlySalary;
	}
	
	@Override
	void calculateSalary() {
		System.out.println("Calculated Salary: " + (month * monthlySalary));
	}
	
}

class PartTimeEmployee extends Employee{
	double hourlyWage, workHour;
	
	PartTimeEmployee(double hourlywage,double workHour){
		this.hourlyWage = hourlywage;
		this.workHour = workHour;
	}
	
	@Override
	void calculateSalary() {
		System.out.println("PartTime Salary Rs " + (hourlyWage*workHour));
	}
}


public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartTimeEmployee pte = new PartTimeEmployee(10000, 7);
		pte.calculateSalary();
		
		FullTimeEmployee fte = new FullTimeEmployee(12, 70000);
		fte.calculateSalary();
	}

}
