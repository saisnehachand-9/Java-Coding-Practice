import java.util.*;

public class Main {
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
Employee e= new Employee();	
System.out.println("Enter Employee name");
String name=sc.nextLine();
System.out.println("Enter Employee Id");
int id=sc.nextInt();
System.out.println("Enter Employee Dept");
String dept=sc.next();
System.out.println("Enter Employee Designation");
String desg=sc.next();
e.setEmpName(name);
e.setEmpId(id);
e.setEmpDept(dept);
e.setEmpDesgn(desg);
System.out.println(e.getEmpName());
System.out.println(e.getEmpId());
System.out.println(e.getEmpDept());
System.out.println(e.getEmpDesgn());
}
}
class Employee
{
	public String EmpName;
	public int EmpId;
	public String EmpDept;
	public String EmpDesgn;
	public Employee() {
	}
	public Employee(String empDept, String empDesgn, int empId) {
		this.EmpName = null;
		this.EmpDept = empDept;
		this.EmpDesgn = empDesgn;
	this.EmpId = empId;
	}
	
public Employee(String empName,String empDept, String empDesgn) {
		this.EmpName = empName;
		this.EmpDept = empDept;
		this.EmpDesgn = empDesgn;
	this.EmpId = 0;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		if(empName==null)
			this.EmpName= "Enter valid Name";
		else
			this.EmpName = empName;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		this.EmpId = empId;
	}
	public String getEmpDept() {
		return EmpDept;
	}
	public void setEmpDept(String empDept) {
		if(empDept.equals("ttht") || empDept.equals("digital") || empDept.equals("rcm") || empDept.equals("devops"))
		this.EmpDept = empDept;
		else
			this.EmpDept="Invalid Dept";
	}	
	public String getEmpDesgn() {
		return EmpDesgn;
	}
	public void setEmpDesgn(String empDesgn) {
		if(empDesgn.equals("developer") || empDesgn.equals("tester")||empDesgn.equals("lead")||empDesgn.equals("manager"))
			this.EmpDesgn = empDesgn;
		else
			this.EmpDesgn="Invalid Designation";
	}
}
