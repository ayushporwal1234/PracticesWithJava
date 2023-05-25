package dsa_Array2;

public class LectureQuestion {
	
	
//	public static void isLeader(int arr[], int n)
//		{
//			int maxValue = Integer.MIN_VALUE;
//			for(int i = arr.length-1; i >=0;i--)
//			{
//				if(arr[i] > maxValue)
//				{
//					maxValue = arr[i];
//				}
//			}
//			System.out.println(maxValue);
//		}
	
//	public static int maxSumSubArray(int a[],int n)
//	{
//		int curSum = 0;
//		int maxSum = Integer.MIN_VALUE;
//		for(int i = 0; i<a.length;i++)
//		{
//				curSum +=a[i];
//				if(curSum > maxSum) maxSum = curSum;
//				if(curSum < 0) curSum = 0;
//				
//		}
//		return maxSum;
//	}

//	public static int ContainMostWater(int a[],int n) 
//	{
//		int left = 0;
//		int right = a.length-1;
//		int maxArea =0;
//		while(left < right)
//		{
//			int height = Math.min(a[left], a[right]);
//			int distance = right-1;
//			int area = height*distance;
//			System.out.println(distance);
//			maxArea = Math.max(maxArea, area);
//			if(a[left] < a[right]) {
//				left++;
//			} else {
//				right--;
//			}
//			}
//		return maxArea;
//		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int arr [] = {-1 -2 -3 -4};
		int n = arr.length;
		//isLeader(arr,n);
//		System.out.println(maxSumSubArray(arr,n));
//		System.out.println(ContainMostWater(arr,n));
//		System.out.println(arr.length);
		
	}

}
