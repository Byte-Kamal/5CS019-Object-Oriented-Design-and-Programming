package tutorial;

class Employeee{
	private int empId;
	String empName;
	
	Employeee(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}
	
	void setEmpId(int empId) {
		this.empId = empId;
	}
	
	int getEmpId() {
		return empId;
	}
	
}

public class EmployeeExample {

	public static void main(String[] args) {
		Employeee e1 = new Employeee(1, "Kamal");
		System.out.println(e1.empName);
		System.out.println(e1.getEmpId());
	}

}
