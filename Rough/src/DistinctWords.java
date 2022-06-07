import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DistinctWords {

	public static void main(String[] args) 
	{
		int [] a= {12, 0 , 54 , 89 , 0, 0 , 120};
		
		int pos= a.length-1;
		for( int i=a.length-1; i>=0; i-- )
		{
			if(a[i]!=0)
			{
				a[pos--]= a[i];
			}
			
		}
		for( int i= pos;i>=0 ;i-- )
		{
			a[i]=0;
		}
		
       System.out.println(Arrays.toString(a));
	}
}
