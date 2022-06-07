import java.util.Scanner;

public class PatternNumber {

	public static void main(String[] args) 
	{
		
		int i, j, k = 1;  
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows: ");
		int number =sc.nextInt();
		
		for (i = 1; i <= number ; i++)   
		{  
			for (j = 1; j< i + 1; j++)   
			{  
				System.out.print(k++ + " ");  
			}  
			System.out.println();  
		}
	}

}
