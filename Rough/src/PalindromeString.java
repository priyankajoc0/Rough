import java.util.Scanner;

public class PalindromeString {

	public static String checkpalin(String strString)
	{
			//String str = "mom";
				Scanner sc = new  Scanner(System.in);
				System.out.println("enter a string");
				
				String str= sc.next();
				String rev = "";
				
				for(int i= str.length()-1; i>=0; i--)
				{
					rev = rev + str.charAt(i);
				}
				
				if(rev.equalsIgnoreCase(str)) 
				{
				System.out.println("palindrome");	
				}
				else
					System.out.println("no palindrome");
				
		return null;
	}
	
	public static void main(String[] args) 
	{
		PalindromeString obj = new PalindromeString();
		obj.checkpalin("check this ");
		
	}

}
