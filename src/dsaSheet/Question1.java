package dsaSheet;

public class Question1 {
	
	public static int findSum(int A[],int N) 
    {
		 int max = Integer.MIN_VALUE;
	        int min = Integer.MAX_VALUE;
	        for(int i=0;i<N;i++)
	        {
	            if(A[i]>max)
	            {
	                max = A[i];
	            }
	        }
	           for(int i=0;i<N;i++)
	        {
	        	   
	            if(A[i]<min)
	            {
	                min = A[i];
	            }
	        }
	        return max+min;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int	a[] = {1,3,4,1};
			int n = a.length;
			System.out.println(findSum(a,n));
	}
}
