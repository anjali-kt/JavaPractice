package oops;

public class Employee_Constructor {
	int empid;
	String empname;
	int salary;
	int deptno;
	
	Employee_Constructor (int id, String name, int sal, int dno){
		empid = id;
		empname = name;
		salary = sal;
		deptno = dno;		
	}
	
	void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}
	
	public static void main(String args[]) {
	Employee_Constructor emp1 = new Employee_Constructor(101,"Priyan",1000,10);
	emp1.display();
	}
}
