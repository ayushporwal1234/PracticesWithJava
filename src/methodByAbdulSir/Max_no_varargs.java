package methodByAbdulSir;

public class Max_no_varargs {
	
/**	static int maxNumber(int ...A) {
//		int i ;
//		if(A.length == 0) return Integer.MIN_VALUE;
//		for(i = 0; i < A.length ;i++) {
//			if(A[i] > A[i+1]) 
//				return A[i];
//		}
//		return A[i+1];
	} **/
	
	// Sum Of All varargs
	 
//	static int Sum_All_varargs(int ...a) {
//		int i;
//		if (a.length == 0) return Integer.MIN_VALUE;
//		int sum =0;
//		for (i =0 ; i < a.length;i++) {
//			sum = sum + a[i];
//		} return sum;
//	}  

	/**  Calculate Discount Amount
	 Discount = 100 × (Original price - Discounted price) / Original price .
	 **/
	
	static double sum(double ...P)
    {
        double sum=0;
        
        for(int i=0;i<P.length;i++)
            sum+=P[i];
        
        if(sum<500) return sum*0.10;
        else if(sum>=500 && sum<1000) return sum*0.15;
        else return sum*0.20;
        
    }

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
	//System.out.println(maxNumber(4,5,5,8,27,1));
		
		//System .out.println(Sum_All_varargs(40,90,2,8,6));
		
		System.out.println(sum(50));
	}

}
