package Arrays;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object a[] = new Object[5];
		a[0]=10;
		a[1]=20.5;
		a[2]="Welcome";
		a[3]='a';
		a[4]=true;
		for(Object i:a) {
			System.out.println(i);
		}

	}

}
