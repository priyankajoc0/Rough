import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShiftZeros {

	public static void main(String[] args) 
	{
		
		int [] a= {12, 0 , 54 , 89 , 0, 0 , 120};
		
		ArrayList al = new ArrayList();
		ArrayList al2 = new ArrayList();
		
		for(int i=0; i<a.length ; i++)
		{
			if(a[i]!=0)
			{
				al.add(a[i]);
			}
			else 
				al2.add(a[i]);
		}
		//System.out.println(al);  //[12, 54, 89, 120]
		//System.out.println(al2);  //[0, 0, 0]
		
		Object al3 =Stream.concat(al.stream(), al2.stream()).collect(Collectors.toList());
		
		System.out.println(al3 ); 
		
		
	}

}
