package dsa_Array2;

public class Solution {
	
	public static int consecutiveOnes(int arr[],int n) 
	{
		int curValue = 0;
		int maxValue =0;
		
		for(int e:arr) {
			if(e==0) {
				maxValue = Math.max(curValue, maxValue);
				curValue=0;
			}else {
				curValue++;
			}
		}
		maxValue = Math.max(curValue, maxValue);
		return maxValue;
	}
//	
//	public static void frequencyOfAnElement(int arr[],int n)
//	{
//	    int frequency = 1;
//	    for(int i = 1; i < arr.length;i++ )
//	    {
//	    	if(arr[i-1] == arr[i])
//	    	{
//	    		frequency++;
//	    	}else {
//	    		 System.out.println("Frequency of "
//                         + arr[i - 1]
//                         + " is: " + frequency);
//                      frequency = 1;
//	    	}
//	    }
//	    System.out.println("Frequency of "
//                + arr[n - 1]
//                + " is: " + frequency);
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int arr[]= {1,1,1,0,0,1,0,1,1,1,1,0,1};
		int n = arr.length;
		//frequencyOfAnElement(arr,n);
		System.out.println(consecutiveOnes(arr,n));
	}

}
