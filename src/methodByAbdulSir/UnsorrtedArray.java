package methodByAbdulSir;

public class UnsorrtedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {2,4,5,9,7};
		int i = 0;
		int right = a[i];
		int left = a.length;
		int min = Integer.MAX_VALUE;
		for (i =0; i < a.length; i++) {
			int sub = right - left;
			if(min > sub) {
				min = sub;
			}
		}
		System.out.print(min);

	}

}
