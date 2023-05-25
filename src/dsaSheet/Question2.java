package dsaSheet;

public class Question2 {
	
	
	public static void reverseArray(int arr[],int start,int end)
    {
        // Reverse the string str
		 int temp = 0;
		 
		 while (start < end)
	        {
	            temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	           
	        }
	    }    
		
	 static void printArray(int arr[],int size)
	 {
		 for (int i = 0; i < size; i++)
			 
			System.out.print(arr[i] + " ");
		 	System.out.println();
	 }

//	 public static String reverseWord(String str)
//	 {
//	      String reversedStr = "";
//	     for(int i=str.length()-1; i>=0; i--) {
//	         reversedStr = str.charAt(i);
//	     }
//	     return reversedStr;
//	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[] = {4,5,9,7,3};
//		 printArray(arr, 5);
//	        reverseArray(arr, 0,4);
//	        System.out.print("Reversed array is \n");
//	        printArray(arr, 5);
	String s = "Geeks";
	System.out.println(reverseWord(s));
	
	}

}
