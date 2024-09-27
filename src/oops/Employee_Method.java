package oops;

public class Employee_Method
{
	int empid;
	String empname;
	int salary;
	int deptno;
	
	void setdata(int id, String name, int sal, int dno)
	{
		empid = id;
		empname = name;
		salary = sal;
		deptno = dno;
	}
	
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}
	
	public static void main(String args[])
	{
		Employee_Method emp1 = new Employee_Method();
		emp1.setdata(103, "Anjali", 1000, 10);
		emp1.display();
	}

}
