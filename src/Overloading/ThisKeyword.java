package Overloading;

public class ThisKeyword {
	
	int empid;
	String empname;
	int empage;
	
	void display(int empid,String empname,int empage) {
		//this.empid = empid;
		this.empname = empname;
		this.empage = empage;
		System.out.println(this.empid = empid);
		System.out.println(empname);
		System.out.println(empage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword obj = new ThisKeyword();
		obj.display(101, "Anjali", 33);
		
		
		
	}

}
