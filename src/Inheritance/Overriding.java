package Inheritance;

class Bank{
	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank{
	int getRateOfInterest() {
		return 10;
	}
}

class ICICI extends Bank{
	int getRateOfInterest() {
		return 15;
	}
}

class Axis extends Bank{
	int getRateOfInterest() {
		return 12;
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sobj = new SBI();
		System.out.println(sobj.getRateOfInterest());
		ICICI iobj = new ICICI();
		System.out.println(iobj.getRateOfInterest());
		Axis aobj = new Axis();
		System.out.println(aobj.getRateOfInterest());
		}

}
