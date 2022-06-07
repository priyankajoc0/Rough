import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) 
	{
		
		int arr [] = {0, 89 , 56 ,0 ,14 , 0, 23, 7};
		int pos =0;
		
		for(int i = 0 ; i<arr.length ;i++)
		{
			if(arr[i]!=0)
			{
				arr[pos++] = arr[i];
			}
		}	
		
		for(int i=pos ; i<arr.length;i++)
		{
			arr[i] = 0;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
