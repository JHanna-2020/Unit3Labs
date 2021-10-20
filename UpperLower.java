//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

import java.util.Locale;

public class UpperLower
{
   public static String go( String a, boolean b )
	{
		String firstLetter = a.substring(0,1);
		if(b==true){
			return a.toUpperCase();
		}
		return a.toLowerCase();
	}
}