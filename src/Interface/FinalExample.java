package Interface;

public class FinalExample {
	final int i = 10;
	final void m1() {
		System.out.println(i);
	}
	
	class Test123 extends FinalExample{
		//void m1() {
			//throws error as we cannot override a final method
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
