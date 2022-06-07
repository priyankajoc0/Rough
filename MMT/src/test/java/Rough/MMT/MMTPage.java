package Rough.MMT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

public class MMTPage {

	public static void main(String[] args) 
	
	{
		
		// just for constructing a sample list
		String str = "Kobe Is is The the best player In in Basketball basketball game .";
		List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));

		// the actual operation
		TreeSet<String> seen = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		list.removeIf(s -> !seen.add(s));

		// just for debugging
		System.out.println(String.join(" ", list));		
				
	}

}
