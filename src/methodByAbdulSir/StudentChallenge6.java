package methodByAbdulSir;

public class StudentChallenge6 {
	
//	 static boolean isPrimeNumber(int n) {
//		   for(int i =2;i<n;i++) {
//			   if(n % i ==0) return false;
//				  
//		   }return true;
//	 }
	
//	static int greaterCommonDivisior(int m,int n) {
//		while(m!=n) {
//			if(m > n) m = m - n;
//				else n = n - m;   
//		}
//		return m;
//		
//	}
	
	static int maxElementinArray(int a[]) {
		int i;
		for(i = 0; i<a.length;i++) {
			if(a[i]>a[i+1]) 
				{
				return a[i];
				}
		}
		return a[i+1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,9,4,6};
			System.out.println(maxElementinArray(a));
		
	}

}
