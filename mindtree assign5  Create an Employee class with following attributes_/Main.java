import java.util.*;
class Employee
{
	 String EmpName;
	 int EmpId;
	 String EmpDept;
	 String EmpDesgn;
	
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	
	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public void setEmpDept(String empDept) {
		EmpDept = empDept;
	}	
		public void setEmpDesgn(String empDesgn) {
		EmpDesgn = empDesgn;
	}
	
	public String getEmpName() {
		return EmpName;
	}
	public int getEmpId() {
		return EmpId;
	}
		public String getEmpDept() {
		return EmpDept;
	}
	public String getEmpDesgn() {
		return EmpDesgn;
	}
	

	public Employee() {
	}
	public Employee(String empName,String empDept, String empDesgn, int empId) {
		EmpName = empName;
		EmpId = empId;
		EmpDept = empDept;
		EmpDesgn = empDesgn;
	}
}
public class Main{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
Employee e= new Employee();	
e.setEmpName("Sai Sneha");
e.setEmpId(1001);
e.setEmpDept("CSE");
e.setEmpDesgn("SDE");
System.out.println(e.getEmpName());
System.out.println(e.getEmpId());
System.out.println(e.getEmpDept());
System.out.println(e.getEmpDesgn());
}
}
