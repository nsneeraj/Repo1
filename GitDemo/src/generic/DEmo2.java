package generic;

import java.util.HashSet;
import java.util.Set;

public class DEmo2 {

	public static void main(String[] args) {
		String s = "Neeraj";
System.out.println();
	}
	public static String removeDup(String str) {
		
		Set S = new HashSet();
		StringBuffer sf = new StringBuffer();
		
		for(int i =0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(!S.add(c)) {
				S.add(c);
				sf.append(c);
				
			}
		}
		
		
		
		
		return sf.toString();
		
	}

}
