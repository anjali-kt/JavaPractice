package Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[3][2];
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[2][0]=50;
		a[2][1]=60;
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=1;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		//using for each loop
		
		for(int k[]:a) {
			for(int l:k) {
				System.out.print(l+" ");
			}
			System.out.println();
		}
		
		int b[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
		for(int i[]:b) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}	

	}

}
