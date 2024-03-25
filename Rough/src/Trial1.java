import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Trial1 {

	public static void main(String[] args) 
	{
		int a[] = {0,5,6,4,78,0,2,0,3};
		int count =0;
		
		for(int i =0;i<a.length ;i++)
		{
			if(a[i]!=0)
			{
				a[count++] = a[i];
			}
		}
		
		for(int i=count ;i<a.length ;i++)
		{
			a[i]=0;
		}
		
		System.out.println(Arrays.toString(a));
	}
	
	//mtd by sarmistha
	public void sarinQA() {
		
		//here i need to write code for qa branch
		
	}
	

	//new mtd in p-develop
		public void newMTdinDev() {
			
			
		}

	
}
