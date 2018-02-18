
public class Quiz9_2 {
	
	
	   static void bubbleSort(int[] arr) {  
	        int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         }  
	  
	    }  

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int[] arr = {3,60,35,2,45,320,5};  
		System.out.print("The initial array is: ");
		for (Integer i:arr)
			System.out.print(i + " ");
		System.out.println();
		bubbleSort(arr);
		System.out.print("The sorted array is: ");
		for (Integer i:arr)
			System.out.print(i + " ");
		System.out.println();
		
		System.out.println("The SECOND biggest number in array is: " + arr[arr.length-2]);
		

}
}
