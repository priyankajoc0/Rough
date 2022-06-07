import java.util.Arrays;

public class ShiftAllZeroArray {

	public static void main(String[] args) 
	{
		int [] arr= {12, 0 , 54 , 89 , 0, 0 , 120};
		
		 int count = 0;
		
	        for (int i= 0 ; i<arr.length ; i++)
	        {
	            if (arr[i] != 0) 
	            {
	                arr[count++] = arr[i];
	            }
	        }
	        
	        
	        for (int i = count; i < arr.length; i++) 
	        {
	            arr[i] = 0;
	        }
	
	        //System.out.println(Arrays.toString(arr));
	        
	        for(int num : arr)
	        {
	        	System.out.print(num+" ");
	        }
	}

}
