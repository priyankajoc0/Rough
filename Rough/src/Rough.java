import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Rough {

	public static void main(String[] args) 
	{
		String str= "My my name my is IS riya";
		
		String[] words =  str.split(" ");
		
		TreeSet<String> set = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		
		LinkedHashSet<String> linked = new LinkedHashSet<String>();
		
        for(int i=0;i<words.length;i++)
        {
        	set.add(words[i]);
        }
      //  System.out.println(set);  // [is, My, name, riya]
        
       
       String distinctString = "";
       
       for(String word : set)
       {
    	   distinctString = distinctString + word +" ";
       }
      // System.out.println(distinctString);  // is My name riya 
       
        
       String finalString="";
       for(int i = 0 ; i < words.length ;i++)
       {
    	   if(!linked.contains(words[i]))
    	   {
    		   if(distinctString.contains(words[i]))
    		   {
    			   finalString = finalString + words[i] +" ";
    		   }
    	   }
       }
       System.out.println("final string :  "+finalString);
       
	}
}
